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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import io.github.abelgomez.ps.transformer.DefaultUriProvider;
import io.github.abelgomez.ps.transformer.ui.TransformerUiPlugin;

/**
 * Initializer class for the {@link TransformerUiPlugin} default preferences
 * 
 * @author Abel Gómez (agomezlla@uoc.edu)
 *
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = TransformerUiPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.URI, new DefaultUriProvider().getUri().toString());
		store.setDefault(PreferenceConstants.OPEN_RESULT, true);
	}

}
