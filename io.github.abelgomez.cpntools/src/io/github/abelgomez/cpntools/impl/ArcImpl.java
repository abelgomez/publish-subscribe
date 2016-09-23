/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.Annot;
import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Orientation;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Trans;

import java.lang.Integer;
import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getHeadsize <em>Headsize</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getCurrentcyckle <em>Currentcyckle</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getTrans <em>Trans</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getAnnot <em>Annot</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.ArcImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends DiagramElementImpl implements Arc {
	/**
	 * The default value of the '{@link #getHeadsize() <em>Headsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadsize()
	 * @generated
	 * @ordered
	 */
	protected static final int HEADSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeadsize() <em>Headsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadsize()
	 * @generated
	 * @ordered
	 */
	protected int headsize = HEADSIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.PTO_T;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentcyckle() <em>Currentcyckle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentcyckle()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENTCYCKLE_EDEFAULT = "2";

	/**
	 * The cached value of the '{@link #getCurrentcyckle() <em>Currentcyckle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentcyckle()
	 * @generated
	 * @ordered
	 */
	protected String currentcyckle = CURRENTCYCKLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrans() <em>Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrans()
	 * @generated
	 * @ordered
	 */
	protected Trans trans;

	/**
	 * The cached value of the '{@link #getAnnot() <em>Annot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnot()
	 * @generated
	 * @ordered
	 */
	protected Annot annot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeadsize() {
		return headsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadsize(int newHeadsize) {
		int oldHeadsize = headsize;
		headsize = newHeadsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__HEADSIZE, oldHeadsize, headsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Place)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpntoolsPackage.ARC__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__PLACE, oldPlace, newPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject)place).eInverseRemove(this, CpntoolsPackage.PLACE__ARCS, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, CpntoolsPackage.PLACE__ARCS, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentcyckle() {
		return currentcyckle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentcyckle(String newCurrentcyckle) {
		String oldCurrentcyckle = currentcyckle;
		currentcyckle = newCurrentcyckle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__CURRENTCYCKLE, oldCurrentcyckle, currentcyckle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trans getTrans() {
		if (trans != null && trans.eIsProxy()) {
			InternalEObject oldTrans = (InternalEObject)trans;
			trans = (Trans)eResolveProxy(oldTrans);
			if (trans != oldTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpntoolsPackage.ARC__TRANS, oldTrans, trans));
			}
		}
		return trans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trans basicGetTrans() {
		return trans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrans(Trans newTrans, NotificationChain msgs) {
		Trans oldTrans = trans;
		trans = newTrans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__TRANS, oldTrans, newTrans);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrans(Trans newTrans) {
		if (newTrans != trans) {
			NotificationChain msgs = null;
			if (trans != null)
				msgs = ((InternalEObject)trans).eInverseRemove(this, CpntoolsPackage.TRANS__ARCS, Trans.class, msgs);
			if (newTrans != null)
				msgs = ((InternalEObject)newTrans).eInverseAdd(this, CpntoolsPackage.TRANS__ARCS, Trans.class, msgs);
			msgs = basicSetTrans(newTrans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__TRANS, newTrans, newTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annot getAnnot() {
		return annot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnot(Annot newAnnot, NotificationChain msgs) {
		Annot oldAnnot = annot;
		annot = newAnnot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__ANNOT, oldAnnot, newAnnot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnot(Annot newAnnot) {
		if (newAnnot != annot) {
			NotificationChain msgs = null;
			if (annot != null)
				msgs = ((InternalEObject)annot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.ARC__ANNOT, null, msgs);
			if (newAnnot != null)
				msgs = ((InternalEObject)newAnnot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.ARC__ANNOT, null, msgs);
			msgs = basicSetAnnot(newAnnot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__ANNOT, newAnnot, newAnnot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (eContainerFeatureID() != CpntoolsPackage.ARC__PAGE) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Page newPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPage, CpntoolsPackage.ARC__PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		if (newPage != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.ARC__PAGE && newPage != null)) {
			if (EcoreUtil.isAncestor(this, newPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, CpntoolsPackage.PAGE__ARCS, Page.class, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.ARC__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.ARC__PLACE:
				if (place != null)
					msgs = ((InternalEObject)place).eInverseRemove(this, CpntoolsPackage.PLACE__ARCS, Place.class, msgs);
				return basicSetPlace((Place)otherEnd, msgs);
			case CpntoolsPackage.ARC__TRANS:
				if (trans != null)
					msgs = ((InternalEObject)trans).eInverseRemove(this, CpntoolsPackage.TRANS__ARCS, Trans.class, msgs);
				return basicSetTrans((Trans)otherEnd, msgs);
			case CpntoolsPackage.ARC__PAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case CpntoolsPackage.ARC__PLACE:
				return basicSetPlace(null, msgs);
			case CpntoolsPackage.ARC__TRANS:
				return basicSetTrans(null, msgs);
			case CpntoolsPackage.ARC__ANNOT:
				return basicSetAnnot(null, msgs);
			case CpntoolsPackage.ARC__PAGE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CpntoolsPackage.ARC__PAGE:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.PAGE__ARCS, Page.class, msgs);
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
			case CpntoolsPackage.ARC__HEADSIZE:
				return getHeadsize();
			case CpntoolsPackage.ARC__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
			case CpntoolsPackage.ARC__ORIENTATION:
				return getOrientation();
			case CpntoolsPackage.ARC__CURRENTCYCKLE:
				return getCurrentcyckle();
			case CpntoolsPackage.ARC__ORDER:
				return getOrder();
			case CpntoolsPackage.ARC__TRANS:
				if (resolve) return getTrans();
				return basicGetTrans();
			case CpntoolsPackage.ARC__ANNOT:
				return getAnnot();
			case CpntoolsPackage.ARC__PAGE:
				return getPage();
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
			case CpntoolsPackage.ARC__HEADSIZE:
				setHeadsize((Integer)newValue);
				return;
			case CpntoolsPackage.ARC__PLACE:
				setPlace((Place)newValue);
				return;
			case CpntoolsPackage.ARC__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case CpntoolsPackage.ARC__CURRENTCYCKLE:
				setCurrentcyckle((String)newValue);
				return;
			case CpntoolsPackage.ARC__ORDER:
				setOrder((Integer)newValue);
				return;
			case CpntoolsPackage.ARC__TRANS:
				setTrans((Trans)newValue);
				return;
			case CpntoolsPackage.ARC__ANNOT:
				setAnnot((Annot)newValue);
				return;
			case CpntoolsPackage.ARC__PAGE:
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
			case CpntoolsPackage.ARC__HEADSIZE:
				setHeadsize(HEADSIZE_EDEFAULT);
				return;
			case CpntoolsPackage.ARC__PLACE:
				setPlace((Place)null);
				return;
			case CpntoolsPackage.ARC__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case CpntoolsPackage.ARC__CURRENTCYCKLE:
				setCurrentcyckle(CURRENTCYCKLE_EDEFAULT);
				return;
			case CpntoolsPackage.ARC__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case CpntoolsPackage.ARC__TRANS:
				setTrans((Trans)null);
				return;
			case CpntoolsPackage.ARC__ANNOT:
				setAnnot((Annot)null);
				return;
			case CpntoolsPackage.ARC__PAGE:
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
			case CpntoolsPackage.ARC__HEADSIZE:
				return headsize != HEADSIZE_EDEFAULT;
			case CpntoolsPackage.ARC__PLACE:
				return place != null;
			case CpntoolsPackage.ARC__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case CpntoolsPackage.ARC__CURRENTCYCKLE:
				return CURRENTCYCKLE_EDEFAULT == null ? currentcyckle != null : !CURRENTCYCKLE_EDEFAULT.equals(currentcyckle);
			case CpntoolsPackage.ARC__ORDER:
				return order != ORDER_EDEFAULT;
			case CpntoolsPackage.ARC__TRANS:
				return trans != null;
			case CpntoolsPackage.ARC__ANNOT:
				return annot != null;
			case CpntoolsPackage.ARC__PAGE:
				return getPage() != null;
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
		result.append(" (headsize: ");
		result.append(headsize);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", currentcyckle: ");
		result.append(currentcyckle);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
