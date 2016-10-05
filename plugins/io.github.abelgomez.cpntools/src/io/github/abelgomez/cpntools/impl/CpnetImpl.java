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

import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Fusion;
import io.github.abelgomez.cpntools.Globbox;
import io.github.abelgomez.cpntools.Page;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cpnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.CpnetImpl#getFusions <em>Fusions</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.CpnetImpl#getGlobbox <em>Globbox</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.CpnetImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpnetImpl extends MinimalEObjectImpl.Container implements Cpnet {
	/**
	 * The cached value of the '{@link #getFusions() <em>Fusions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFusions()
	 * @generated
	 * @ordered
	 */
	protected EList<Fusion> fusions;

	/**
	 * The cached value of the '{@link #getGlobbox() <em>Globbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobbox()
	 * @generated
	 * @ordered
	 */
	protected Globbox globbox;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected Page page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.CPNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fusion> getFusions() {
		if (fusions == null) {
			fusions = new EObjectContainmentWithInverseEList<Fusion>(Fusion.class, this, CpntoolsPackage.CPNET__FUSIONS, CpntoolsPackage.FUSION__CPNET);
		}
		return fusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Globbox getGlobbox() {
		return globbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobbox(Globbox newGlobbox, NotificationChain msgs) {
		Globbox oldGlobbox = globbox;
		globbox = newGlobbox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__GLOBBOX, oldGlobbox, newGlobbox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobbox(Globbox newGlobbox) {
		if (newGlobbox != globbox) {
			NotificationChain msgs = null;
			if (globbox != null)
				msgs = ((InternalEObject)globbox).eInverseRemove(this, CpntoolsPackage.GLOBBOX__CPNET, Globbox.class, msgs);
			if (newGlobbox != null)
				msgs = ((InternalEObject)newGlobbox).eInverseAdd(this, CpntoolsPackage.GLOBBOX__CPNET, Globbox.class, msgs);
			msgs = basicSetGlobbox(newGlobbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__GLOBBOX, newGlobbox, newGlobbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Page newPage, NotificationChain msgs) {
		Page oldPage = page;
		page = newPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__PAGE, oldPage, newPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		if (newPage != page) {
			NotificationChain msgs = null;
			if (page != null)
				msgs = ((InternalEObject)page).eInverseRemove(this, CpntoolsPackage.PAGE__CPNET, Page.class, msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, CpntoolsPackage.PAGE__CPNET, Page.class, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.CPNET__PAGE, newPage, newPage));
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
			case CpntoolsPackage.CPNET__FUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFusions()).basicAdd(otherEnd, msgs);
			case CpntoolsPackage.CPNET__GLOBBOX:
				if (globbox != null)
					msgs = ((InternalEObject)globbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.CPNET__GLOBBOX, null, msgs);
				return basicSetGlobbox((Globbox)otherEnd, msgs);
			case CpntoolsPackage.CPNET__PAGE:
				if (page != null)
					msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.CPNET__PAGE, null, msgs);
				return basicSetPage((Page)otherEnd, msgs);
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
			case CpntoolsPackage.CPNET__FUSIONS:
				return ((InternalEList<?>)getFusions()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.CPNET__GLOBBOX:
				return basicSetGlobbox(null, msgs);
			case CpntoolsPackage.CPNET__PAGE:
				return basicSetPage(null, msgs);
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
			case CpntoolsPackage.CPNET__FUSIONS:
				return getFusions();
			case CpntoolsPackage.CPNET__GLOBBOX:
				return getGlobbox();
			case CpntoolsPackage.CPNET__PAGE:
				return getPage();
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
			case CpntoolsPackage.CPNET__FUSIONS:
				getFusions().clear();
				getFusions().addAll((Collection<? extends Fusion>)newValue);
				return;
			case CpntoolsPackage.CPNET__GLOBBOX:
				setGlobbox((Globbox)newValue);
				return;
			case CpntoolsPackage.CPNET__PAGE:
				setPage((Page)newValue);
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
			case CpntoolsPackage.CPNET__FUSIONS:
				getFusions().clear();
				return;
			case CpntoolsPackage.CPNET__GLOBBOX:
				setGlobbox((Globbox)null);
				return;
			case CpntoolsPackage.CPNET__PAGE:
				setPage((Page)null);
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
			case CpntoolsPackage.CPNET__FUSIONS:
				return fusions != null && !fusions.isEmpty();
			case CpntoolsPackage.CPNET__GLOBBOX:
				return globbox != null;
			case CpntoolsPackage.CPNET__PAGE:
				return page != null;
		}
		return super.eIsSet(featureID);
	}

} //CpnetImpl
