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
 * A representation of the model object '<em><b>Compound Color Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.CompoundColorSet#getSimpleColors <em>Simple Colors</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getCompoundColorSet()
 * @model abstract="true"
 * @generated
 */
public interface CompoundColorSet extends ColorSet {
	/**
	 * Returns the value of the '<em><b>Simple Colors</b></em>' reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.SimpleColorSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Colors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Colors</em>' reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getCompoundColorSet_SimpleColors()
	 * @model required="true"
	 * @generated
	 */
	EList<SimpleColorSet> getSimpleColors();

} // CompoundColorSet
