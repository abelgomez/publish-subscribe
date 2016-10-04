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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cpnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Cpnet#getFusions <em>Fusions</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Cpnet#getGlobbox <em>Globbox</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Cpnet#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getCpnet()
 * @model
 * @generated
 */
public interface Cpnet extends EObject {
	/**
	 * Returns the value of the '<em><b>Fusions</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Fusion}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Fusion#getCpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fusions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fusions</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getCpnet_Fusions()
	 * @see io.github.abelgomez.cpntools.Fusion#getCpnet
	 * @model opposite="cpnet" containment="true" ordered="false"
	 * @generated
	 */
	EList<Fusion> getFusions();

	/**
	 * Returns the value of the '<em><b>Globbox</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Globbox#getCpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globbox</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globbox</em>' containment reference.
	 * @see #setGlobbox(Globbox)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getCpnet_Globbox()
	 * @see io.github.abelgomez.cpntools.Globbox#getCpnet
	 * @model opposite="cpnet" containment="true" ordered="false"
	 * @generated
	 */
	Globbox getGlobbox();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Cpnet#getGlobbox <em>Globbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globbox</em>' containment reference.
	 * @see #getGlobbox()
	 * @generated
	 */
	void setGlobbox(Globbox value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Page#getCpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(Page)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getCpnet_Page()
	 * @see io.github.abelgomez.cpntools.Page#getCpnet
	 * @model opposite="cpnet" containment="true"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Cpnet#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // Cpnet
