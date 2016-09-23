/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Globref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Globref#getIdname <em>Idname</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getGlobref()
 * @model
 * @generated
 */
public interface Globref extends Declaration {
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getGlobref_Idname()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdname();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Globref#getIdname <em>Idname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idname</em>' attribute.
	 * @see #getIdname()
	 * @generated
	 */
	void setIdname(String value);

} // Globref
