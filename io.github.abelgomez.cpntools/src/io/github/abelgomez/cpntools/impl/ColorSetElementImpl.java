/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.ColorSetElement;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.SimpleColorSet;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Set Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ColorSetElementImpl#getSimpleColorSet <em>Simple Color Set</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ColorSetElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorSetElementImpl extends MinimalEObjectImpl.Container implements ColorSetElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorSetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.COLOR_SET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleColorSet getSimpleColorSet() {
		if (eContainerFeatureID() != CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET) return null;
		return (SimpleColorSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleColorSet(SimpleColorSet newSimpleColorSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSimpleColorSet, CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleColorSet(SimpleColorSet newSimpleColorSet) {
		if (newSimpleColorSet != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET && newSimpleColorSet != null)) {
			if (EcoreUtil.isAncestor(this, newSimpleColorSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSimpleColorSet != null)
				msgs = ((InternalEObject)newSimpleColorSet).eInverseAdd(this, CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS, SimpleColorSet.class, msgs);
			msgs = basicSetSimpleColorSet(newSimpleColorSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET, newSimpleColorSet, newSimpleColorSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.COLOR_SET_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSimpleColorSet((SimpleColorSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET:
				return basicSetSimpleColorSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS, SimpleColorSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET:
				return getSimpleColorSet();
			case CpntoolsPackage.COLOR_SET_ELEMENT__NAME:
				return getName();
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
			case CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET:
				setSimpleColorSet((SimpleColorSet)newValue);
				return;
			case CpntoolsPackage.COLOR_SET_ELEMENT__NAME:
				setName((String)newValue);
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
			case CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET:
				setSimpleColorSet((SimpleColorSet)null);
				return;
			case CpntoolsPackage.COLOR_SET_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET:
				return getSimpleColorSet() != null;
			case CpntoolsPackage.COLOR_SET_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ColorSetElementImpl
