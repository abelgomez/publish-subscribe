/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Var#getIdname <em>Idname</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Var#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getVar()
 * @model
 * @generated
 */
public interface Var extends Declaration {
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getVar_Idname()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdname();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Var#getIdname <em>Idname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idname</em>' attribute.
	 * @see #getIdname()
	 * @generated
	 */
	void setIdname(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ColorSet)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getVar_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ColorSet getType();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Var#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ColorSet value);

} // Var
