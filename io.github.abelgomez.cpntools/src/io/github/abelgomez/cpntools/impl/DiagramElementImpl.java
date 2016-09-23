/**
 */
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.DiagramElement;
import io.github.abelgomez.cpntools.Group;

import java.lang.Boolean;
import java.lang.Integer;
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
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getLineColour <em>Line Colour</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#isFillFilled <em>Fill Filled</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getLineThick <em>Line Thick</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getPosx <em>Posx</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getLineType <em>Line Type</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getPosy <em>Posy</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getFillColour <em>Fill Colour</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getFillPattern <em>Fill Pattern</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends MinimalEObjectImpl.Container implements DiagramElement {
	/**
	 * The default value of the '{@link #getLineColour() <em>Line Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColour()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_COLOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineColour() <em>Line Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColour()
	 * @generated
	 * @ordered
	 */
	protected String lineColour = LINE_COLOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #isFillFilled() <em>Fill Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillFilled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_FILLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFillFilled() <em>Fill Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillFilled()
	 * @generated
	 * @ordered
	 */
	protected boolean fillFilled = FILL_FILLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineThick() <em>Line Thick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineThick()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_THICK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineThick() <em>Line Thick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineThick()
	 * @generated
	 * @ordered
	 */
	protected int lineThick = LINE_THICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosx() <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosx()
	 * @generated
	 * @ordered
	 */
	protected static final int POSX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosx() <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosx()
	 * @generated
	 * @ordered
	 */
	protected int posx = POSX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected String lineType = LINE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosy() <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosy()
	 * @generated
	 * @ordered
	 */
	protected static final int POSY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosy() <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosy()
	 * @generated
	 * @ordered
	 */
	protected int posy = POSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillColour() <em>Fill Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColour()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_COLOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillColour() <em>Fill Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColour()
	 * @generated
	 * @ordered
	 */
	protected String fillColour = FILL_COLOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillPattern() <em>Fill Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillPattern() <em>Fill Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillPattern()
	 * @generated
	 * @ordered
	 */
	protected String fillPattern = FILL_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineColour() {
		return lineColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColour(String newLineColour) {
		String oldLineColour = lineColour;
		lineColour = newLineColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__LINE_COLOUR, oldLineColour, lineColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillFilled() {
		return fillFilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillFilled(boolean newFillFilled) {
		boolean oldFillFilled = fillFilled;
		fillFilled = newFillFilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__FILL_FILLED, oldFillFilled, fillFilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineThick() {
		return lineThick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineThick(int newLineThick) {
		int oldLineThick = lineThick;
		lineThick = newLineThick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__LINE_THICK, oldLineThick, lineThick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosx() {
		return posx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosx(int newPosx) {
		int oldPosx = posx;
		posx = newPosx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__POSX, oldPosx, posx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineType() {
		return lineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineType(String newLineType) {
		String oldLineType = lineType;
		lineType = newLineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__LINE_TYPE, oldLineType, lineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosy() {
		return posy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosy(int newPosy) {
		int oldPosy = posy;
		posy = newPosy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__POSY, oldPosy, posy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillColour() {
		return fillColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColour(String newFillColour) {
		String oldFillColour = fillColour;
		fillColour = newFillColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__FILL_COLOUR, oldFillColour, fillColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillPattern() {
		return fillPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillPattern(String newFillPattern) {
		String oldFillPattern = fillPattern;
		fillPattern = newFillPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__FILL_PATTERN, oldFillPattern, fillPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		if (eContainerFeatureID() != CpntoolsPackage.DIAGRAM_ELEMENT__GROUP) return null;
		return (Group)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, CpntoolsPackage.DIAGRAM_ELEMENT__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.DIAGRAM_ELEMENT__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, CpntoolsPackage.GROUP__GROUP_ELMS, Group.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.DIAGRAM_ELEMENT__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.DIAGRAM_ELEMENT__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((Group)otherEnd, msgs);
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
			case CpntoolsPackage.DIAGRAM_ELEMENT__GROUP:
				return basicSetGroup(null, msgs);
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
			case CpntoolsPackage.DIAGRAM_ELEMENT__GROUP:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.GROUP__GROUP_ELMS, Group.class, msgs);
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
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_COLOUR:
				return getLineColour();
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_FILLED:
				return isFillFilled();
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_THICK:
				return getLineThick();
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSX:
				return getPosx();
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_TYPE:
				return getLineType();
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSY:
				return getPosy();
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_COLOUR:
				return getFillColour();
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_PATTERN:
				return getFillPattern();
			case CpntoolsPackage.DIAGRAM_ELEMENT__GROUP:
				return getGroup();
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
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_COLOUR:
				setLineColour((String)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_FILLED:
				setFillFilled((Boolean)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_THICK:
				setLineThick((Integer)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSX:
				setPosx((Integer)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_TYPE:
				setLineType((String)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSY:
				setPosy((Integer)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_COLOUR:
				setFillColour((String)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_PATTERN:
				setFillPattern((String)newValue);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__GROUP:
				setGroup((Group)newValue);
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
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_COLOUR:
				setLineColour(LINE_COLOUR_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_FILLED:
				setFillFilled(FILL_FILLED_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_THICK:
				setLineThick(LINE_THICK_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSX:
				setPosx(POSX_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_TYPE:
				setLineType(LINE_TYPE_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSY:
				setPosy(POSY_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_COLOUR:
				setFillColour(FILL_COLOUR_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_PATTERN:
				setFillPattern(FILL_PATTERN_EDEFAULT);
				return;
			case CpntoolsPackage.DIAGRAM_ELEMENT__GROUP:
				setGroup((Group)null);
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
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_COLOUR:
				return LINE_COLOUR_EDEFAULT == null ? lineColour != null : !LINE_COLOUR_EDEFAULT.equals(lineColour);
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_FILLED:
				return fillFilled != FILL_FILLED_EDEFAULT;
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_THICK:
				return lineThick != LINE_THICK_EDEFAULT;
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSX:
				return posx != POSX_EDEFAULT;
			case CpntoolsPackage.DIAGRAM_ELEMENT__LINE_TYPE:
				return LINE_TYPE_EDEFAULT == null ? lineType != null : !LINE_TYPE_EDEFAULT.equals(lineType);
			case CpntoolsPackage.DIAGRAM_ELEMENT__POSY:
				return posy != POSY_EDEFAULT;
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_COLOUR:
				return FILL_COLOUR_EDEFAULT == null ? fillColour != null : !FILL_COLOUR_EDEFAULT.equals(fillColour);
			case CpntoolsPackage.DIAGRAM_ELEMENT__FILL_PATTERN:
				return FILL_PATTERN_EDEFAULT == null ? fillPattern != null : !FILL_PATTERN_EDEFAULT.equals(fillPattern);
			case CpntoolsPackage.DIAGRAM_ELEMENT__GROUP:
				return getGroup() != null;
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
		result.append(" (lineColour: ");
		result.append(lineColour);
		result.append(", fillFilled: ");
		result.append(fillFilled);
		result.append(", lineThick: ");
		result.append(lineThick);
		result.append(", posx: ");
		result.append(posx);
		result.append(", lineType: ");
		result.append(lineType);
		result.append(", posy: ");
		result.append(posy);
		result.append(", fillColour: ");
		result.append(fillColour);
		result.append(", fillPattern: ");
		result.append(fillPattern);
		result.append(')');
		return result.toString();
	}

} //DiagramElementImpl
