/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Globbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Globbox#getCpnet <em>Cpnet</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Globbox#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Globbox#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getGlobbox()
 * @model
 * @generated
 */
public interface Globbox extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpnet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Cpnet#getGlobbox <em>Globbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpnet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpnet</em>' container reference.
	 * @see #setCpnet(Cpnet)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getGlobbox_Cpnet()
	 * @see io.github.abelgomez.cpntools.Cpnet#getGlobbox
	 * @model opposite="globbox" transient="false"
	 * @generated
	 */
	Cpnet getCpnet();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Globbox#getCpnet <em>Cpnet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpnet</em>' container reference.
	 * @see #getCpnet()
	 * @generated
	 */
	void setCpnet(Cpnet value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Declaration}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Declaration#getGlobbox <em>Globbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getGlobbox_Declarations()
	 * @see io.github.abelgomez.cpntools.Declaration#getGlobbox
	 * @model opposite="globbox" containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getGlobbox_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Globbox#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Globbox
