/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Fusion#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Fusion#getPlaces <em>Places</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Fusion#getCpnet <em>Cpnet</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getFusion()
 * @model
 * @generated
 */
public interface Fusion extends EObject {
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getFusion_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Fusion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Places</b></em>' reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Place}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Place#getFusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getFusion_Places()
	 * @see io.github.abelgomez.cpntools.Place#getFusion
	 * @model opposite="fusion" ordered="false"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Cpnet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Cpnet#getFusions <em>Fusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpnet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpnet</em>' container reference.
	 * @see #setCpnet(Cpnet)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getFusion_Cpnet()
	 * @see io.github.abelgomez.cpntools.Cpnet#getFusions
	 * @model opposite="fusions" transient="false"
	 * @generated
	 */
	Cpnet getCpnet();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Fusion#getCpnet <em>Cpnet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpnet</em>' container reference.
	 * @see #getCpnet()
	 * @generated
	 */
	void setCpnet(Cpnet value);

} // Fusion
