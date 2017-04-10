/**
 */
package io.github.abelgomez.ps.util;

import io.github.abelgomez.ps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.ps.PsPackage
 * @generated
 */
public class PsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PsSwitch<Adapter> modelSwitch =
		new PsSwitch<Adapter>() {
			@Override
			public Adapter casePublishSubscribeScenario(PublishSubscribeScenario object) {
				return createPublishSubscribeScenarioAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseUpdateOperation(UpdateOperation object) {
				return createUpdateOperationAdapter();
			}
			@Override
			public Adapter caseDelayed(Delayed object) {
				return createDelayedAdapter();
			}
			@Override
			public Adapter caseAssignmentExecution(AssignmentExecution object) {
				return createAssignmentExecutionAdapter();
			}
			@Override
			public Adapter caseAssignmentOperation(AssignmentOperation object) {
				return createAssignmentOperationAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseClientToResourceMessage(ClientToResourceMessage object) {
				return createClientToResourceMessageAdapter();
			}
			@Override
			public Adapter caseSubscription(Subscription object) {
				return createSubscriptionAdapter();
			}
			@Override
			public Adapter caseGetter(Getter object) {
				return createGetterAdapter();
			}
			@Override
			public Adapter caseSetter(Setter object) {
				return createSetterAdapter();
			}
			@Override
			public Adapter caseAbstractSetter(AbstractSetter object) {
				return createAbstractSetterAdapter();
			}
			@Override
			public Adapter caseTimedSetter(TimedSetter object) {
				return createTimedSetterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.PublishSubscribeScenario <em>Publish Subscribe Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.PublishSubscribeScenario
	 * @generated
	 */
	public Adapter createPublishSubscribeScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.UpdateOperation <em>Update Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.UpdateOperation
	 * @generated
	 */
	public Adapter createUpdateOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.Delayed <em>Delayed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.Delayed
	 * @generated
	 */
	public Adapter createDelayedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.AssignmentExecution <em>Assignment Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.AssignmentExecution
	 * @generated
	 */
	public Adapter createAssignmentExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.AssignmentOperation <em>Assignment Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.AssignmentOperation
	 * @generated
	 */
	public Adapter createAssignmentOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.ClientToResourceMessage <em>Client To Resource Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.ClientToResourceMessage
	 * @generated
	 */
	public Adapter createClientToResourceMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.Subscription
	 * @generated
	 */
	public Adapter createSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.Getter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.Getter
	 * @generated
	 */
	public Adapter createGetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.Setter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.Setter
	 * @generated
	 */
	public Adapter createSetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.AbstractSetter <em>Abstract Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.AbstractSetter
	 * @generated
	 */
	public Adapter createAbstractSetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.ps.TimedSetter <em>Timed Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.ps.TimedSetter
	 * @generated
	 */
	public Adapter createTimedSetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PsAdapterFactory
