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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.String#getWith <em>With</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.String#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getString()
 * @model
 * @generated
 */
public interface String extends SimpleColorSet {
	/**
	 * Returns the value of the '<em><b>With</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' attribute list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getString_With()
	 * @model upper="2"
	 * @generated
	 */
	EList<java.lang.String> getWith();

	/**
	 * Returns the value of the '<em><b>And</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' attribute list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getString_And()
	 * @model upper="2"
	 * @generated
	 */
	EList<java.lang.String> getAnd();

} // String
