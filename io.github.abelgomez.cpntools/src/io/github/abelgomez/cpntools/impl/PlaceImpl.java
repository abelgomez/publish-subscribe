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

import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.ColorSet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Fusion;
import io.github.abelgomez.cpntools.Initmark;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Port;

import java.lang.Integer;
import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getInitmark <em>Initmark</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getFusion <em>Fusion</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getPage <em>Page</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getText <em>Text</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PlaceImpl#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends DiagramElementImpl implements Place {
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ColorSet type;

	/**
	 * The cached value of the '{@link #getInitmark() <em>Initmark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitmark()
	 * @generated
	 * @ordered
	 */
	protected Initmark initmark;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getFusion() <em>Fusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFusion()
	 * @generated
	 * @ordered
	 */
	protected Fusion fusion;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSet getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ColorSet)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpntoolsPackage.PLACE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSet basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ColorSet newType) {
		ColorSet oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initmark getInitmark() {
		return initmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitmark(Initmark newInitmark, NotificationChain msgs) {
		Initmark oldInitmark = initmark;
		initmark = newInitmark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__INITMARK, oldInitmark, newInitmark);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitmark(Initmark newInitmark) {
		if (newInitmark != initmark) {
			NotificationChain msgs = null;
			if (initmark != null)
				msgs = ((InternalEObject)initmark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.PLACE__INITMARK, null, msgs);
			if (newInitmark != null)
				msgs = ((InternalEObject)newInitmark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.PLACE__INITMARK, null, msgs);
			msgs = basicSetInitmark(newInitmark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__INITMARK, newInitmark, newInitmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Port newPort, NotificationChain msgs) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.PLACE__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.PLACE__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fusion getFusion() {
		if (fusion != null && fusion.eIsProxy()) {
			InternalEObject oldFusion = (InternalEObject)fusion;
			fusion = (Fusion)eResolveProxy(oldFusion);
			if (fusion != oldFusion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpntoolsPackage.PLACE__FUSION, oldFusion, fusion));
			}
		}
		return fusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fusion basicGetFusion() {
		return fusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFusion(Fusion newFusion, NotificationChain msgs) {
		Fusion oldFusion = fusion;
		fusion = newFusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__FUSION, oldFusion, newFusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFusion(Fusion newFusion) {
		if (newFusion != fusion) {
			NotificationChain msgs = null;
			if (fusion != null)
				msgs = ((InternalEObject)fusion).eInverseRemove(this, CpntoolsPackage.FUSION__PLACES, Fusion.class, msgs);
			if (newFusion != null)
				msgs = ((InternalEObject)newFusion).eInverseAdd(this, CpntoolsPackage.FUSION__PLACES, Fusion.class, msgs);
			msgs = basicSetFusion(newFusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__FUSION, newFusion, newFusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (eContainerFeatureID() != CpntoolsPackage.PLACE__PAGE) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Page newPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPage, CpntoolsPackage.PLACE__PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		if (newPage != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.PLACE__PAGE && newPage != null)) {
			if (EcoreUtil.isAncestor(this, newPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, CpntoolsPackage.PAGE__PLACES, Page.class, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PLACE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, CpntoolsPackage.PLACE__ARCS, CpntoolsPackage.ARC__PLACE);
		}
		return arcs;
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
			case CpntoolsPackage.PLACE__FUSION:
				if (fusion != null)
					msgs = ((InternalEObject)fusion).eInverseRemove(this, CpntoolsPackage.FUSION__PLACES, Fusion.class, msgs);
				return basicSetFusion((Fusion)otherEnd, msgs);
			case CpntoolsPackage.PLACE__PAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPage((Page)otherEnd, msgs);
			case CpntoolsPackage.PLACE__ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArcs()).basicAdd(otherEnd, msgs);
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
			case CpntoolsPackage.PLACE__INITMARK:
				return basicSetInitmark(null, msgs);
			case CpntoolsPackage.PLACE__PORT:
				return basicSetPort(null, msgs);
			case CpntoolsPackage.PLACE__FUSION:
				return basicSetFusion(null, msgs);
			case CpntoolsPackage.PLACE__PAGE:
				return basicSetPage(null, msgs);
			case CpntoolsPackage.PLACE__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
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
			case CpntoolsPackage.PLACE__PAGE:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.PAGE__PLACES, Page.class, msgs);
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
			case CpntoolsPackage.PLACE__HEIGHT:
				return getHeight();
			case CpntoolsPackage.PLACE__WIDTH:
				return getWidth();
			case CpntoolsPackage.PLACE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CpntoolsPackage.PLACE__INITMARK:
				return getInitmark();
			case CpntoolsPackage.PLACE__PORT:
				return getPort();
			case CpntoolsPackage.PLACE__FUSION:
				if (resolve) return getFusion();
				return basicGetFusion();
			case CpntoolsPackage.PLACE__PAGE:
				return getPage();
			case CpntoolsPackage.PLACE__TEXT:
				return getText();
			case CpntoolsPackage.PLACE__ARCS:
				return getArcs();
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
			case CpntoolsPackage.PLACE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case CpntoolsPackage.PLACE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CpntoolsPackage.PLACE__TYPE:
				setType((ColorSet)newValue);
				return;
			case CpntoolsPackage.PLACE__INITMARK:
				setInitmark((Initmark)newValue);
				return;
			case CpntoolsPackage.PLACE__PORT:
				setPort((Port)newValue);
				return;
			case CpntoolsPackage.PLACE__FUSION:
				setFusion((Fusion)newValue);
				return;
			case CpntoolsPackage.PLACE__PAGE:
				setPage((Page)newValue);
				return;
			case CpntoolsPackage.PLACE__TEXT:
				setText((String)newValue);
				return;
			case CpntoolsPackage.PLACE__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
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
			case CpntoolsPackage.PLACE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CpntoolsPackage.PLACE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CpntoolsPackage.PLACE__TYPE:
				setType((ColorSet)null);
				return;
			case CpntoolsPackage.PLACE__INITMARK:
				setInitmark((Initmark)null);
				return;
			case CpntoolsPackage.PLACE__PORT:
				setPort((Port)null);
				return;
			case CpntoolsPackage.PLACE__FUSION:
				setFusion((Fusion)null);
				return;
			case CpntoolsPackage.PLACE__PAGE:
				setPage((Page)null);
				return;
			case CpntoolsPackage.PLACE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case CpntoolsPackage.PLACE__ARCS:
				getArcs().clear();
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
			case CpntoolsPackage.PLACE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case CpntoolsPackage.PLACE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CpntoolsPackage.PLACE__TYPE:
				return type != null;
			case CpntoolsPackage.PLACE__INITMARK:
				return initmark != null;
			case CpntoolsPackage.PLACE__PORT:
				return port != null;
			case CpntoolsPackage.PLACE__FUSION:
				return fusion != null;
			case CpntoolsPackage.PLACE__PAGE:
				return getPage() != null;
			case CpntoolsPackage.PLACE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case CpntoolsPackage.PLACE__ARCS:
				return arcs != null && !arcs.isEmpty();
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
		result.append(" (height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
