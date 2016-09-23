/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.ColorSetElement;
import io.github.abelgomez.cpntools.CompoundColorSet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.SimpleColorSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Color Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.SimpleColorSetImpl#getColorElements <em>Color Elements</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.SimpleColorSetImpl#getUsedIn <em>Used In</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimpleColorSetImpl extends ColorSetImpl implements SimpleColorSet {
	/**
	 * The cached value of the '{@link #getColorElements() <em>Color Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ColorSetElement> colorElements;

	/**
	 * The cached value of the '{@link #getUsedIn() <em>Used In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<CompoundColorSet> usedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleColorSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.SIMPLE_COLOR_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColorSetElement> getColorElements() {
		if (colorElements == null) {
			colorElements = new EObjectContainmentWithInverseEList<ColorSetElement>(ColorSetElement.class, this, CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS, CpntoolsPackage.COLOR_SET_ELEMENT__SIMPLE_COLOR_SET);
		}
		return colorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompoundColorSet> getUsedIn() {
		if (usedIn == null) {
			usedIn = new EObjectWithInverseResolvingEList.ManyInverse<CompoundColorSet>(CompoundColorSet.class, this, CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN, CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS);
		}
		return usedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColorElements()).basicAdd(otherEnd, msgs);
			case CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedIn()).basicAdd(otherEnd, msgs);
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
			case CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS:
				return ((InternalEList<?>)getColorElements()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN:
				return ((InternalEList<?>)getUsedIn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS:
				return getColorElements();
			case CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN:
				return getUsedIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS:
				getColorElements().clear();
				getColorElements().addAll((Collection<? extends ColorSetElement>)newValue);
				return;
			case CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN:
				getUsedIn().clear();
				getUsedIn().addAll((Collection<? extends CompoundColorSet>)newValue);
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
			case CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS:
				getColorElements().clear();
				return;
			case CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN:
				getUsedIn().clear();
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
			case CpntoolsPackage.SIMPLE_COLOR_SET__COLOR_ELEMENTS:
				return colorElements != null && !colorElements.isEmpty();
			case CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN:
				return usedIn != null && !usedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleColorSetImpl
