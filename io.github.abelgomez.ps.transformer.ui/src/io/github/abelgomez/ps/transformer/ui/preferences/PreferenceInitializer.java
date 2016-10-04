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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import io.github.abelgomez.ps.transformer.DefaultUriProvider;
import io.github.abelgomez.ps.transformer.ui.TransformerUiPlugin;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	private static final String FILE_NAME = DefaultUriProvider.DEFAULT_TRANSFORMATION_URI.lastSegment();
	private static final IPath FILE_FULL_PATH = TransformerUiPlugin.getDefault().getStateLocation().append(FILE_NAME);

	@Override
	public void initializeDefaultPreferences() {
		
		initializeTransformationFile();
		
		IPreferenceStore store = TransformerUiPlugin.getDefault().getPreferenceStore();
		
		if (FILE_FULL_PATH.toFile().exists()) {
			store.setDefault(PreferenceConstants.URI, FILE_FULL_PATH.toFile().toURI().toString());
		} else {
			store.setDefault(PreferenceConstants.URI, DefaultUriProvider.DEFAULT_TRANSFORMATION_URI.toString());
		}
	}
	
	private void initializeTransformationFile() {
		
		File target = FILE_FULL_PATH.toFile();
		if (target.exists()) {
			return;
		}
        
        URL source = null;
		try {
			source = new URL(DefaultUriProvider.DEFAULT_TRANSFORMATION_URI.toString());
		} catch (MalformedURLException e) {
			// Should not ever happen since the constant URI must be valid
			throw new RuntimeException(e);
		}
		
		try (
				InputStream sourceStream = source.openStream();
				OutputStream targetStream = new FileOutputStream(target);
		) {
			int read;
			byte[] buffer = new byte[1024];
			while ((read = sourceStream.read(buffer)) != -1) {
				targetStream.write(buffer, 0, read);
			}
		} catch (IOException e) {
			TransformerUiPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, TransformerUiPlugin.PLUGIN_ID, e.getLocalizedMessage(), e));
		}
	}

}
