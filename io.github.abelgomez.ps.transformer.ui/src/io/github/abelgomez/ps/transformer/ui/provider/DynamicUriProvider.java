package io.github.abelgomez.ps.transformer.ui.provider;

import org.eclipse.emf.common.util.URI;

import io.github.abelgomez.ps.transformer.IUriProvider;
import io.github.abelgomez.ps.transformer.ui.TransformerUiPlugin;
import io.github.abelgomez.ps.transformer.ui.preferences.PreferenceConstants;

public class DynamicUriProvider implements IUriProvider {
	
	@Override
	public URI getUri() {
		return URI.createURI(TransformerUiPlugin.getDefault().getPreferenceStore().getString(PreferenceConstants.URI));
	}

}
