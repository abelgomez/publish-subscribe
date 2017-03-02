/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsFactoryImpl extends EFactoryImpl implements PsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PsFactory init() {
		try {
			PsFactory thePsFactory = (PsFactory)EPackage.Registry.INSTANCE.getEFactory(PsPackage.eNS_URI);
			if (thePsFactory != null) {
				return thePsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PsPackage.PUBLISH_SUBSCRIBE_SCENARIO: return createPublishSubscribeScenario();
			case PsPackage.SERVICE: return createService();
			case PsPackage.RESOURCE: return createResource();
			case PsPackage.UPDATE_OPERATION: return createUpdateOperation();
			case PsPackage.TIMED_EXECUTION: return createTimedExecution();
			case PsPackage.ASSIGNMENT_EXECUTION: return createAssignmentExecution();
			case PsPackage.ASSIGNMENT_OPERATION: return createAssignmentOperation();
			case PsPackage.CLIENT: return createClient();
			case PsPackage.SUBSCRIPTION: return createSubscription();
			case PsPackage.GETTER: return createGetter();
			case PsPackage.SETTER: return createSetter();
			case PsPackage.TIMED_SETTER: return createTimedSetter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PsPackage.SIGN_KIND:
				return createSignKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PsPackage.SIGN_KIND:
				return convertSignKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishSubscribeScenario createPublishSubscribeScenario() {
		PublishSubscribeScenarioImpl publishSubscribeScenario = new PublishSubscribeScenarioImpl();
		return publishSubscribeScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateOperation createUpdateOperation() {
		UpdateOperationImpl updateOperation = new UpdateOperationImpl();
		return updateOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedExecution createTimedExecution() {
		TimedExecutionImpl timedExecution = new TimedExecutionImpl();
		return timedExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExecution createAssignmentExecution() {
		AssignmentExecutionImpl assignmentExecution = new AssignmentExecutionImpl();
		return assignmentExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOperation createAssignmentOperation() {
		AssignmentOperationImpl assignmentOperation = new AssignmentOperationImpl();
		return assignmentOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Getter createGetter() {
		GetterImpl getter = new GetterImpl();
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setter createSetter() {
		SetterImpl setter = new SetterImpl();
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedSetter createTimedSetter() {
		TimedSetterImpl timedSetter = new TimedSetterImpl();
		return timedSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignKind createSignKindFromString(EDataType eDataType, String initialValue) {
		SignKind result = SignKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsPackage getPsPackage() {
		return (PsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PsPackage getPackage() {
		return PsPackage.eINSTANCE;
	}

} //PsFactoryImpl
