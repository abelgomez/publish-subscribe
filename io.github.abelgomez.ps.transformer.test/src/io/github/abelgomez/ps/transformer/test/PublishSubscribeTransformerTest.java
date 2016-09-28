package io.github.abelgomez.ps.transformer.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;
import io.github.abelgomez.ps.transformer.PublishSubscribeTransformer;

public class PublishSubscribeTransformerTest {
	
	private static final String TEMP_DIR = "./temp";
	private static final String TEMP_TEST_FILE = TEMP_DIR + File.separator +  "test.cpn";
	
	@Before
	public void pre() {
		File temp = new File(TEMP_DIR);
		if (!temp.exists()) {
			Assert.assertTrue(temp.mkdir());
		}
	}

	@Test
	public void test() throws ParserConfigurationException, TransformerException, IOException {
		PublishSubscribeTransformer transformer = new PublishSubscribeTransformer(UMLFactory.eINSTANCE.createPackage());
		transformer.transform();
		Cpnet cpnet = transformer.result();
		Assert.assertNotNull(cpnet);
		Resource resource = new XMIResourceImpl();
		resource.getContents().add(cpnet);
		resource.save(System.out, null);
		
		CpnToolsBuilder builder = new CpnToolsBuilder(cpnet);
		builder.serialize(System.out);
		
		builder.serialize(new FileOutputStream(new File(TEMP_TEST_FILE)));
	}

}
