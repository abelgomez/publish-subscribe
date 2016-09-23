/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.CompoundColorSet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.SimpleColorSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Color Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.CompoundColorSetImpl#getSimpleColors <em>Simple Colors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompoundColorSetImpl extends ColorSetImpl implements CompoundColorSet {
	/**
	 * The cached value of the '{@link #getSimpleColors() <em>Simple Colors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleColors()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleColorSet> simpleColors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundColorSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.COMPOUND_COLOR_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleColorSet> getSimpleColors() {
		if (simpleColors == null) {
			simpleColors = new EObjectWithInverseResolvingEList.ManyInverse<SimpleColorSet>(SimpleColorSet.class, this, CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS, CpntoolsPackage.SIMPLE_COLOR_SET__USED_IN);
		}
		return simpleColors;
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
			case CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSimpleColors()).basicAdd(otherEnd, msgs);
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
			case CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS:
				return ((InternalEList<?>)getSimpleColors()).basicRemove(otherEnd, msgs);
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
			case CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS:
				return getSimpleColors();
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
			case CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS:
				getSimpleColors().clear();
				getSimpleColors().addAll((Collection<? extends SimpleColorSet>)newValue);
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
			case CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS:
				getSimpleColors().clear();
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
			case CpntoolsPackage.COMPOUND_COLOR_SET__SIMPLE_COLORS:
				return simpleColors != null && !simpleColors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundColorSetImpl
