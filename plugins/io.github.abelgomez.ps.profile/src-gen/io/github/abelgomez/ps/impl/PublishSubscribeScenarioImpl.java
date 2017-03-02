/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.PsPackage;
import io.github.abelgomez.ps.PublishSubscribeScenario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publish Subscribe Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.impl.PublishSubscribeScenarioImpl#getBase_Interaction <em>Base Interaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublishSubscribeScenarioImpl extends MinimalEObjectImpl.Container implements PublishSubscribeScenario {
	/**
	 * The cached value of the '{@link #getBase_Interaction() <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Interaction()
	 * @generated
	 * @ordered
	 */
	protected Interaction base_Interaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishSubscribeScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsPackage.Literals.PUBLISH_SUBSCRIBE_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getBase_Interaction() {
		if (base_Interaction != null && base_Interaction.eIsProxy()) {
			InternalEObject oldBase_Interaction = (InternalEObject)base_Interaction;
			base_Interaction = (Interaction)eResolveProxy(oldBase_Interaction);
			if (base_Interaction != oldBase_Interaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsPackage.PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
			}
		}
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetBase_Interaction() {
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Interaction(Interaction newBase_Interaction) {
		Interaction oldBase_Interaction = base_Interaction;
		base_Interaction = newBase_Interaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsPackage.PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION:
				if (resolve) return getBase_Interaction();
				return basicGetBase_Interaction();
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
			case PsPackage.PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION:
				setBase_Interaction((Interaction)newValue);
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
			case PsPackage.PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION:
				setBase_Interaction((Interaction)null);
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
			case PsPackage.PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION:
				return base_Interaction != null;
		}
		return super.eIsSet(featureID);
	}

} //PublishSubscribeScenarioImpl
