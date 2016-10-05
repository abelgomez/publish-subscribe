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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.ColorSet#getIdname <em>Idname</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.ColorSet#getColorSetType <em>Color Set Type</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.ColorSet#isTimed <em>Timed</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.ColorSet#getDeclare <em>Declare</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSet()
 * @model abstract="true"
 * @generated
 */
public interface ColorSet extends Declaration {
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSet_Idname()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdname();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.ColorSet#getIdname <em>Idname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idname</em>' attribute.
	 * @see #getIdname()
	 * @generated
	 */
	void setIdname(String value);

	/**
	 * Returns the value of the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Set Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Set Type</em>' attribute.
	 * @see #setColorSetType(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSet_ColorSetType()
	 * @model ordered="false"
	 * @generated
	 */
	String getColorSetType();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.ColorSet#getColorSetType <em>Color Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Set Type</em>' attribute.
	 * @see #getColorSetType()
	 * @generated
	 */
	void setColorSetType(String value);

	/**
	 * Returns the value of the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timed</em>' attribute.
	 * @see #setTimed(boolean)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSet_Timed()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isTimed();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.ColorSet#isTimed <em>Timed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timed</em>' attribute.
	 * @see #isTimed()
	 * @generated
	 */
	void setTimed(boolean value);

	/**
	 * Returns the value of the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declare</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare</em>' attribute.
	 * @see #setDeclare(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSet_Declare()
	 * @model ordered="false"
	 * @generated
	 */
	String getDeclare();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.ColorSet#getDeclare <em>Declare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declare</em>' attribute.
	 * @see #getDeclare()
	 * @generated
	 */
	void setDeclare(String value);

} // ColorSet
