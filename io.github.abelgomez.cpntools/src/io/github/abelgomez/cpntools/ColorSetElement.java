/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Set Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.ColorSetElement#getSimpleColorSet <em>Simple Color Set</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.ColorSetElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSetElement()
 * @model
 * @generated
 */
public interface ColorSetElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Color Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.SimpleColorSet#getColorElements <em>Color Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Color Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Color Set</em>' container reference.
	 * @see #setSimpleColorSet(SimpleColorSet)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSetElement_SimpleColorSet()
	 * @see io.github.abelgomez.cpntools.SimpleColorSet#getColorElements
	 * @model opposite="colorElements" transient="false"
	 * @generated
	 */
	SimpleColorSet getSimpleColorSet();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.ColorSetElement#getSimpleColorSet <em>Simple Color Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Color Set</em>' container reference.
	 * @see #getSimpleColorSet()
	 * @generated
	 */
	void setSimpleColorSet(SimpleColorSet value);

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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getColorSetElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.ColorSetElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ColorSetElement
