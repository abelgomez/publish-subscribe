/**
 */
package io.github.abelgomez.cpntools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Mark#getValue <em>Value</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Mark#getInitmark <em>Initmark</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Mark#getColorSetElement <em>Color Set Element</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getMark()
 * @model
 * @generated
 */
public interface Mark extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getMark_Value()
	 * @model ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Mark#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Initmark</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Initmark#getMarks <em>Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initmark</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initmark</em>' container reference.
	 * @see #setInitmark(Initmark)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getMark_Initmark()
	 * @see io.github.abelgomez.cpntools.Initmark#getMarks
	 * @model opposite="marks" required="true" transient="false"
	 * @generated
	 */
	Initmark getInitmark();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Mark#getInitmark <em>Initmark</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initmark</em>' container reference.
	 * @see #getInitmark()
	 * @generated
	 */
	void setInitmark(Initmark value);

	/**
	 * Returns the value of the '<em><b>Color Set Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Set Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Set Element</em>' reference.
	 * @see #setColorSetElement(ColorSetElement)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getMark_ColorSetElement()
	 * @model required="true"
	 * @generated
	 */
	ColorSetElement getColorSetElement();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Mark#getColorSetElement <em>Color Set Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Set Element</em>' reference.
	 * @see #getColorSetElement()
	 * @generated
	 */
	void setColorSetElement(ColorSetElement value);

} // Mark
