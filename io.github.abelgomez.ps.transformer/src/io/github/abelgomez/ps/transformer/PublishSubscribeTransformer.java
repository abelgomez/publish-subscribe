package io.github.abelgomez.ps.transformer;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.uml2.uml.Element;

import io.github.abelgomez.cpntools.Cpnet;

public class PublishSubscribeTransformer {

	private static final String PLUGIN_ID = "io.github.abelgomez.ps.transformer"; //$NON-NLS-1$

	private static final String POINT_ID = "io.github.abelgomez.ps.transformer.uri_provider"; //$NON-NLS-1$

	private static final String EXT_URI = "uri"; //$NON-NLS-1$

	private static final String EXT_PRIORITY = "priority"; //$NON-NLS-1$
	
	private IStatus status = null;
	
	private Element input = null;
	
	private Cpnet output = null;
	
	private volatile boolean executed = false;
	
	public PublishSubscribeTransformer(Element element) {
		this.input = EcoreUtil.copy(element);
	}
	
	public synchronized void transform() {
		if (executed) {
			return; 
		}
		
		TransformationExecutor executor = new TransformationExecutor(retrieveUri());
		ExecutionContextImpl context = new ExecutionContextImpl();
		StatusLog statusLog = new StatusLog();
		context.setLog(statusLog);

		ModelExtent model = new BasicModelExtent(Arrays.asList(new Element[] { input }));
		ModelExtent res = new BasicModelExtent();

		ExecutionDiagnostic diagnostic = executor.execute(context, model, res);
		
		if (diagnostic.getSeverity() == Diagnostic.OK) {
			if (statusLog.getStatus().getSeverity() == IStatus.WARNING) {
				status = new MultiStatus(PLUGIN_ID, 0, MessageFormat.format("Transformation executed with warnings while processing ''{0}''", input), null);
			} else if (statusLog.getStatus().getSeverity() == IStatus.ERROR) {
				status = new MultiStatus(PLUGIN_ID, 0, MessageFormat.format("Transformation executed with errors while processing ''{0}''", input), null);
			} else {
				status = new MultiStatus(PLUGIN_ID, 0, MessageFormat.format("Transformation executed on ''{0}''", input), null);
			}
			((MultiStatus) status).addAll(statusLog.getStatus());
		} else {
			status = new Status(IStatus.ERROR, PLUGIN_ID, diagnostic.getMessage());
		}
		
		if (res.getContents().size() != 1) {
			throw new RuntimeException(MessageFormat.format("Unexpected number of generated elements, expecting 1, but found {0}", res.getContents().size()));
		} else if (!(res.getContents().get(0) instanceof Cpnet)) {
			throw new RuntimeException(MessageFormat.format("Unexpected type for the generated element, expecting 'Cpnet', but found ''{0}''", res.getContents().get(0).eClass().getName()));
		} else {
			output = (Cpnet) res.getContents().get(0);
		}

		executed = true;
	}
	
	private URI retrieveUri() {
		URI uri = null;
		int priority = Integer.MIN_VALUE;
		
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(POINT_ID);
		for (IConfigurationElement element : elements) {
			int newPriority = Integer.MIN_VALUE;
			try {
				newPriority = Integer.valueOf(element.getAttribute(EXT_PRIORITY));
			} catch (NumberFormatException e) {
			}
			if (newPriority >= priority) {
				uri = URI.createURI(element.getAttribute(EXT_URI));
			}
		}
		return uri;
	}

	public IStatus status() {
		return status;
	}
	
	public Cpnet result() {
		return EcoreUtil.copy(output);
	}
	
	public class StatusLog implements Log {

		private final MultiStatus status;

		public StatusLog() {
			status = new MultiStatus(PLUGIN_ID, 0, null, null);
		}

		public void log(int level, String message, Object param) {
			String recordStr = MessageFormat.format("Level {0} - {1}, data: {2}", level, message, String.valueOf(param)); //$NON-NLS-1$
			logRecord(recordStr);
		}

		public void log(int level, String message) {
			String recordStr = MessageFormat.format("Level {0} - {1}", level, message); //$NON-NLS-1$
			logRecord(recordStr);
		}

		public void log(String message, Object param) {
			String recordStr = MessageFormat.format("{0}, data: {1}", message, String.valueOf(param)); //$NON-NLS-1$
			logRecord(recordStr);
		}

		public void log(String message) {
			logRecord(message);
		}

		private void logRecord(String recordStr) {
			Pattern pattern = Pattern.compile("(?:Level \\d+ - )?ASSERT \\[(\\w+)\\] failed at \\(\\S+\\) : (.+)");
			Matcher matcher = pattern.matcher(recordStr);
			if (matcher.matches()) {
				String severity = matcher.group(1);
				status.add(new Status(toSeverity(severity), PLUGIN_ID, matcher.group(2)));
			} else {
				status.add(new Status(IStatus.INFO, PLUGIN_ID, recordStr));
			}
		}

		public IStatus getStatus() {
			return status;
		}

		private int toSeverity(String severity) {
			switch (severity) {
				case "warning":
					return IStatus.WARNING;
				case "error":
					return IStatus.ERROR;
				case "fatal":
					return IStatus.ERROR;
				default:
					return IStatus.INFO;
			}
		}
	}
}