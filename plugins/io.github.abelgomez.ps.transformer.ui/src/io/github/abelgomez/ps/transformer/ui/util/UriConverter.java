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
package io.github.abelgomez.ps.transformer.ui.util;

import java.io.File;
import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

/**
 * Utility class to deal with plain Java {@link URI}s and EMF
 * {@link org.eclipse.emf.common.util.URI}s.
 * 
 * @author Abel Gómez (agomezlla@uoc.edu)
 *
 */
public class UriConverter {

	/**
	 * Convert a file {@link URI} into an eclipse platform {@link URI}
	 * 
	 * @param fileUri
	 * @return a platform {@link URI} of <code>null</code> if the input
	 *         {@link URI} does not correspond to a platform file
	 */
	public static URI toPlatformResourceUri(URI fileUri) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		if (new File(fileUri).isFile()) {
			IFile[] files = root.findFilesForLocationURI(fileUri);
			if (files.length > 0) {
				return URI.create(org.eclipse.emf.common.util.URI.createPlatformResourceURI(
						files[0].getFullPath().toString(), true).toString());
			}
		} else {
			IContainer[] containers = root.findContainersForLocationURI(fileUri);
			if (containers.length > 0) {
				return URI.create(org.eclipse.emf.common.util.URI.createPlatformResourceURI(
						containers[0].getFullPath().toString(), true).toString());
			}
		}
		return null;
	}

	/**
	 * Convert an EMF file {@link org.eclipse.emf.common.util.URI} into an
	 * eclipse platform {@link URI}
	 * 
	 * @param fileUri
	 * @return a platform {@link URI} of <code>null</code> if the input
	 *         {@link URI} does not correspond to a platform file
	 */
	public static URI toPlatformResourceUri(org.eclipse.emf.common.util.URI fileUri) {
		return toPlatformResourceUri(toJavaUri(fileUri));
	}

	/**
	 * Convert a platform {@link URI} into a file (e.g. file-system specific)
	 * {@link URI}
	 * 
	 * @param platformResourceUri
	 * @return a {@link URI} pointing to a file in the file system
	 */
	public static URI toFileResourceUri(URI platformResourceUri) {
		return ResourcesPlugin.getWorkspace().getRoot().findMember(
				new Path(toEmfUri(platformResourceUri).toPlatformString(true))).getLocationURI();
	}

	/**
	 * Convert a Java {@link URI} into an EMF
	 * {@link org.eclipse.emf.common.util.URI}
	 * 
	 * @param uri
	 *            an EMF {@link org.eclipse.emf.common.util.URI}
	 * @return a Java {@link URI}
	 */
	public static org.eclipse.emf.common.util.URI toEmfUri(URI uri) {
		return org.eclipse.emf.common.util.URI.createURI(uri.toString());
	}

	/**
	 * Convert an EMF {@link org.eclipse.emf.common.util.URI} into a Java
	 * {@link URI}
	 * 
	 * @param uri
	 *            a Java {@link URI}
	 * @return an EMF {@link org.eclipse.emf.common.util.URI}
	 */
	public static URI toJavaUri(org.eclipse.emf.common.util.URI uri) {
		return URI.create(uri.toString());
	}

}