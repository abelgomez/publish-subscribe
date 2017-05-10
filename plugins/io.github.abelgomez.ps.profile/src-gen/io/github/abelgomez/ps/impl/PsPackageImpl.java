/**
 */
package io.github.abelgomez.ps.impl;

import io.github.abelgomez.ps.AbstractSetter;
import io.github.abelgomez.ps.AssignmentExecution;
import io.github.abelgomez.ps.AssignmentOperation;
import io.github.abelgomez.ps.Client;
import io.github.abelgomez.ps.ClientToResourceMessage;
import io.github.abelgomez.ps.Delayed;
import io.github.abelgomez.ps.Getter;
import io.github.abelgomez.ps.PsFactory;
import io.github.abelgomez.ps.PsPackage;
import io.github.abelgomez.ps.PublishSubscribeScenario;
import io.github.abelgomez.ps.Resource;
import io.github.abelgomez.ps.Service;
import io.github.abelgomez.ps.Setter;
import io.github.abelgomez.ps.SignKind;
import io.github.abelgomez.ps.Subscription;
import io.github.abelgomez.ps.TimedSetter;
import io.github.abelgomez.ps.UpdateOperation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsPackageImpl extends EPackageImpl implements PsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishSubscribeScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientToResourceMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedSetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see io.github.abelgomez.ps.PsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PsPackageImpl() {
		super(eNS_URI, PsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PsPackage init() {
		if (isInited) return (PsPackage)EPackage.Registry.INSTANCE.getEPackage(PsPackage.eNS_URI);

		// Obtain or create and register package
		PsPackageImpl thePsPackage = (PsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePsPackage.createPackageContents();

		// Initialize created meta-data
		thePsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PsPackage.eNS_URI, thePsPackage);
		return thePsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishSubscribeScenario() {
		return publishSubscribeScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishSubscribeScenario_Base_Interaction() {
		return (EReference)publishSubscribeScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Base_Node() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Publishes() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Base_Artifact() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Epr() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Tag() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Value() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Time() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_OwningService() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateOperation() {
		return updateOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateOperation_Operator() {
		return (EAttribute)updateOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateOperation_Value() {
		return (EAttribute)updateOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayed() {
		return delayedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayed_Delay() {
		return (EAttribute)delayedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayed_Base_Message() {
		return (EReference)delayedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentExecution() {
		return assignmentExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentExecution_Base_ExecutionSpecification() {
		return (EReference)assignmentExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentExecution_Assignments() {
		return (EReference)assignmentExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentOperation() {
		return assignmentOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentOperation_Property() {
		return (EAttribute)assignmentOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentOperation_Value() {
		return (EAttribute)assignmentOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Base_Lifeline() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientToResourceMessage() {
		return clientToResourceMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientToResourceMessage_Base_Message() {
		return (EReference)clientToResourceMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientToResourceMessage_Resource() {
		return (EReference)clientToResourceMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientToResourceMessage_Client() {
		return (EReference)clientToResourceMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscription() {
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscription_MinValue() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscription_MaxValue() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscription_SubscriptionTime() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Triggers() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetter() {
		return getterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetter_Variable() {
		return (EAttribute)getterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetter() {
		return setterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSetter() {
		return abstractSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSetter_Operation() {
		return (EReference)abstractSetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedSetter() {
		return timedSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedSetter_Base_Message() {
		return (EReference)timedSetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedSetter_Time() {
		return (EAttribute)timedSetterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedSetter_Resource() {
		return (EReference)timedSetterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedSetter_Service() {
		return (EReference)timedSetterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignKind() {
		return signKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsFactory getPsFactory() {
		return (PsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		publishSubscribeScenarioEClass = createEClass(PUBLISH_SUBSCRIBE_SCENARIO);
		createEReference(publishSubscribeScenarioEClass, PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__BASE_NODE);
		createEReference(serviceEClass, SERVICE__PUBLISHES);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__BASE_ARTIFACT);
		createEAttribute(resourceEClass, RESOURCE__EPR);
		createEAttribute(resourceEClass, RESOURCE__TAG);
		createEAttribute(resourceEClass, RESOURCE__VALUE);
		createEAttribute(resourceEClass, RESOURCE__TIME);
		createEReference(resourceEClass, RESOURCE__OWNING_SERVICE);

		updateOperationEClass = createEClass(UPDATE_OPERATION);
		createEAttribute(updateOperationEClass, UPDATE_OPERATION__OPERATOR);
		createEAttribute(updateOperationEClass, UPDATE_OPERATION__VALUE);

		delayedEClass = createEClass(DELAYED);
		createEAttribute(delayedEClass, DELAYED__DELAY);
		createEReference(delayedEClass, DELAYED__BASE_MESSAGE);

		assignmentExecutionEClass = createEClass(ASSIGNMENT_EXECUTION);
		createEReference(assignmentExecutionEClass, ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION);
		createEReference(assignmentExecutionEClass, ASSIGNMENT_EXECUTION__ASSIGNMENTS);

		assignmentOperationEClass = createEClass(ASSIGNMENT_OPERATION);
		createEAttribute(assignmentOperationEClass, ASSIGNMENT_OPERATION__PROPERTY);
		createEAttribute(assignmentOperationEClass, ASSIGNMENT_OPERATION__VALUE);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__BASE_LIFELINE);

		clientToResourceMessageEClass = createEClass(CLIENT_TO_RESOURCE_MESSAGE);
		createEReference(clientToResourceMessageEClass, CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE);
		createEReference(clientToResourceMessageEClass, CLIENT_TO_RESOURCE_MESSAGE__RESOURCE);
		createEReference(clientToResourceMessageEClass, CLIENT_TO_RESOURCE_MESSAGE__CLIENT);

		subscriptionEClass = createEClass(SUBSCRIPTION);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__MIN_VALUE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__MAX_VALUE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__SUBSCRIPTION_TIME);
		createEReference(subscriptionEClass, SUBSCRIPTION__TRIGGERS);

		getterEClass = createEClass(GETTER);
		createEAttribute(getterEClass, GETTER__VARIABLE);

		setterEClass = createEClass(SETTER);

		abstractSetterEClass = createEClass(ABSTRACT_SETTER);
		createEReference(abstractSetterEClass, ABSTRACT_SETTER__OPERATION);

		timedSetterEClass = createEClass(TIMED_SETTER);
		createEReference(timedSetterEClass, TIMED_SETTER__BASE_MESSAGE);
		createEAttribute(timedSetterEClass, TIMED_SETTER__TIME);
		createEReference(timedSetterEClass, TIMED_SETTER__RESOURCE);
		createEReference(timedSetterEClass, TIMED_SETTER__SERVICE);

		// Create enums
		signKindEEnum = createEEnum(SIGN_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		subscriptionEClass.getESuperTypes().add(this.getClientToResourceMessage());
		getterEClass.getESuperTypes().add(this.getClientToResourceMessage());
		setterEClass.getESuperTypes().add(this.getClientToResourceMessage());
		setterEClass.getESuperTypes().add(this.getAbstractSetter());
		timedSetterEClass.getESuperTypes().add(this.getAbstractSetter());

		// Initialize classes, features, and operations; add parameters
		initEClass(publishSubscribeScenarioEClass, PublishSubscribeScenario.class, "PublishSubscribeScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublishSubscribeScenario_Base_Interaction(), theUMLPackage.getInteraction(), null, "base_Interaction", null, 1, 1, PublishSubscribeScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Base_Node(), theUMLPackage.getNode(), null, "base_Node", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getService_Publishes(), this.getResource(), this.getResource_OwningService(), "publishes", null, 1, -1, Service.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Epr(), theTypesPackage.getString(), "epr", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Tag(), theTypesPackage.getString(), "tag", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Value(), theTypesPackage.getReal(), "value", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResource_Time(), theTypesPackage.getInteger(), "time", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResource_OwningService(), this.getService(), this.getService_Publishes(), "owningService", null, 1, 1, Resource.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(updateOperationEClass, UpdateOperation.class, "UpdateOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateOperation_Operator(), this.getSignKind(), "operator", null, 1, 1, UpdateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUpdateOperation_Value(), theTypesPackage.getString(), "value", null, 1, 1, UpdateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(delayedEClass, Delayed.class, "Delayed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayed_Delay(), theTypesPackage.getInteger(), "delay", "0", 1, 1, Delayed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDelayed_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Delayed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assignmentExecutionEClass, AssignmentExecution.class, "AssignmentExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentExecution_Base_ExecutionSpecification(), theUMLPackage.getExecutionSpecification(), null, "base_ExecutionSpecification", null, 1, 1, AssignmentExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignmentExecution_Assignments(), this.getAssignmentOperation(), null, "assignments", null, 0, -1, AssignmentExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assignmentOperationEClass, AssignmentOperation.class, "AssignmentOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignmentOperation_Property(), theTypesPackage.getString(), "property", null, 1, 1, AssignmentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAssignmentOperation_Value(), theTypesPackage.getString(), "value", null, 1, 1, AssignmentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clientToResourceMessageEClass, ClientToResourceMessage.class, "ClientToResourceMessage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientToResourceMessage_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, ClientToResourceMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClientToResourceMessage_Resource(), this.getResource(), null, "resource", null, 1, 1, ClientToResourceMessage.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClientToResourceMessage_Client(), this.getClient(), null, "client", null, 1, 1, ClientToResourceMessage.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscription_MinValue(), theTypesPackage.getReal(), "minValue", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscription_MaxValue(), theTypesPackage.getReal(), "maxValue", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscription_SubscriptionTime(), theTypesPackage.getInteger(), "subscriptionTime", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscription_Triggers(), theUMLPackage.getInteraction(), null, "triggers", null, 1, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(getterEClass, Getter.class, "Getter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetter_Variable(), theTypesPackage.getString(), "variable", null, 1, 1, Getter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setterEClass, Setter.class, "Setter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSetterEClass, AbstractSetter.class, "AbstractSetter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSetter_Operation(), this.getUpdateOperation(), null, "operation", null, 1, 1, AbstractSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timedSetterEClass, TimedSetter.class, "TimedSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedSetter_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, TimedSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTimedSetter_Time(), theTypesPackage.getInteger(), "time", "0", 1, 1, TimedSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimedSetter_Resource(), this.getResource(), null, "resource", null, 1, 1, TimedSetter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTimedSetter_Service(), this.getService(), null, "service", null, 1, 1, TimedSetter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signKindEEnum, SignKind.class, "SignKind");
		addEEnumLiteral(signKindEEnum, SignKind.PLUS);
		addEEnumLiteral(signKindEEnum, SignKind.MINUS);
		addEEnumLiteral(signKindEEnum, SignKind.MULT);
		addEEnumLiteral(signKindEEnum, SignKind.DIV);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "PublishSubscribe"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (getService_Publishes(), 
		   source, 
		   new String[] {
			 "derivation", "self.base_Node.nestedClassifier->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Resource\')))->reject(oclIsUndefined()).oclAsType(Resource)->asSet()"
		   });	
		addAnnotation
		  (getResource_OwningService(), 
		   source, 
		   new String[] {
			 "initial", "self.base_Artifact.owner.getStereotypeApplication(base_Artifact.owner.getApplicableStereotype(\'Publish-Subscribe::Service\')).oclAsType(Service)"
		   });	
		addAnnotation
		  (getClientToResourceMessage_Resource(), 
		   source, 
		   new String[] {
			 "derivation", "let r : Resource = self.base_Message.receiveEvent.oclAsType(uml::MessageOccurrenceSpecification).covered.represents.type->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Resource\')))->asSequence()->first().oclAsType(Resource) in\r\nif r.oclIsInvalid() \r\n\tthen null \r\n\telse r \r\nendif"
		   });	
		addAnnotation
		  (getClientToResourceMessage_Client(), 
		   source, 
		   new String[] {
			 "derivation", "let c : Client = self.base_Message.sendEvent.oclAsType(uml::MessageOccurrenceSpecification).covered->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Client\')))->asSequence()->first().oclAsType(Client) in\r\nif c.oclIsInvalid() \r\n\tthen null \r\n\telse c\r\nendif\r\n"
		   });	
		addAnnotation
		  (getTimedSetter_Resource(), 
		   source, 
		   new String[] {
			 "derivation", "let r : Resource = self.base_Message.receiveEvent.oclAsType(uml::MessageOccurrenceSpecification).covered.represents.type->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Resource\')))->asSequence()->first().oclAsType(Resource) in\r\nif r.oclIsInvalid() \r\n\tthen null \r\n\telse r \r\nendif"
		   });	
		addAnnotation
		  (getTimedSetter_Service(), 
		   source, 
		   new String[] {
			 "derivation", "let s : Service = self.base_Message.sendEvent.oclAsType(uml::MessageOccurrenceSpecification).covered.represents.type->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Service\')))->asSequence()->first().oclAsType(Service) in\r\nif s.oclIsInvalid() \r\n\tthen null \r\n\telse s\r\nendif"
		   });
	}

} //PsPackageImpl
