/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.AssignmentExecution;
import io.github.abelgomez.ps.AssignmentOperation;
import io.github.abelgomez.ps.PsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.ExecutionSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.impl.AssignmentExecutionImpl#getBase_ExecutionSpecification <em>Base Execution Specification</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.impl.AssignmentExecutionImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentExecutionImpl extends MinimalEObjectImpl.Container implements AssignmentExecution {
	/**
	 * The cached value of the '{@link #getBase_ExecutionSpecification() <em>Base Execution Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ExecutionSpecification()
	 * @generated
	 * @ordered
	 */
	protected ExecutionSpecification base_ExecutionSpecification;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<AssignmentOperation> assignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsPackage.Literals.ASSIGNMENT_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification getBase_ExecutionSpecification() {
		if (base_ExecutionSpecification != null && base_ExecutionSpecification.eIsProxy()) {
			InternalEObject oldBase_ExecutionSpecification = (InternalEObject)base_ExecutionSpecification;
			base_ExecutionSpecification = (ExecutionSpecification)eResolveProxy(oldBase_ExecutionSpecification);
			if (base_ExecutionSpecification != oldBase_ExecutionSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsPackage.ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION, oldBase_ExecutionSpecification, base_ExecutionSpecification));
			}
		}
		return base_ExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecification basicGetBase_ExecutionSpecification() {
		return base_ExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ExecutionSpecification(ExecutionSpecification newBase_ExecutionSpecification) {
		ExecutionSpecification oldBase_ExecutionSpecification = base_ExecutionSpecification;
		base_ExecutionSpecification = newBase_ExecutionSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsPackage.ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION, oldBase_ExecutionSpecification, base_ExecutionSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssignmentOperation> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectContainmentEList<AssignmentOperation>(AssignmentOperation.class, this, PsPackage.ASSIGNMENT_EXECUTION__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsPackage.ASSIGNMENT_EXECUTION__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
			case PsPackage.ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				if (resolve) return getBase_ExecutionSpecification();
				return basicGetBase_ExecutionSpecification();
			case PsPackage.ASSIGNMENT_EXECUTION__ASSIGNMENTS:
				return getAssignments();
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
			case PsPackage.ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				setBase_ExecutionSpecification((ExecutionSpecification)newValue);
				return;
			case PsPackage.ASSIGNMENT_EXECUTION__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends AssignmentOperation>)newValue);
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
			case PsPackage.ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				setBase_ExecutionSpecification((ExecutionSpecification)null);
				return;
			case PsPackage.ASSIGNMENT_EXECUTION__ASSIGNMENTS:
				getAssignments().clear();
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
			case PsPackage.ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION:
				return base_ExecutionSpecification != null;
			case PsPackage.ASSIGNMENT_EXECUTION__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssignmentExecutionImpl
