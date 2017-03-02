/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.PsPackage;
import io.github.abelgomez.ps.Subscription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.impl.SubscriptionImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.SubscriptionImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.SubscriptionImpl#getSubscriptionTime <em>Subscription Time</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.SubscriptionImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends ClientToResourceMessageImpl implements Subscription {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionTime() <em>Subscription Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBSCRIPTION_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubscriptionTime() <em>Subscription Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTime()
	 * @generated
	 * @ordered
	 */
	protected int subscriptionTime = SUBSCRIPTION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected Interaction triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsPackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.SUBSCRIPTION__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.SUBSCRIPTION__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubscriptionTime() {
		return subscriptionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionTime(int newSubscriptionTime) {
		int oldSubscriptionTime = subscriptionTime;
		subscriptionTime = newSubscriptionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.SUBSCRIPTION__SUBSCRIPTION_TIME, oldSubscriptionTime, subscriptionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getTriggers() {
		if (triggers != null && triggers.eIsProxy()) {
			InternalEObject oldTriggers = (InternalEObject)triggers;
			triggers = (Interaction)eResolveProxy(oldTriggers);
			if (triggers != oldTriggers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsPackage.SUBSCRIPTION__TRIGGERS, oldTriggers, triggers));
			}
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetTriggers() {
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggers(Interaction newTriggers) {
		Interaction oldTriggers = triggers;
		triggers = newTriggers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.SUBSCRIPTION__TRIGGERS, oldTriggers, triggers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsPackage.SUBSCRIPTION__MIN_VALUE:
				return getMinValue();
			case PsPackage.SUBSCRIPTION__MAX_VALUE:
				return getMaxValue();
			case PsPackage.SUBSCRIPTION__SUBSCRIPTION_TIME:
				return getSubscriptionTime();
			case PsPackage.SUBSCRIPTION__TRIGGERS:
				if (resolve) return getTriggers();
				return basicGetTriggers();
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
			case PsPackage.SUBSCRIPTION__MIN_VALUE:
				setMinValue((Double)newValue);
				return;
			case PsPackage.SUBSCRIPTION__MAX_VALUE:
				setMaxValue((Double)newValue);
				return;
			case PsPackage.SUBSCRIPTION__SUBSCRIPTION_TIME:
				setSubscriptionTime((Integer)newValue);
				return;
			case PsPackage.SUBSCRIPTION__TRIGGERS:
				setTriggers((Interaction)newValue);
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
			case PsPackage.SUBSCRIPTION__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case PsPackage.SUBSCRIPTION__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case PsPackage.SUBSCRIPTION__SUBSCRIPTION_TIME:
				setSubscriptionTime(SUBSCRIPTION_TIME_EDEFAULT);
				return;
			case PsPackage.SUBSCRIPTION__TRIGGERS:
				setTriggers((Interaction)null);
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
			case PsPackage.SUBSCRIPTION__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case PsPackage.SUBSCRIPTION__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case PsPackage.SUBSCRIPTION__SUBSCRIPTION_TIME:
				return subscriptionTime != SUBSCRIPTION_TIME_EDEFAULT;
			case PsPackage.SUBSCRIPTION__TRIGGERS:
				return triggers != null;
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
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", subscriptionTime: ");
		result.append(subscriptionTime);
		result.append(')');
		return result.toString();
	}

} //SubscriptionImpl
