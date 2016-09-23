/**
 */
package io.github.abelgomez.cpntools;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Color Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.SimpleColorSet#getColorElements <em>Color Elements</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.SimpleColorSet#getUsedIn <em>Used In</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getSimpleColorSet()
 * @model abstract="true"
 * @generated
 */
public interface SimpleColorSet extends ColorSet {
	/**
	 * Returns the value of the '<em><b>Color Elements</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.ColorSetElement}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.ColorSetElement#getSimpleColorSet <em>Simple Color Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Elements</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getSimpleColorSet_ColorElements()
	 * @see io.github.abelgomez.cpntools.ColorSetElement#getSimpleColorSet
	 * @model opposite="simpleColorSet" containment="true"
	 * @generated
	 */
	EList<ColorSetElement> getColorElements();

	/**
	 * Returns the value of the '<em><b>Used In</b></em>' reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.CompoundColorSet}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.CompoundColorSet#getSimpleColors <em>Simple Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used In</em>' reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getSimpleColorSet_UsedIn()
	 * @see io.github.abelgomez.cpntools.CompoundColorSet#getSimpleColors
	 * @model opposite="simpleColors"
	 * @generated
	 */
	EList<CompoundColorSet> getUsedIn();

} // SimpleColorSet
