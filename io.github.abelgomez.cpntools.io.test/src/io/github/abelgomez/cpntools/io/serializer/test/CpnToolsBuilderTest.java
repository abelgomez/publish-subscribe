package io.github.abelgomez.cpntools.io.serializer.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import io.github.abelgomez.cpntools.Annot;
import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsFactory;
import io.github.abelgomez.cpntools.Enumerated;
import io.github.abelgomez.cpntools.Globbox;
import io.github.abelgomez.cpntools.Orientation;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Trans;
import io.github.abelgomez.cpntools.io.serializer.CpnToolsBuilder;

public class CpnToolsBuilderTest {

	@Test
	public void test() throws ParserConfigurationException, TransformerException, FileNotFoundException {
		Cpnet net = CpntoolsFactory.eINSTANCE.createCpnet();
		Page page = CpntoolsFactory.eINSTANCE.createPage();
		Globbox globbox = CpntoolsFactory.eINSTANCE.createGlobbox();
		page.setName("Page");
		page.setPosx(150);
		page.setPosy(30);
		page.setWidth(500);
		page.setHeight(500);
		net.setPage(page);
		net.setGlobbox(globbox);
		
		Enumerated enumerated = CpntoolsFactory.eINSTANCE.createEnumerated();
		globbox.getDeclarations().add(enumerated);

		enumerated.setColorSetType("Type");
		Place place = CpntoolsFactory.eINSTANCE.createPlace();
		place.setType(enumerated);
		
		Trans trans = CpntoolsFactory.eINSTANCE.createTrans();
		trans.setText("Text");
		
		Annot annot = CpntoolsFactory.eINSTANCE.createAnnot();
		annot.setText("Annot");
		
		Arc arc = CpntoolsFactory.eINSTANCE.createArc();
		arc.setPlace(place);
		arc.setTrans(trans);
		arc.setOrientation(Orientation.PTO_T);
		arc.setAnnot(annot);
				
		page.getPlaces().add(place);
		page.getTranss().add(trans);
		page.getArcs().add(arc);
		
		page.layout(500, 500, 5000);
		
		CpnToolsBuilder.serialize(net, System.out);
		CpnToolsBuilder.serialize(net, new FileOutputStream(new File("C:/Users/agomez/Desktop/test.cpn")));
	}

}
