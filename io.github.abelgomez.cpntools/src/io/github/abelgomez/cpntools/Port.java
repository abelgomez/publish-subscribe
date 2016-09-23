/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Port#getPortType <em>Port Type</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see #setPortType(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPort_PortType()
	 * @model ordered="false"
	 * @generated
	 */
	String getPortType();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Port#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(String value);

} // Port
