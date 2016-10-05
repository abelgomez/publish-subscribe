/*******************************************************************************
 * Copyright (c) 2016 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Abel Gómez (agomezlla@uoc.edu) - initial API and implementation
 *******************************************************************************/
package io.github.abelgomez.ps.transformer.ui.preferences;

import java.io.File;
import java.net.URI;
import java.text.MessageFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.preference.PreferencePageSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import io.github.abelgomez.ps.transformer.ui.TransformerUiPlugin;

/**
 * {@link PreferencePage} to customize the {@link PreferenceConstants#URI}
 * preference.
 * 
 * @author Abel Gómez (agomezlla@uoc.edu)
 *
 */
public class UriPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	/**
	 * Internal variable holding the value of the URI
	 */
	private WritableValue<String> observableLocation = new WritableValue<>();

	@Override
	public void init(IWorkbench workbench) {
		setDescription("Set the location and contents of the QVTr transformation");
		setPreferenceStore(TransformerUiPlugin.getDefault().getPreferenceStore());
		applyData(getPreferenceStore());
	}

	@Override
	protected Control createContents(Composite parent) {
		DataBindingContext context = new DataBindingContext();

		Composite top = new Composite(parent, SWT.NONE);
		top.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		top.setLayout(new GridLayout());

		{
			Group group = new Group(top, SWT.NONE);
			GridData layoutData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
			layoutData.widthHint = 500;
			group.setLayoutData(layoutData);
			group.setLayout(new GridLayout(2, false));
			group.setText("Transformation file name");

			Text pathText = new Text(group, SWT.BORDER | SWT.READ_ONLY);
			pathText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

			Button browseButton = new Button(group, SWT.PUSH);
			browseButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
			browseButton.setText("&Browse");
			browseButton.addSelectionListener(new BrowseSelectionAdapter());

			Link editLink = new Link(group, SWT.NONE);
			editLink.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
			editLink.setText("<a>Edit this file in the workspace</a>");
			editLink.addSelectionListener(new OpenEditorSelectionAdapter());

			context.bindValue(WidgetProperties.text(SWT.Modify).observe(pathText), observableLocation);
		}

		PreferencePageSupport.create(this, context);

		return top;
	}

	@Override
	public void applyData(Object data) {
		IPreferenceStore store = (IPreferenceStore) data;
		observableLocation.setValue(store.getString(PreferenceConstants.URI));
	}

	@Override
	public boolean performOk() {
		getPreferenceStore().setValue(PreferenceConstants.URI, observableLocation.getValue());
		return true;
	}

	@Override
	protected void performDefaults() {
		getPreferenceStore().setToDefault(PreferenceConstants.URI);
		applyData(getPreferenceStore());
	}

	/**
	 * {@link SelectionAdapter} implementing the behavior when the
	 * <code>Browse</code> {@link Button} is pressed.
	 * 
	 * @author Abel Gómez (agomezlla@uoc.edu)
	 *
	 */
	private final class BrowseSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent event) {
			FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
			try {
				File file = new File(URI.create(observableLocation.getValue()));
				dialog.setFileName(file.getPath());
			} catch (IllegalArgumentException e) {
				TransformerUiPlugin.getDefault().getLog().log(
						new Status(IStatus.WARNING, TransformerUiPlugin.PLUGIN_ID,
								MessageFormat.format("String ''{0}'' does not represent a valid file path", observableLocation.getValue()), e));
			}
			dialog.setFilterExtensions(new String[] { "*.qvto", "*.qvt", "*.*" });
			String location = dialog.open();
			if (location != null) {
				observableLocation.setValue(new File(location).toURI().toString());
			}
		}
	}

	/**
	 * {@link SelectionAdapter} implementig the behaviour when the <em>open in
	 * editor</em> link if pressed.
	 * 
	 * @author Abel Gómez (agomezlla@uoc.edu)
	 *
	 */
	private final class OpenEditorSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent event) {
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(URI.create(observableLocation.getValue()));
			if (!fileStore.fetchInfo().isDirectory() && fileStore.fetchInfo().exists()) {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditorOnFileStore(page, fileStore);
				} catch (PartInitException e) {
					TransformerUiPlugin.getDefault().getLog().log(
							new Status(IStatus.ERROR, TransformerUiPlugin.PLUGIN_ID,
									MessageFormat.format("Unable to open ''{0}'' in the workspace", observableLocation.getValue()), e));

				}
			}
		}
	}
}
