package io.github.abelgomez.ps.transformer.ui.handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;

import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;
import io.github.abelgomez.ps.transformer.PublishSubscribeTransformer;
import io.github.abelgomez.ps.transformer.ui.TransformerUiPlugin;
import io.github.abelgomez.ps.transformer.ui.util.UriConverter;

public class TransformHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MultiStatus globalStatus = new MultiStatus(TransformerUiPlugin.PLUGIN_ID, 0, "Error converting to Petri nets", null);
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			Set<URI> processed = new HashSet<>();
			for (Object obj : structuredSelection.toList()) {
				UmlModel model = Platform.getAdapterManager().getAdapter(obj, UmlModel.class);
				URI uri = model.getResource().getURI();
				if (!processed.contains(uri)) {
					processed.add(uri);
					IStatus status = processUmlModel(model);
					globalStatus.add(status);
				}
			}
		}

		if (globalStatus.matches(IStatus.ERROR)) {
			StatusManager.getManager().handle(globalStatus, StatusManager.SHOW);
		}
		// Return must be null
		return null;
	}

	private IStatus processUmlModel(UmlModel model) {

		if (!model.getResource().isLoaded()) {
			try {
				model.getResource().load(Collections.emptyMap());
			} catch (IOException e) {
				return new Status(IStatus.ERROR, TransformerUiPlugin.PLUGIN_ID, NLS.bind("Unable to load model", model.getURI()), e);
			}
		}
		
		Element element = retrieveUmlElement(model);

		if (element == null) {
			return new Status(IStatus.WARNING, TransformerUiPlugin.PLUGIN_ID, NLS.bind("File ''{0}'' has been skipped", model.getURI()));
		}

		PublishSubscribeTransformer transformer = new PublishSubscribeTransformer(element);

		transformer.transform();

		if (transformer.status().matches(IStatus.ERROR)) {
			return transformer.status();
		} else {
			Cpnet cpn = transformer.result();
			CpnToolsBuilder builder = new CpnToolsBuilder(cpn);
			try {
				builder.serialize(new FileOutputStream(getOutputFile(model)));
			} catch (Throwable t) {
				return new Status(IStatus.ERROR, TransformerUiPlugin.PLUGIN_ID, t.getLocalizedMessage(), t);
			}
		}

		return Status.OK_STATUS;
	}

	private Element retrieveUmlElement(UmlModel model) {
		SelectElementDialog dialog = new SelectElementDialog(Display.getDefault().getActiveShell(), model.getResource());
		if (dialog.open() == Dialog.OK) {
			return dialog.getElement();
		} else {
			return null;
		}
	}

	private File getOutputFile(UmlModel model) {
		return new File(model.getURI().trimFileExtension().appendFileExtension(CpntoolsPackage.eNS_PREFIX).toFileString());
	}

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
