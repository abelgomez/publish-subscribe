/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.AbstractSetter#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getAbstractSetter()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSetter extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(UpdateOperation)
	 * @see io.github.abelgomez.ps.PsPackage#getAbstractSetter_Operation()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	UpdateOperation getOperation();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.AbstractSetter#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(UpdateOperation value);

} // AbstractSetter
