package io.github.abelgomez.ps.transformer;

import org.eclipse.emf.common.util.URI;

public class DefaultUriProvider implements IUriProvider {

	public static final URI DEFAULT_TRANSFORMATION_URI = URI.createURI("platform:/plugin/io.github.abelgomez.ps.transformer/transformation/ps2cpntools.qvto");

	@Override
	public URI getUri() {
		return DEFAULT_TRANSFORMATION_URI;
	}

}
