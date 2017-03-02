/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.PsPackage;
import io.github.abelgomez.ps.Resource;
import io.github.abelgomez.ps.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.impl.ResourceImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.ResourceImpl#getEpr <em>Epr</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.ResourceImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.ResourceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.ResourceImpl#getTime <em>Time</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.ResourceImpl#getOwningService <em>Owning Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The cached value of the '{@link #getBase_Artifact() <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Artifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact base_Artifact;

	/**
	 * The default value of the '{@link #getEpr() <em>Epr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpr()
	 * @generated
	 * @ordered
	 */
	protected static final String EPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpr() <em>Epr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpr()
	 * @generated
	 * @ordered
	 */
	protected String epr = EPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

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
	 * The cached setting delegate for the '{@link #getOwningService() <em>Owning Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningService()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_SERVICE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PsPackage.Literals.RESOURCE__OWNING_SERVICE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getBase_Artifact() {
		if (base_Artifact != null && base_Artifact.eIsProxy()) {
			InternalEObject oldBase_Artifact = (InternalEObject)base_Artifact;
			base_Artifact = (Artifact)eResolveProxy(oldBase_Artifact);
			if (base_Artifact != oldBase_Artifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsPackage.RESOURCE__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
			}
		}
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetBase_Artifact() {
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Artifact(Artifact newBase_Artifact) {
		Artifact oldBase_Artifact = base_Artifact;
		base_Artifact = newBase_Artifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.RESOURCE__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEpr() {
		return epr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpr(String newEpr) {
		String oldEpr = epr;
		epr = newEpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.RESOURCE__EPR, oldEpr, epr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.RESOURCE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.RESOURCE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.RESOURCE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getOwningService() {
		return (Service)OWNING_SERVICE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetOwningService() {
		return (Service)OWNING_SERVICE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningService(Service newOwningService) {
		OWNING_SERVICE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsPackage.RESOURCE__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
			case PsPackage.RESOURCE__EPR:
				return getEpr();
			case PsPackage.RESOURCE__TAG:
				return getTag();
			case PsPackage.RESOURCE__VALUE:
				return getValue();
			case PsPackage.RESOURCE__TIME:
				return getTime();
			case PsPackage.RESOURCE__OWNING_SERVICE:
				if (resolve) return getOwningService();
				return basicGetOwningService();
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
			case PsPackage.RESOURCE__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
				return;
			case PsPackage.RESOURCE__EPR:
				setEpr((String)newValue);
				return;
			case PsPackage.RESOURCE__TAG:
				setTag((String)newValue);
				return;
			case PsPackage.RESOURCE__VALUE:
				setValue((Double)newValue);
				return;
			case PsPackage.RESOURCE__TIME:
				setTime((Integer)newValue);
				return;
			case PsPackage.RESOURCE__OWNING_SERVICE:
				setOwningService((Service)newValue);
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
			case PsPackage.RESOURCE__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
				return;
			case PsPackage.RESOURCE__EPR:
				setEpr(EPR_EDEFAULT);
				return;
			case PsPackage.RESOURCE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case PsPackage.RESOURCE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PsPackage.RESOURCE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case PsPackage.RESOURCE__OWNING_SERVICE:
				setOwningService((Service)null);
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
			case PsPackage.RESOURCE__BASE_ARTIFACT:
				return base_Artifact != null;
			case PsPackage.RESOURCE__EPR:
				return EPR_EDEFAULT == null ? epr != null : !EPR_EDEFAULT.equals(epr);
			case PsPackage.RESOURCE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case PsPackage.RESOURCE__VALUE:
				return value != VALUE_EDEFAULT;
			case PsPackage.RESOURCE__TIME:
				return time != TIME_EDEFAULT;
			case PsPackage.RESOURCE__OWNING_SERVICE:
				return OWNING_SERVICE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (epr: ");
		result.append(epr);
		result.append(", tag: ");
		result.append(tag);
		result.append(", value: ");
		result.append(value);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
