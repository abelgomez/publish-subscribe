/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.Client;
import io.github.abelgomez.ps.ClientToResourceMessage;
import io.github.abelgomez.ps.PsPackage;
import io.github.abelgomez.ps.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client To Resource Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.impl.ClientToResourceMessageImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.ClientToResourceMessageImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.ClientToResourceMessageImpl#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClientToResourceMessageImpl extends MinimalEObjectImpl.Container implements ClientToResourceMessage {
	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The cached setting delegate for the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RESOURCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PsPackage.Literals.CLIENT_TO_RESOURCE_MESSAGE__RESOURCE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CLIENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PsPackage.Literals.CLIENT_TO_RESOURCE_MESSAGE__CLIENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientToResourceMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsPackage.Literals.CLIENT_TO_RESOURCE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsPackage.CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		return (Resource)RESOURCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return (Resource)RESOURCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		return (Client)CLIENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return (Client)CLIENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
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
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE:
				setBase_Message((Message)newValue);
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
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE:
				setBase_Message((Message)null);
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
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE:
				return base_Message != null;
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__RESOURCE:
				return RESOURCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PsPackage.CLIENT_TO_RESOURCE_MESSAGE__CLIENT:
				return CLIENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ClientToResourceMessageImpl
