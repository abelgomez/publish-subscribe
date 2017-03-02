/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.PsPackage;
import io.github.abelgomez.ps.TimedExecution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.ExecutionSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.impl.TimedExecutionImpl#getBase_ExecutionSpecification <em>Base Execution Specification</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.TimedExecutionImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedExecutionImpl extends MinimalEObjectImpl.Container implements TimedExecution {
	/**
	 * The cached value of the '{@link #getBase_ExecutionSpecification() <em>Base Execution Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ExecutionSpecification()
	 * @generated
	 * @ordered
	 */
	protected ExecutionSpecification base_ExecutionSpecification;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsPackage.Literals.TIMED_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification getBase_ExecutionSpecification() {
		if (base_ExecutionSpecification != null && base_ExecutionSpecification.eIsProxy()) {
			InternalEObject oldBase_ExecutionSpecification = (InternalEObject)base_ExecutionSpecification;
			base_ExecutionSpecification = (ExecutionSpecification)eResolveProxy(oldBase_ExecutionSpecification);
			if (base_ExecutionSpecification != oldBase_ExecutionSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsPackage.TIMED_EXECUTION__BASE_EXECUTION_SPECIFICATION, oldBase_ExecutionSpecification, base_ExecutionSpecification));
			}
		}
		return base_ExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification basicGetBase_ExecutionSpecification() {
		return base_ExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ExecutionSpecification(ExecutionSpecification newBase_ExecutionSpecification) {
		ExecutionSpecification oldBase_ExecutionSpecification = base_ExecutionSpecification;
		base_ExecutionSpecification = newBase_ExecutionSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.TIMED_EXECUTION__BASE_EXECUTION_SPECIFICATION, oldBase_ExecutionSpecification, base_ExecutionSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.TIMED_EXECUTION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsPackage.TIMED_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				if (resolve) return getBase_ExecutionSpecification();
				return basicGetBase_ExecutionSpecification();
			case PsPackage.TIMED_EXECUTION__TIME:
				return getTime();
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
			case PsPackage.TIMED_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				setBase_ExecutionSpecification((ExecutionSpecification)newValue);
				return;
			case PsPackage.TIMED_EXECUTION__TIME:
				setTime((Integer)newValue);
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
			case PsPackage.TIMED_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				setBase_ExecutionSpecification((ExecutionSpecification)null);
				return;
			case PsPackage.TIMED_EXECUTION__TIME:
				setTime(TIME_EDEFAULT);
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
			case PsPackage.TIMED_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				return base_ExecutionSpecification != null;
			case PsPackage.TIMED_EXECUTION__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //TimedExecutionImpl
