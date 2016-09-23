/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.Block;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Declaration;
import io.github.abelgomez.cpntools.Globbox;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DeclarationImpl#getGlobbox <em>Globbox</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DeclarationImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Globbox getGlobbox() {
		if (eContainerFeatureID() != CpntoolsPackage.DECLARATION__GLOBBOX) return null;
		return (Globbox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobbox(Globbox newGlobbox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGlobbox, CpntoolsPackage.DECLARATION__GLOBBOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobbox(Globbox newGlobbox) {
		if (newGlobbox != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.DECLARATION__GLOBBOX && newGlobbox != null)) {
			if (EcoreUtil.isAncestor(this, newGlobbox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGlobbox != null)
				msgs = ((InternalEObject)newGlobbox).eInverseAdd(this, CpntoolsPackage.GLOBBOX__DECLARATIONS, Globbox.class, msgs);
			msgs = basicSetGlobbox(newGlobbox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DECLARATION__GLOBBOX, newGlobbox, newGlobbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		if (eContainerFeatureID() != CpntoolsPackage.DECLARATION__BLOCK) return null;
		return (Block)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBlock, CpntoolsPackage.DECLARATION__BLOCK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.DECLARATION__BLOCK && newBlock != null)) {
			if (EcoreUtil.isAncestor(this, newBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, CpntoolsPackage.BLOCK__DECLARATIONS, Block.class, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DECLARATION__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.DECLARATION__GLOBBOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGlobbox((Globbox)otherEnd, msgs);
			case CpntoolsPackage.DECLARATION__BLOCK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBlock((Block)otherEnd, msgs);
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
			case CpntoolsPackage.DECLARATION__GLOBBOX:
				return basicSetGlobbox(null, msgs);
			case CpntoolsPackage.DECLARATION__BLOCK:
				return basicSetBlock(null, msgs);
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
			case CpntoolsPackage.DECLARATION__GLOBBOX:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.GLOBBOX__DECLARATIONS, Globbox.class, msgs);
			case CpntoolsPackage.DECLARATION__BLOCK:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.BLOCK__DECLARATIONS, Block.class, msgs);
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
			case CpntoolsPackage.DECLARATION__GLOBBOX:
				return getGlobbox();
			case CpntoolsPackage.DECLARATION__BLOCK:
				return getBlock();
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
			case CpntoolsPackage.DECLARATION__GLOBBOX:
				setGlobbox((Globbox)newValue);
				return;
			case CpntoolsPackage.DECLARATION__BLOCK:
				setBlock((Block)newValue);
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
			case CpntoolsPackage.DECLARATION__GLOBBOX:
				setGlobbox((Globbox)null);
				return;
			case CpntoolsPackage.DECLARATION__BLOCK:
				setBlock((Block)null);
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
			case CpntoolsPackage.DECLARATION__GLOBBOX:
				return getGlobbox() != null;
			case CpntoolsPackage.DECLARATION__BLOCK:
				return getBlock() != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclarationImpl
