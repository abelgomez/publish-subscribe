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
package io.github.abelgomez.ps.transformer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;

public final class DefaultUriProvider implements IUriProvider {
	
	
	private static final URI DEFAULT_TRANSFORMATION_URI = URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/ps2cpntools.qvto");

	private static final URI[] TRANSFORMATION_FILES_URIS = new URI[] {
			URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/ps2cpntools.qvto"),
			URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/cpnsupport.qvto"),
			URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/pssupport.qvto"),
			URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/stringutils.qvto"),
			URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/umlsupport.qvto")
	};	
	
	@Override
	public URI getUri() {
		File file = TransformerPlugin.getDefault().getStateLocation().append(DEFAULT_TRANSFORMATION_URI.lastSegment()).toFile();
		if (file.exists()) {
			return URI.createURI(file.toURI().toString());
		} else {
			return DEFAULT_TRANSFORMATION_URI;
		}
	}

	public DefaultUriProvider() {
		initializeTransformationFiles();
	}
	
	private static void initializeTransformationFiles() {
		for (URI uri : TRANSFORMATION_FILES_URIS) {
			File target = TransformerPlugin.getDefault().getStateLocation().append(uri.lastSegment()).toFile();
			if (target.exists()) {
				return;
			}
	
			URL source = null;
			try {
				source = new URL(uri.toString());
			} catch (MalformedURLException e) {
				// Should not ever happen since the constant source URI must be valid
				throw new RuntimeException(e);
			}
	
			try (
					InputStream sourceStream = source.openStream();
					OutputStream targetStream = new FileOutputStream(target);) {
				int read;
				byte[] buffer = new byte[1024];
				while ((read = sourceStream.read(buffer)) != -1) {
					targetStream.write(buffer, 0, read);
				}
			} catch (IOException e) {
				TransformerPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, TransformerPlugin.PLUGIN_ID, e.getLocalizedMessage(), e));
			}
		}
	}
}
