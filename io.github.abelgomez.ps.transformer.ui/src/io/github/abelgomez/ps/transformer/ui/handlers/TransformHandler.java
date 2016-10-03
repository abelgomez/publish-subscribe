package io.github.abelgomez.ps.transformer.ui.handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;

import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;
import io.github.abelgomez.ps.transformer.PublishSubscribeTransformer;
import io.github.abelgomez.ps.transformer.ui.TransformerUiPlugin;
import io.github.abelgomez.ps.transformer.ui.util.UriConverter;

public class TransformHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			List<UmlModel> models = collectModels(structuredSelection);
			Job job = new TransformationJob(models);
			job.schedule();
		}

		// Return value must be null
		return null;
	}

	private List<UmlModel> collectModels(IStructuredSelection structuredSelection) {
		Set<URI> processed = new HashSet<>();
		List<UmlModel> models = new ArrayList<>();

		for (Object obj : structuredSelection.toList()) {
			// Collect models to be transformed, to avoid processing the
			// same Resource several times
			UmlModel model = Platform.getAdapterManager().getAdapter(obj, UmlModel.class);
			URI uri = model.getResource().getURI();
			if (!processed.contains(uri)) {
				models.add(model);
				processed.add(uri);
			}
		}
		return models;
	}

	/**
	 * {@link Job} in charge of transforming a set of Resources into Petri nets
	 * 
	 * @author agomez
	 *
	 */
	private final class TransformationJob extends Job {

		private static final String CPNTOOLS_FILE_EXTENSION = "cpn";

		private static final String JOB_NAME = "Converting to Petri nets";

		private MultiStatus globalStatus;

		private List<UmlModel> models = new ArrayList<>();

		private TransformationJob(List<UmlModel> models) {
			super(JOB_NAME);
			this.models.addAll(models);
		}

		@Override
		public IStatus run(IProgressMonitor monitor) {
			globalStatus = new MultiStatus(TransformerUiPlugin.PLUGIN_ID, 0, getName(), null);
			SubMonitor subMonitor = SubMonitor.convert(monitor, getName(), 3);
			List<Element> elements = collectElements(models, subMonitor.newChild(1));
			transformElements(elements, subMonitor.newChild(1));
			refreshWorkspace(subMonitor.newChild(1));
			return globalStatus;
		}

		private void refreshWorkspace(IProgressMonitor monitor) {
			Set<IContainer> containers = new HashSet<>();
			for (UmlModel model : models) {
				IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(UriConverter.toJavaUri(model.getURI()));
				for (IFile file : files) {
					containers.add(file.getParent());
				}
			}
			SubMonitor subMonitor = SubMonitor.convert(monitor, "Collecting elements to be transformed", containers.size());
			for (IContainer container : containers) {
				try {
					container.refreshLocal(IResource.DEPTH_ONE, subMonitor.newChild(1));
				} catch (CoreException e) {
					// Ignore refresh errors
				}
			}
		}

		private List<Element> collectElements(List<UmlModel> models, IProgressMonitor monitor) {
			SubMonitor subMonitor = SubMonitor.convert(monitor, "Collecting elements to be transformed", models.size());
			List<Element> elements = new ArrayList<>();
			for (UmlModel model : models) {
				subMonitor.subTask(NLS.bind("Processing model ''{0}''", model.getURI()));
				Resource resource = model.getResource();
				try {
					resource.load(Collections.emptyMap());
				} catch (IOException e) {
					globalStatus.add(new Status(IStatus.ERROR, TransformerUiPlugin.PLUGIN_ID, NLS.bind("Unable to load resource ''{0}''", resource), e));
				}
				Element element = retrieveUmlElement(resource);
				if (element != null) {
					elements.add(element);
				}
				subMonitor.worked(1);
			}
			return elements;
		}
		
		private Element retrieveUmlElement(Resource resource) {
			class ElementRetriever implements Runnable {
				private Element element;
				@Override
				public void run() {
					SelectElementDialog dialog = new SelectElementDialog(Display.getDefault().getActiveShell(), resource);
					if (dialog.open() == Dialog.OK) {
						element = dialog.getElement();
					}
				};
			}
			ElementRetriever retriever = new ElementRetriever();
			Display.getDefault().syncExec(retriever);
			return retriever.element;
		}
		
		private void transformElements(List<Element> elements, IProgressMonitor monitor) {
			SubMonitor subMonitor = SubMonitor.convert(monitor, "Transforming elements to Petri nets", elements.size());
			for (Element element : elements) {
				URI uri = element.eResource().getURI();
				subMonitor.subTask(NLS.bind("Transforming model ''{0}''", uri));
				File outFile = new File(buildOutputFileUri(uri).toFileString());
				processUmlModel(element, outFile, subMonitor.newChild(1));
				subMonitor.worked(1);
			}
		}
		
		private void processUmlModel(Element element, File out, IProgressMonitor monitor) {
			SubMonitor subMonitor = SubMonitor.convert(monitor, NLS.bind("Transforming ''{0}''", EcoreUtil.getURI(element)), 2);
			PublishSubscribeTransformer transformer = new PublishSubscribeTransformer(element);
			transformer.transform();
			subMonitor.worked(1);
			if (transformer.status().matches(IStatus.ERROR)) {
				globalStatus.add(transformer.status());
			} else {
				Cpnet cpn = transformer.result();
				CpnToolsBuilder builder = new CpnToolsBuilder(cpn);
				try (OutputStream stream = new FileOutputStream(out)) {
					builder.serialize(stream);
					subMonitor.worked(1);
				} catch (Throwable t) {
					globalStatus.add(new Status(IStatus.ERROR, TransformerUiPlugin.PLUGIN_ID, t.getLocalizedMessage(), t));
				}
			}
		}

		private URI buildOutputFileUri(URI uri) {
			return uri.trimFileExtension().appendFileExtension(CPNTOOLS_FILE_EXTENSION);
		}
	}

	/**
	 * Dialog used to select a UML {@link Element} from the given
	 * {@link Resource}
	 * 
	 * @author agomez
	 *
	 */
	private class SelectElementDialog extends TitleAreaDialog {

		private Resource resource;

		private Object selection;

		public SelectElementDialog(Shell shell, Resource resource) {
			super(shell);
			this.resource = resource;
		}

		@Override
		public void create() {
			super.create();
			int currentWidth = getShell().getSize().x;
			getShell().setSize(currentWidth > 640 ? 640 : currentWidth, 480);
			getShell().setText("Element Selection");
			setTitle("Select the UML element to transform");
			setMessage("Select the UML element to be transformed into a CPN Tools Petri net.\n"
					+ "It must be an Interaction, i.e., an element denoting a UML Sequence Diagram",
					IMessageProvider.INFORMATION);
			getButton(Dialog.OK).setEnabled(false);
		}

		@Override
		protected boolean isResizable() {
			return true;
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = (Composite) super.createDialogArea(parent);
			Composite container = new Composite(area, SWT.NONE);
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			container.setLayout(new GridLayout(2, false));

			Label resourceLabel = new Label(container, SWT.NONE);
			resourceLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
			resourceLabel.setText("Resource:");

			Text text = new Text(container, SWT.BORDER | SWT.FLAT | SWT.READ_ONLY);
			text.setText(UriConverter.toPlatformResourceUri(resource.getURI()).toString());
			text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

			TreeViewer viewer = new TreeViewer(container);
			viewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

			ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory);
			AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(composedAdapterFactory);

			viewer.setLabelProvider(labelProvider);
			viewer.setContentProvider(contentProvider);
			viewer.setInput(new ItemProvider(resource.getContents()));

			viewer.addFilter(new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return element instanceof Element;
				}
			});

			viewer.addSelectionChangedListener(new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection structuredSelection = (IStructuredSelection) event.getSelection();
						selection = structuredSelection.getFirstElement();
					}
					validateSelection();
				}
			});
			return area;
		}

		private void validateSelection() {
			if (!(selection instanceof Interaction)) {
				setErrorMessage("Selected element is not a UML Interaction");
			} else {
				setErrorMessage(null);
			}
		}

		@Override
		public void setErrorMessage(String newErrorMessage) {
			super.setErrorMessage(newErrorMessage);
			getButton(Dialog.OK).setEnabled(newErrorMessage == null);
		}

		public Element getElement() {
			return selection instanceof Element ? (Element) selection : null;
		}
	}
}
