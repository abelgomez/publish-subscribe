/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.ColorSetElement;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Initmark;
import io.github.abelgomez.cpntools.Mark;

import java.lang.Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.MarkImpl#getValue <em>Value</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.MarkImpl#getInitmark <em>Initmark</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.MarkImpl#getColorSetElement <em>Color Set Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkImpl extends MinimalEObjectImpl.Container implements Mark {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColorSetElement() <em>Color Set Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorSetElement()
	 * @generated
	 * @ordered
	 */
	protected ColorSetElement colorSetElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.MARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.MARK__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initmark getInitmark() {
		if (eContainerFeatureID() != CpntoolsPackage.MARK__INITMARK) return null;
		return (Initmark)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitmark(Initmark newInitmark, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInitmark, CpntoolsPackage.MARK__INITMARK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitmark(Initmark newInitmark) {
		if (newInitmark != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.MARK__INITMARK && newInitmark != null)) {
			if (EcoreUtil.isAncestor(this, newInitmark))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInitmark != null)
				msgs = ((InternalEObject)newInitmark).eInverseAdd(this, CpntoolsPackage.INITMARK__MARKS, Initmark.class, msgs);
			msgs = basicSetInitmark(newInitmark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.MARK__INITMARK, newInitmark, newInitmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSetElement getColorSetElement() {
		if (colorSetElement != null && colorSetElement.eIsProxy()) {
			InternalEObject oldColorSetElement = (InternalEObject)colorSetElement;
			colorSetElement = (ColorSetElement)eResolveProxy(oldColorSetElement);
			if (colorSetElement != oldColorSetElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpntoolsPackage.MARK__COLOR_SET_ELEMENT, oldColorSetElement, colorSetElement));
			}
		}
		return colorSetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSetElement basicGetColorSetElement() {
		return colorSetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorSetElement(ColorSetElement newColorSetElement) {
		ColorSetElement oldColorSetElement = colorSetElement;
		colorSetElement = newColorSetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.MARK__COLOR_SET_ELEMENT, oldColorSetElement, colorSetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.MARK__INITMARK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInitmark((Initmark)otherEnd, msgs);
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
			case CpntoolsPackage.MARK__INITMARK:
				return basicSetInitmark(null, msgs);
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
			case CpntoolsPackage.MARK__INITMARK:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.INITMARK__MARKS, Initmark.class, msgs);
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
			case CpntoolsPackage.MARK__VALUE:
				return getValue();
			case CpntoolsPackage.MARK__INITMARK:
				return getInitmark();
			case CpntoolsPackage.MARK__COLOR_SET_ELEMENT:
				if (resolve) return getColorSetElement();
				return basicGetColorSetElement();
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
			case CpntoolsPackage.MARK__VALUE:
				setValue((Integer)newValue);
				return;
			case CpntoolsPackage.MARK__INITMARK:
				setInitmark((Initmark)newValue);
				return;
			case CpntoolsPackage.MARK__COLOR_SET_ELEMENT:
				setColorSetElement((ColorSetElement)newValue);
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
			case CpntoolsPackage.MARK__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CpntoolsPackage.MARK__INITMARK:
				setInitmark((Initmark)null);
				return;
			case CpntoolsPackage.MARK__COLOR_SET_ELEMENT:
				setColorSetElement((ColorSetElement)null);
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
			case CpntoolsPackage.MARK__VALUE:
				return value != VALUE_EDEFAULT;
			case CpntoolsPackage.MARK__INITMARK:
				return getInitmark() != null;
			case CpntoolsPackage.MARK__COLOR_SET_ELEMENT:
				return colorSetElement != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //MarkImpl
