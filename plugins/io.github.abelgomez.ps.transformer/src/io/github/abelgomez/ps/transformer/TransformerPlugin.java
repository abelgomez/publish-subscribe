package io.github.abelgomez.ps.transformer;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class TransformerPlugin extends Plugin {

	public static final String PLUGIN_ID = "io.github.abelgomez.ps.transformer";  //$NON-NLS-1$
	
	private static TransformerPlugin plugin;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static TransformerPlugin getDefault() {
		return plugin;
	}
}
