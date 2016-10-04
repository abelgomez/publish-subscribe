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

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Block#getIdname <em>Idname</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Block#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Declaration {
	/**
	 * Returns the value of the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idname</em>' attribute.
	 * @see #setIdname(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBlock_Idname()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdname();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Block#getIdname <em>Idname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idname</em>' attribute.
	 * @see #getIdname()
	 * @generated
	 */
	void setIdname(String value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Declaration}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Declaration#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getBlock_Declarations()
	 * @see io.github.abelgomez.cpntools.Declaration#getBlock
	 * @model opposite="block" containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

} // Block
