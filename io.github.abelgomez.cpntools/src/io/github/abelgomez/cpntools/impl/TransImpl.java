/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Trans;

import io.github.abelgomez.cpntools.TransCond;
import io.github.abelgomez.cpntools.TransPriority;
import io.github.abelgomez.cpntools.TransTime;
import java.lang.Boolean;
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
 * An implementation of the model object '<em><b>Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getPage <em>Page</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getText <em>Text</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.TransImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransImpl extends DiagramElementImpl implements Trans {
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
	 * The default value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected boolean explicit = EXPLICIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected TransCond cond;

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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected TransPriority priority;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected TransTime time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.TRANS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicit() {
		return explicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicit(boolean newExplicit) {
		boolean oldExplicit = explicit;
		explicit = newExplicit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__EXPLICIT, oldExplicit, explicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransCond getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(TransCond newCond, NotificationChain msgs) {
		TransCond oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__COND, oldCond, newCond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(TransCond newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.TRANS__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.TRANS__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (eContainerFeatureID() != CpntoolsPackage.TRANS__PAGE) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(Page newPage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPage, CpntoolsPackage.TRANS__PAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		if (newPage != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.TRANS__PAGE && newPage != null)) {
			if (EcoreUtil.isAncestor(this, newPage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, CpntoolsPackage.PAGE__TRANSS, Page.class, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__PAGE, newPage, newPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, CpntoolsPackage.TRANS__ARCS, CpntoolsPackage.ARC__TRANS);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(TransPriority newPriority, NotificationChain msgs) {
		TransPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(TransPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.TRANS__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.TRANS__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransTime getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TransTime newTime, NotificationChain msgs) {
		TransTime oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TransTime newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.TRANS__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpntoolsPackage.TRANS__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.TRANS__TIME, newTime, newTime));
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
			case CpntoolsPackage.TRANS__PAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPage((Page)otherEnd, msgs);
			case CpntoolsPackage.TRANS__ARCS:
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
			case CpntoolsPackage.TRANS__COND:
				return basicSetCond(null, msgs);
			case CpntoolsPackage.TRANS__PAGE:
				return basicSetPage(null, msgs);
			case CpntoolsPackage.TRANS__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.TRANS__PRIORITY:
				return basicSetPriority(null, msgs);
			case CpntoolsPackage.TRANS__TIME:
				return basicSetTime(null, msgs);
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
			case CpntoolsPackage.TRANS__PAGE:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.PAGE__TRANSS, Page.class, msgs);
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
			case CpntoolsPackage.TRANS__HEIGHT:
				return getHeight();
			case CpntoolsPackage.TRANS__WIDTH:
				return getWidth();
			case CpntoolsPackage.TRANS__EXPLICIT:
				return isExplicit();
			case CpntoolsPackage.TRANS__COND:
				return getCond();
			case CpntoolsPackage.TRANS__PAGE:
				return getPage();
			case CpntoolsPackage.TRANS__TEXT:
				return getText();
			case CpntoolsPackage.TRANS__ARCS:
				return getArcs();
			case CpntoolsPackage.TRANS__PRIORITY:
				return getPriority();
			case CpntoolsPackage.TRANS__TIME:
				return getTime();
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
			case CpntoolsPackage.TRANS__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case CpntoolsPackage.TRANS__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CpntoolsPackage.TRANS__EXPLICIT:
				setExplicit((Boolean)newValue);
				return;
			case CpntoolsPackage.TRANS__COND:
				setCond((TransCond)newValue);
				return;
			case CpntoolsPackage.TRANS__PAGE:
				setPage((Page)newValue);
				return;
			case CpntoolsPackage.TRANS__TEXT:
				setText((String)newValue);
				return;
			case CpntoolsPackage.TRANS__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case CpntoolsPackage.TRANS__PRIORITY:
				setPriority((TransPriority)newValue);
				return;
			case CpntoolsPackage.TRANS__TIME:
				setTime((TransTime)newValue);
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
			case CpntoolsPackage.TRANS__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CpntoolsPackage.TRANS__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CpntoolsPackage.TRANS__EXPLICIT:
				setExplicit(EXPLICIT_EDEFAULT);
				return;
			case CpntoolsPackage.TRANS__COND:
				setCond((TransCond)null);
				return;
			case CpntoolsPackage.TRANS__PAGE:
				setPage((Page)null);
				return;
			case CpntoolsPackage.TRANS__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case CpntoolsPackage.TRANS__ARCS:
				getArcs().clear();
				return;
			case CpntoolsPackage.TRANS__PRIORITY:
				setPriority((TransPriority)null);
				return;
			case CpntoolsPackage.TRANS__TIME:
				setTime((TransTime)null);
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
			case CpntoolsPackage.TRANS__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case CpntoolsPackage.TRANS__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CpntoolsPackage.TRANS__EXPLICIT:
				return explicit != EXPLICIT_EDEFAULT;
			case CpntoolsPackage.TRANS__COND:
				return cond != null;
			case CpntoolsPackage.TRANS__PAGE:
				return getPage() != null;
			case CpntoolsPackage.TRANS__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case CpntoolsPackage.TRANS__ARCS:
				return arcs != null && !arcs.isEmpty();
			case CpntoolsPackage.TRANS__PRIORITY:
				return priority != null;
			case CpntoolsPackage.TRANS__TIME:
				return time != null;
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
		result.append(", explicit: ");
		result.append(explicit);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //TransImpl
