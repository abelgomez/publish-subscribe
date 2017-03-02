/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ExecutionSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.AssignmentExecution#getBase_ExecutionSpecification <em>Base Execution Specification</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.AssignmentExecution#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getAssignmentExecution()
 * @model
 * @generated
 */
public interface AssignmentExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Execution Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Execution Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Execution Specification</em>' reference.
	 * @see #setBase_ExecutionSpecification(ExecutionSpecification)
	 * @see io.github.abelgomez.ps.PsPackage#getAssignmentExecution_Base_ExecutionSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionSpecification getBase_ExecutionSpecification();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.AssignmentExecution#getBase_ExecutionSpecification <em>Base Execution Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Execution Specification</em>' reference.
	 * @see #getBase_ExecutionSpecification()
	 * @generated
	 */
	void setBase_ExecutionSpecification(ExecutionSpecification value);

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.ps.AssignmentOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see io.github.abelgomez.ps.PsPackage#getAssignmentExecution_Assignments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AssignmentOperation> getAssignments();

} // AssignmentExecution
