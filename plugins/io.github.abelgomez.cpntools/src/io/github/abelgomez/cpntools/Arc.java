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
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getHeadsize <em>Headsize</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getPlace <em>Place</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getCurrentcyckle <em>Currentcyckle</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getOrder <em>Order</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getTrans <em>Trans</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getAnnot <em>Annot</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Arc#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Headsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headsize</em>' attribute.
	 * @see #setHeadsize(float)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Headsize()
	 * @model ordered="false"
	 * @generated
	 */
	float getHeadsize();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getHeadsize <em>Headsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headsize</em>' attribute.
	 * @see #getHeadsize()
	 * @generated
	 */
	void setHeadsize(float value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Place#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Place()
	 * @see io.github.abelgomez.cpntools.Place#getArcs
	 * @model opposite="arcs" required="true" ordered="false"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"PtoT"</code>.
	 * The literals are from the enumeration {@link io.github.abelgomez.cpntools.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see io.github.abelgomez.cpntools.Orientation
	 * @see #setOrientation(Orientation)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Orientation()
	 * @model default="PtoT" ordered="false"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see io.github.abelgomez.cpntools.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Currentcyckle</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentcyckle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentcyckle</em>' attribute.
	 * @see #setCurrentcyckle(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Currentcyckle()
	 * @model default="2" ordered="false"
	 * @generated
	 */
	String getCurrentcyckle();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getCurrentcyckle <em>Currentcyckle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentcyckle</em>' attribute.
	 * @see #getCurrentcyckle()
	 * @generated
	 */
	void setCurrentcyckle(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Order()
	 * @model ordered="false"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Trans</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Trans#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans</em>' reference.
	 * @see #setTrans(Trans)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Trans()
	 * @see io.github.abelgomez.cpntools.Trans#getArcs
	 * @model opposite="arcs" required="true" ordered="false"
	 * @generated
	 */
	Trans getTrans();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getTrans <em>Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans</em>' reference.
	 * @see #getTrans()
	 * @generated
	 */
	void setTrans(Trans value);

	/**
	 * Returns the value of the '<em><b>Annot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annot</em>' containment reference.
	 * @see #setAnnot(Annot)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Annot()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Annot getAnnot();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getAnnot <em>Annot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annot</em>' containment reference.
	 * @see #getAnnot()
	 * @generated
	 */
	void setAnnot(Annot value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Page#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' container reference.
	 * @see #setPage(Page)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getArc_Page()
	 * @see io.github.abelgomez.cpntools.Page#getArcs
	 * @model opposite="arcs" required="true" transient="false"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Arc#getPage <em>Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' container reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // Arc
