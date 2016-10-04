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
package io.github.abelgomez.cpntools.io.serializer.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
import io.github.abelgomez.cpntools.io.serializer.SerializationException;

public class CpnToolsBuilderTest {

	@Test
	public void test() throws FileNotFoundException, SerializationException {
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
		
		CpnToolsBuilder builder = new CpnToolsBuilder(net);
		builder.serialize(System.out);
		builder.serialize(new FileOutputStream(new File("C:/Users/agomez/Desktop/test.cpn")));
	}

}
