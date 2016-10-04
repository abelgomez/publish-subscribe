package io.github.abelgomez.ps.transformer.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

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
