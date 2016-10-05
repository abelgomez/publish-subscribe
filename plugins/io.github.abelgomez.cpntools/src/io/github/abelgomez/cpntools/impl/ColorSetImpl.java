/*******************************************************************************
 * Copyright (c) 2016 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Abel Gómez (agomezlla@uoc.edu) - initial API and implementation
 *******************************************************************************/
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.ColorSet;
import io.github.abelgomez.cpntools.CpntoolsPackage;

import java.lang.Boolean;
import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ColorSetImpl#getIdname <em>Idname</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ColorSetImpl#getColorSetType <em>Color Set Type</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ColorSetImpl#isTimed <em>Timed</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ColorSetImpl#getDeclare <em>Declare</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColorSetImpl extends DeclarationImpl implements ColorSet {
	/**
	 * The default value of the '{@link #getIdname() <em>Idname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdname()
	 * @generated
	 * @ordered
	 */
	protected static final String IDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdname() <em>Idname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdname()
	 * @generated
	 * @ordered
	 */
	protected String idname = IDNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorSetType() <em>Color Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorSetType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_SET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorSetType() <em>Color Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorSetType()
	 * @generated
	 * @ordered
	 */
	protected String colorSetType = COLOR_SET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTimed() <em>Timed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTimed() <em>Timed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimed()
	 * @generated
	 * @ordered
	 */
	protected boolean timed = TIMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeclare() <em>Declare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclare()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclare() <em>Declare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclare()
	 * @generated
	 * @ordered
	 */
	protected String declare = DECLARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.COLOR_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdname() {
		return idname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdname(String newIdname) {
		String oldIdname = idname;
		idname = newIdname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.COLOR_SET__IDNAME, oldIdname, idname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorSetType() {
		return colorSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorSetType(String newColorSetType) {
		String oldColorSetType = colorSetType;
		colorSetType = newColorSetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.COLOR_SET__COLOR_SET_TYPE, oldColorSetType, colorSetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimed() {
		return timed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimed(boolean newTimed) {
		boolean oldTimed = timed;
		timed = newTimed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.COLOR_SET__TIMED, oldTimed, timed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclare() {
		return declare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclare(String newDeclare) {
		String oldDeclare = declare;
		declare = newDeclare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.COLOR_SET__DECLARE, oldDeclare, declare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpntoolsPackage.COLOR_SET__IDNAME:
				return getIdname();
			case CpntoolsPackage.COLOR_SET__COLOR_SET_TYPE:
				return getColorSetType();
			case CpntoolsPackage.COLOR_SET__TIMED:
				return isTimed();
			case CpntoolsPackage.COLOR_SET__DECLARE:
				return getDeclare();
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
			case CpntoolsPackage.COLOR_SET__IDNAME:
				setIdname((String)newValue);
				return;
			case CpntoolsPackage.COLOR_SET__COLOR_SET_TYPE:
				setColorSetType((String)newValue);
				return;
			case CpntoolsPackage.COLOR_SET__TIMED:
				setTimed((Boolean)newValue);
				return;
			case CpntoolsPackage.COLOR_SET__DECLARE:
				setDeclare((String)newValue);
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
			case CpntoolsPackage.COLOR_SET__IDNAME:
				setIdname(IDNAME_EDEFAULT);
				return;
			case CpntoolsPackage.COLOR_SET__COLOR_SET_TYPE:
				setColorSetType(COLOR_SET_TYPE_EDEFAULT);
				return;
			case CpntoolsPackage.COLOR_SET__TIMED:
				setTimed(TIMED_EDEFAULT);
				return;
			case CpntoolsPackage.COLOR_SET__DECLARE:
				setDeclare(DECLARE_EDEFAULT);
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
			case CpntoolsPackage.COLOR_SET__IDNAME:
				return IDNAME_EDEFAULT == null ? idname != null : !IDNAME_EDEFAULT.equals(idname);
			case CpntoolsPackage.COLOR_SET__COLOR_SET_TYPE:
				return COLOR_SET_TYPE_EDEFAULT == null ? colorSetType != null : !COLOR_SET_TYPE_EDEFAULT.equals(colorSetType);
			case CpntoolsPackage.COLOR_SET__TIMED:
				return timed != TIMED_EDEFAULT;
			case CpntoolsPackage.COLOR_SET__DECLARE:
				return DECLARE_EDEFAULT == null ? declare != null : !DECLARE_EDEFAULT.equals(declare);
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
		result.append(" (idname: ");
		result.append(idname);
		result.append(", colorSetType: ");
		result.append(colorSetType);
		result.append(", timed: ");
		result.append(timed);
		result.append(", declare: ");
		result.append(declare);
		result.append(')');
		return result.toString();
	}

} //ColorSetImpl
