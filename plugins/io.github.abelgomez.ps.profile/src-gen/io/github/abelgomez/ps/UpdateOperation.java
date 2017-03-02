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
 *   <li>{@link io.github.abelgomez.ps.UpdateOperation#getOperandValue <em>Operand Value</em>}</li>
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
	 * Returns the value of the '<em><b>Operand Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Value</em>' attribute.
	 * @see #setOperandValue(double)
	 * @see io.github.abelgomez.ps.PsPackage#getUpdateOperation_OperandValue()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getOperandValue();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.UpdateOperation#getOperandValue <em>Operand Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Value</em>' attribute.
	 * @see #getOperandValue()
	 * @generated
	 */
	void setOperandValue(double value);

} // UpdateOperation
