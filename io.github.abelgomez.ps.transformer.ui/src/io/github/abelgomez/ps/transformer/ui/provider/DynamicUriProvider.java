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
