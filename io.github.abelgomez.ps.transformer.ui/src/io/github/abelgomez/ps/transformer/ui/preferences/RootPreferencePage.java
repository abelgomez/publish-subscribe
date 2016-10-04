package io.github.abelgomez.ps.transformer.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class RootPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setDescription("Preferences for the Publish-Subscribe Tools Plug-ins");
	}

	@Override
	protected void createFieldEditors() {
	}
}
