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
package io.github.abelgomez.cpntools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Declaration#getGlobbox <em>Globbox</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Declaration#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Globbox</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Globbox#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globbox</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globbox</em>' container reference.
	 * @see #setGlobbox(Globbox)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDeclaration_Globbox()
	 * @see io.github.abelgomez.cpntools.Globbox#getDeclarations
	 * @model opposite="declarations" transient="false"
	 * @generated
	 */
	Globbox getGlobbox();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Declaration#getGlobbox <em>Globbox</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globbox</em>' container reference.
	 * @see #getGlobbox()
	 * @generated
	 */
	void setGlobbox(Globbox value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Block#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' container reference.
	 * @see #setBlock(Block)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getDeclaration_Block()
	 * @see io.github.abelgomez.cpntools.Block#getDeclarations
	 * @model opposite="declarations" transient="false"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Declaration#getBlock <em>Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' container reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

} // Declaration
