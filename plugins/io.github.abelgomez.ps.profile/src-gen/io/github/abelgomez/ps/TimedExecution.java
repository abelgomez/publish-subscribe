/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ExecutionSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.TimedExecution#getBase_ExecutionSpecification <em>Base Execution Specification</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.TimedExecution#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getTimedExecution()
 * @model
 * @generated
 */
public interface TimedExecution extends EObject {
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
	 * @see io.github.abelgomez.ps.PsPackage#getTimedExecution_Base_ExecutionSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionSpecification getBase_ExecutionSpecification();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.TimedExecution#getBase_ExecutionSpecification <em>Base Execution Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Execution Specification</em>' reference.
	 * @see #getBase_ExecutionSpecification()
	 * @generated
	 */
	void setBase_ExecutionSpecification(ExecutionSpecification value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see io.github.abelgomez.ps.PsPackage#getTimedExecution_Time()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.TimedExecution#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // TimedExecution
