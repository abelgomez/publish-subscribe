/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.ps.PsPackage
 * @generated
 */
public interface PsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsFactory eINSTANCE = io.github.abelgomez.ps.impl.PsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Publish Subscribe Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publish Subscribe Scenario</em>'.
	 * @generated
	 */
	PublishSubscribeScenario createPublishSubscribeScenario();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Update Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Operation</em>'.
	 * @generated
	 */
	UpdateOperation createUpdateOperation();

	/**
	 * Returns a new object of class '<em>Delayed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delayed</em>'.
	 * @generated
	 */
	Delayed createDelayed();

	/**
	 * Returns a new object of class '<em>Assignment Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Execution</em>'.
	 * @generated
	 */
	AssignmentExecution createAssignmentExecution();

	/**
	 * Returns a new object of class '<em>Assignment Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Operation</em>'.
	 * @generated
	 */
	AssignmentOperation createAssignmentOperation();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription</em>'.
	 * @generated
	 */
	Subscription createSubscription();

	/**
	 * Returns a new object of class '<em>Getter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Getter</em>'.
	 * @generated
	 */
	Getter createGetter();

	/**
	 * Returns a new object of class '<em>Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setter</em>'.
	 * @generated
	 */
	Setter createSetter();

	/**
	 * Returns a new object of class '<em>Timed Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Setter</em>'.
	 * @generated
	 */
	TimedSetter createTimedSetter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PsPackage getPsPackage();

} //PsFactory
