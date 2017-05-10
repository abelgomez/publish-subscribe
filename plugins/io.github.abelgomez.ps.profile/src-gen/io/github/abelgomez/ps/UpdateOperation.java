/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.UpdateOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.UpdateOperation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getUpdateOperation()
 * @model
 * @generated
 */
public interface UpdateOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link io.github.abelgomez.ps.SignKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see io.github.abelgomez.ps.SignKind
	 * @see #setOperator(SignKind)
	 * @see io.github.abelgomez.ps.PsPackage#getUpdateOperation_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SignKind getOperator();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.UpdateOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see io.github.abelgomez.ps.SignKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SignKind value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see io.github.abelgomez.ps.PsPackage#getUpdateOperation_Value()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.UpdateOperation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // UpdateOperation
