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

import org.eclipse.emf.common.util.URI;

public class DefaultUriProvider implements IUriProvider {

	public static final URI DEFAULT_TRANSFORMATION_URI = URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/ps2cpntools.qvto");

	@Override
	public URI getUri() {
		return DEFAULT_TRANSFORMATION_URI;
	}

}
