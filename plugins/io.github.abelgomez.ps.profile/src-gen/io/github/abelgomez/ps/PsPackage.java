/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.ps.PsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PublishSubscribe'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://io.github.abelgomez/ps/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsPackage eINSTANCE = io.github.abelgomez.ps.impl.PsPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.PublishSubscribeScenarioImpl <em>Publish Subscribe Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.PublishSubscribeScenarioImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getPublishSubscribeScenario()
	 * @generated
	 */
	int PUBLISH_SUBSCRIBE_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Base Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION = 0;

	/**
	 * The number of structural features of the '<em>Publish Subscribe Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_SUBSCRIBE_SCENARIO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Publish Subscribe Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_SUBSCRIBE_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.ServiceImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Publishes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PUBLISHES = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.ResourceImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BASE_ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Epr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EPR = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TAG = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TIME = 4;

	/**
	 * The feature id for the '<em><b>Owning Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OWNING_SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.UpdateOperationImpl <em>Update Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.UpdateOperationImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getUpdateOperation()
	 * @generated
	 */
	int UPDATE_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Update Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Update Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.DelayedImpl <em>Delayed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.DelayedImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getDelayed()
	 * @generated
	 */
	int DELAYED = 4;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__DELAY = 0;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED__BASE_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Delayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Delayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.AssignmentExecutionImpl <em>Assignment Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.AssignmentExecutionImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getAssignmentExecution()
	 * @generated
	 */
	int ASSIGNMENT_EXECUTION = 5;

	/**
	 * The feature id for the '<em><b>Base Execution Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXECUTION__ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>Assignment Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXECUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assignment Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.AssignmentOperationImpl <em>Assignment Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.AssignmentOperationImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getAssignmentOperation()
	 * @generated
	 */
	int ASSIGNMENT_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Assignment Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assignment Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.ClientImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 7;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__BASE_LIFELINE = 0;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.ClientToResourceMessageImpl <em>Client To Resource Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.ClientToResourceMessageImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getClientToResourceMessage()
	 * @generated
	 */
	int CLIENT_TO_RESOURCE_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_TO_RESOURCE_MESSAGE__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_TO_RESOURCE_MESSAGE__CLIENT = 2;

	/**
	 * The number of structural features of the '<em>Client To Resource Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Client To Resource Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_TO_RESOURCE_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.SubscriptionImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__BASE_MESSAGE = CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__RESOURCE = CLIENT_TO_RESOURCE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CLIENT = CLIENT_TO_RESOURCE_MESSAGE__CLIENT;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__MIN_VALUE = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__MAX_VALUE = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subscription Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_TIME = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__TRIGGERS = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_OPERATION_COUNT = CLIENT_TO_RESOURCE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.GetterImpl <em>Getter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.GetterImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getGetter()
	 * @generated
	 */
	int GETTER = 10;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER__BASE_MESSAGE = CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER__RESOURCE = CLIENT_TO_RESOURCE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER__CLIENT = CLIENT_TO_RESOURCE_MESSAGE__CLIENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER__VARIABLE = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Getter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_FEATURE_COUNT = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Getter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_OPERATION_COUNT = CLIENT_TO_RESOURCE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.SetterImpl <em>Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.SetterImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getSetter()
	 * @generated
	 */
	int SETTER = 11;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__BASE_MESSAGE = CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__RESOURCE = CLIENT_TO_RESOURCE_MESSAGE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__CLIENT = CLIENT_TO_RESOURCE_MESSAGE__CLIENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__OPERATION = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FEATURE_COUNT = CLIENT_TO_RESOURCE_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_OPERATION_COUNT = CLIENT_TO_RESOURCE_MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.AbstractSetterImpl <em>Abstract Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.AbstractSetterImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getAbstractSetter()
	 * @generated
	 */
	int ABSTRACT_SETTER = 12;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTER__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Abstract Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.impl.TimedSetterImpl <em>Timed Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.impl.TimedSetterImpl
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getTimedSetter()
	 * @generated
	 */
	int TIMED_SETTER = 13;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SETTER__OPERATION = ABSTRACT_SETTER__OPERATION;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SETTER__BASE_MESSAGE = ABSTRACT_SETTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SETTER__TIME = ABSTRACT_SETTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SETTER__RESOURCE = ABSTRACT_SETTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SETTER__SERVICE = ABSTRACT_SETTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Timed Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SETTER_FEATURE_COUNT = ABSTRACT_SETTER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Timed Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_SETTER_OPERATION_COUNT = ABSTRACT_SETTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.ps.SignKind <em>Sign Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.ps.SignKind
	 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getSignKind()
	 * @generated
	 */
	int SIGN_KIND = 14;


	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.PublishSubscribeScenario <em>Publish Subscribe Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publish Subscribe Scenario</em>'.
	 * @see io.github.abelgomez.ps.PublishSubscribeScenario
	 * @generated
	 */
	EClass getPublishSubscribeScenario();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.PublishSubscribeScenario#getBase_Interaction <em>Base Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interaction</em>'.
	 * @see io.github.abelgomez.ps.PublishSubscribeScenario#getBase_Interaction()
	 * @see #getPublishSubscribeScenario()
	 * @generated
	 */
	EReference getPublishSubscribeScenario_Base_Interaction();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see io.github.abelgomez.ps.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.Service#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see io.github.abelgomez.ps.Service#getBase_Node()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Base_Node();

	/**
	 * Returns the meta object for the reference list '{@link io.github.abelgomez.ps.Service#getPublishes <em>Publishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publishes</em>'.
	 * @see io.github.abelgomez.ps.Service#getPublishes()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Publishes();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see io.github.abelgomez.ps.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.Resource#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see io.github.abelgomez.ps.Resource#getBase_Artifact()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Base_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Resource#getEpr <em>Epr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epr</em>'.
	 * @see io.github.abelgomez.ps.Resource#getEpr()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Epr();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Resource#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see io.github.abelgomez.ps.Resource#getTag()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Tag();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Resource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see io.github.abelgomez.ps.Resource#getValue()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Value();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Resource#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see io.github.abelgomez.ps.Resource#getTime()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Time();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.Resource#getOwningService <em>Owning Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Service</em>'.
	 * @see io.github.abelgomez.ps.Resource#getOwningService()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_OwningService();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.UpdateOperation <em>Update Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Operation</em>'.
	 * @see io.github.abelgomez.ps.UpdateOperation
	 * @generated
	 */
	EClass getUpdateOperation();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.UpdateOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see io.github.abelgomez.ps.UpdateOperation#getOperator()
	 * @see #getUpdateOperation()
	 * @generated
	 */
	EAttribute getUpdateOperation_Operator();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.UpdateOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see io.github.abelgomez.ps.UpdateOperation#getValue()
	 * @see #getUpdateOperation()
	 * @generated
	 */
	EAttribute getUpdateOperation_Value();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.Delayed <em>Delayed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayed</em>'.
	 * @see io.github.abelgomez.ps.Delayed
	 * @generated
	 */
	EClass getDelayed();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Delayed#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see io.github.abelgomez.ps.Delayed#getDelay()
	 * @see #getDelayed()
	 * @generated
	 */
	EAttribute getDelayed_Delay();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.Delayed#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see io.github.abelgomez.ps.Delayed#getBase_Message()
	 * @see #getDelayed()
	 * @generated
	 */
	EReference getDelayed_Base_Message();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.AssignmentExecution <em>Assignment Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Execution</em>'.
	 * @see io.github.abelgomez.ps.AssignmentExecution
	 * @generated
	 */
	EClass getAssignmentExecution();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.AssignmentExecution#getBase_ExecutionSpecification <em>Base Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Execution Specification</em>'.
	 * @see io.github.abelgomez.ps.AssignmentExecution#getBase_ExecutionSpecification()
	 * @see #getAssignmentExecution()
	 * @generated
	 */
	EReference getAssignmentExecution_Base_ExecutionSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.ps.AssignmentExecution#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see io.github.abelgomez.ps.AssignmentExecution#getAssignments()
	 * @see #getAssignmentExecution()
	 * @generated
	 */
	EReference getAssignmentExecution_Assignments();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.AssignmentOperation <em>Assignment Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Operation</em>'.
	 * @see io.github.abelgomez.ps.AssignmentOperation
	 * @generated
	 */
	EClass getAssignmentOperation();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.AssignmentOperation#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see io.github.abelgomez.ps.AssignmentOperation#getProperty()
	 * @see #getAssignmentOperation()
	 * @generated
	 */
	EAttribute getAssignmentOperation_Property();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.AssignmentOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see io.github.abelgomez.ps.AssignmentOperation#getValue()
	 * @see #getAssignmentOperation()
	 * @generated
	 */
	EAttribute getAssignmentOperation_Value();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see io.github.abelgomez.ps.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.Client#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see io.github.abelgomez.ps.Client#getBase_Lifeline()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Base_Lifeline();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.ClientToResourceMessage <em>Client To Resource Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client To Resource Message</em>'.
	 * @see io.github.abelgomez.ps.ClientToResourceMessage
	 * @generated
	 */
	EClass getClientToResourceMessage();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.ClientToResourceMessage#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see io.github.abelgomez.ps.ClientToResourceMessage#getBase_Message()
	 * @see #getClientToResourceMessage()
	 * @generated
	 */
	EReference getClientToResourceMessage_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.ClientToResourceMessage#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see io.github.abelgomez.ps.ClientToResourceMessage#getResource()
	 * @see #getClientToResourceMessage()
	 * @generated
	 */
	EReference getClientToResourceMessage_Resource();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.ClientToResourceMessage#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see io.github.abelgomez.ps.ClientToResourceMessage#getClient()
	 * @see #getClientToResourceMessage()
	 * @generated
	 */
	EReference getClientToResourceMessage_Client();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see io.github.abelgomez.ps.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Subscription#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see io.github.abelgomez.ps.Subscription#getMinValue()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Subscription#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see io.github.abelgomez.ps.Subscription#getMaxValue()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Subscription#getSubscriptionTime <em>Subscription Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Time</em>'.
	 * @see io.github.abelgomez.ps.Subscription#getSubscriptionTime()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_SubscriptionTime();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.Subscription#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers</em>'.
	 * @see io.github.abelgomez.ps.Subscription#getTriggers()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_Triggers();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.Getter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Getter</em>'.
	 * @see io.github.abelgomez.ps.Getter
	 * @generated
	 */
	EClass getGetter();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.Getter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see io.github.abelgomez.ps.Getter#getVariable()
	 * @see #getGetter()
	 * @generated
	 */
	EAttribute getGetter_Variable();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.Setter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter</em>'.
	 * @see io.github.abelgomez.ps.Setter
	 * @generated
	 */
	EClass getSetter();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.AbstractSetter <em>Abstract Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Setter</em>'.
	 * @see io.github.abelgomez.ps.AbstractSetter
	 * @generated
	 */
	EClass getAbstractSetter();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.ps.AbstractSetter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see io.github.abelgomez.ps.AbstractSetter#getOperation()
	 * @see #getAbstractSetter()
	 * @generated
	 */
	EReference getAbstractSetter_Operation();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.ps.TimedSetter <em>Timed Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Setter</em>'.
	 * @see io.github.abelgomez.ps.TimedSetter
	 * @generated
	 */
	EClass getTimedSetter();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.TimedSetter#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see io.github.abelgomez.ps.TimedSetter#getBase_Message()
	 * @see #getTimedSetter()
	 * @generated
	 */
	EReference getTimedSetter_Base_Message();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.ps.TimedSetter#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see io.github.abelgomez.ps.TimedSetter#getTime()
	 * @see #getTimedSetter()
	 * @generated
	 */
	EAttribute getTimedSetter_Time();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.TimedSetter#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see io.github.abelgomez.ps.TimedSetter#getResource()
	 * @see #getTimedSetter()
	 * @generated
	 */
	EReference getTimedSetter_Resource();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.ps.TimedSetter#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see io.github.abelgomez.ps.TimedSetter#getService()
	 * @see #getTimedSetter()
	 * @generated
	 */
	EReference getTimedSetter_Service();

	/**
	 * Returns the meta object for enum '{@link io.github.abelgomez.ps.SignKind <em>Sign Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sign Kind</em>'.
	 * @see io.github.abelgomez.ps.SignKind
	 * @generated
	 */
	EEnum getSignKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PsFactory getPsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.PublishSubscribeScenarioImpl <em>Publish Subscribe Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.PublishSubscribeScenarioImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getPublishSubscribeScenario()
		 * @generated
		 */
		EClass PUBLISH_SUBSCRIBE_SCENARIO = eINSTANCE.getPublishSubscribeScenario();

		/**
		 * The meta object literal for the '<em><b>Base Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISH_SUBSCRIBE_SCENARIO__BASE_INTERACTION = eINSTANCE.getPublishSubscribeScenario_Base_Interaction();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.ServiceImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASE_NODE = eINSTANCE.getService_Base_Node();

		/**
		 * The meta object literal for the '<em><b>Publishes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PUBLISHES = eINSTANCE.getService_Publishes();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.ResourceImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__BASE_ARTIFACT = eINSTANCE.getResource_Base_Artifact();

		/**
		 * The meta object literal for the '<em><b>Epr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__EPR = eINSTANCE.getResource_Epr();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TAG = eINSTANCE.getResource_Tag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__VALUE = eINSTANCE.getResource_Value();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TIME = eINSTANCE.getResource_Time();

		/**
		 * The meta object literal for the '<em><b>Owning Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OWNING_SERVICE = eINSTANCE.getResource_OwningService();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.UpdateOperationImpl <em>Update Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.UpdateOperationImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getUpdateOperation()
		 * @generated
		 */
		EClass UPDATE_OPERATION = eINSTANCE.getUpdateOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_OPERATION__OPERATOR = eINSTANCE.getUpdateOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_OPERATION__VALUE = eINSTANCE.getUpdateOperation_Value();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.DelayedImpl <em>Delayed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.DelayedImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getDelayed()
		 * @generated
		 */
		EClass DELAYED = eINSTANCE.getDelayed();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAYED__DELAY = eINSTANCE.getDelayed_Delay();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAYED__BASE_MESSAGE = eINSTANCE.getDelayed_Base_Message();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.AssignmentExecutionImpl <em>Assignment Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.AssignmentExecutionImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getAssignmentExecution()
		 * @generated
		 */
		EClass ASSIGNMENT_EXECUTION = eINSTANCE.getAssignmentExecution();

		/**
		 * The meta object literal for the '<em><b>Base Execution Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXECUTION__BASE_EXECUTION_SPECIFICATION = eINSTANCE.getAssignmentExecution_Base_ExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXECUTION__ASSIGNMENTS = eINSTANCE.getAssignmentExecution_Assignments();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.AssignmentOperationImpl <em>Assignment Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.AssignmentOperationImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getAssignmentOperation()
		 * @generated
		 */
		EClass ASSIGNMENT_OPERATION = eINSTANCE.getAssignmentOperation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_OPERATION__PROPERTY = eINSTANCE.getAssignmentOperation_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_OPERATION__VALUE = eINSTANCE.getAssignmentOperation_Value();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.ClientImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__BASE_LIFELINE = eINSTANCE.getClient_Base_Lifeline();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.ClientToResourceMessageImpl <em>Client To Resource Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.ClientToResourceMessageImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getClientToResourceMessage()
		 * @generated
		 */
		EClass CLIENT_TO_RESOURCE_MESSAGE = eINSTANCE.getClientToResourceMessage();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_TO_RESOURCE_MESSAGE__BASE_MESSAGE = eINSTANCE.getClientToResourceMessage_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_TO_RESOURCE_MESSAGE__RESOURCE = eINSTANCE.getClientToResourceMessage_Resource();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_TO_RESOURCE_MESSAGE__CLIENT = eINSTANCE.getClientToResourceMessage_Client();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.SubscriptionImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__MIN_VALUE = eINSTANCE.getSubscription_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__MAX_VALUE = eINSTANCE.getSubscription_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Subscription Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__SUBSCRIPTION_TIME = eINSTANCE.getSubscription_SubscriptionTime();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__TRIGGERS = eINSTANCE.getSubscription_Triggers();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.GetterImpl <em>Getter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.GetterImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getGetter()
		 * @generated
		 */
		EClass GETTER = eINSTANCE.getGetter();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GETTER__VARIABLE = eINSTANCE.getGetter_Variable();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.SetterImpl <em>Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.SetterImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getSetter()
		 * @generated
		 */
		EClass SETTER = eINSTANCE.getSetter();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.AbstractSetterImpl <em>Abstract Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.AbstractSetterImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getAbstractSetter()
		 * @generated
		 */
		EClass ABSTRACT_SETTER = eINSTANCE.getAbstractSetter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SETTER__OPERATION = eINSTANCE.getAbstractSetter_Operation();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.impl.TimedSetterImpl <em>Timed Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.impl.TimedSetterImpl
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getTimedSetter()
		 * @generated
		 */
		EClass TIMED_SETTER = eINSTANCE.getTimedSetter();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SETTER__BASE_MESSAGE = eINSTANCE.getTimedSetter_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_SETTER__TIME = eINSTANCE.getTimedSetter_Time();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SETTER__RESOURCE = eINSTANCE.getTimedSetter_Resource();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_SETTER__SERVICE = eINSTANCE.getTimedSetter_Service();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.ps.SignKind <em>Sign Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.ps.SignKind
		 * @see io.github.abelgomez.ps.impl.PsPackageImpl#getSignKind()
		 * @generated
		 */
		EEnum SIGN_KIND = eINSTANCE.getSignKind();

	}

} //PsPackage
