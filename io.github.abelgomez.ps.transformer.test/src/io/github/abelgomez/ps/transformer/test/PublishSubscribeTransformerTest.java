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
package io.github.abelgomez.ps.transformer.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;
import io.github.abelgomez.cpntools.io.serializer.SerializationException;
import io.github.abelgomez.ps.transformer.PublishSubscribeTransformer;

/**
 * 
 * Simple test that demonstrates how a sample UML2 model is transformed into a
 * {@link Cpnet}
 * 
 * @author Abel Gómez (agomezlla@uoc.edu)
 *
 */
public class PublishSubscribeTransformerTest {

	private static final String TEMP_DIR = "./temp";
	private static final String TEMP_TEST_FILE = TEMP_DIR + File.separator + "test.cpn";

	@Before
	public void pre() {
		File temp = new File(TEMP_DIR);
		if (!temp.exists()) {
			Assert.assertTrue(temp.mkdir());
		}
	}

	@Test
	public void test() throws IOException, SerializationException {

		Package samplePackage = UMLFactory.eINSTANCE.createPackage();

		PublishSubscribeTransformer transformer = new PublishSubscribeTransformer(samplePackage);
		transformer.transform();
		Cpnet cpnet = transformer.result();
		Assert.assertNotNull(cpnet);

		// Print the results to debug conformance
		printXmi(cpnet, System.out);
		CpnToolsBuilder builder = new CpnToolsBuilder(cpnet);
		builder.serialize(System.out);
		builder.serialize(new FileOutputStream(new File(TEMP_TEST_FILE)));
	}

	private void printXmi(Cpnet cpnet, PrintStream out) throws IOException {
		Resource resource = new XMIResourceImpl();
		resource.getContents().add(cpnet);
		resource.save(out, null);
	}

}
