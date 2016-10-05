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
package io.github.abelgomez.ps.transformer.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activator class for the Publish-Subscribe Transformer UI Plug-in
 * 
 * @author Abel Gómez (agomezlla@uoc.edu)
 *
 */
public class TransformerUiPlugin extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "io.github.abelgomez.ps.transformer.ui"; //$NON-NLS-1$

	private static TransformerUiPlugin plugin;

	public TransformerUiPlugin() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static TransformerUiPlugin getDefault() {
		return plugin;
	}
}
