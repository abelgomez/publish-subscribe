/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.PsPackage;
import io.github.abelgomez.ps.SignKind;
import io.github.abelgomez.ps.UpdateOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.impl.UpdateOperationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.UpdateOperationImpl#getOperandValue <em>Operand Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateOperationImpl extends MinimalEObjectImpl.Container implements UpdateOperation {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final SignKind OPERATOR_EDEFAULT = SignKind.PLUS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected SignKind operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperandValue() <em>Operand Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandValue()
	 * @generated
	 * @ordered
	 */
	protected static final double OPERAND_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOperandValue() <em>Operand Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandValue()
	 * @generated
	 * @ordered
	 */
	protected double operandValue = OPERAND_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsPackage.Literals.UPDATE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignKind getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(SignKind newOperator) {
		SignKind oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.UPDATE_OPERATION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOperandValue() {
		return operandValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandValue(double newOperandValue) {
		double oldOperandValue = operandValue;
		operandValue = newOperandValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.UPDATE_OPERATION__OPERAND_VALUE, oldOperandValue, operandValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsPackage.UPDATE_OPERATION__OPERATOR:
				return getOperator();
			case PsPackage.UPDATE_OPERATION__OPERAND_VALUE:
				return getOperandValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PsPackage.UPDATE_OPERATION__OPERATOR:
				setOperator((SignKind)newValue);
				return;
			case PsPackage.UPDATE_OPERATION__OPERAND_VALUE:
				setOperandValue((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PsPackage.UPDATE_OPERATION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case PsPackage.UPDATE_OPERATION__OPERAND_VALUE:
				setOperandValue(OPERAND_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PsPackage.UPDATE_OPERATION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case PsPackage.UPDATE_OPERATION__OPERAND_VALUE:
				return operandValue != OPERAND_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(", operandValue: ");
		result.append(operandValue);
		result.append(')');
		return result.toString();
	}

} //UpdateOperationImpl
