/**
 */
package io.github.abelgomez.ps;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.TimedSetter#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.TimedSetter#getTime <em>Time</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.TimedSetter#getResource <em>Resource</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.TimedSetter#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getTimedSetter()
 * @model
 * @generated
 */
public interface TimedSetter extends AbstractSetter {
	/**
	 * Returns the value of the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Message</em>' reference.
	 * @see #setBase_Message(Message)
	 * @see io.github.abelgomez.ps.PsPackage#getTimedSetter_Base_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.TimedSetter#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

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
	 * @see io.github.abelgomez.ps.PsPackage#getTimedSetter_Time()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.TimedSetter#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see io.github.abelgomez.ps.PsPackage#getTimedSetter_Resource()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let r : Resource = self.base_Message.receiveEvent.oclAsType(uml::MessageOccurrenceSpecification).covered.represents.type->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Resource\')))->asSequence()->first().oclAsType(Resource) in\r\nif r.oclIsInvalid() \r\n\tthen null \r\n\telse r \r\nendif'"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see io.github.abelgomez.ps.PsPackage#getTimedSetter_Service()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let s : Service = self.base_Message.sendEvent.oclAsType(uml::MessageOccurrenceSpecification).covered.represents.type->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Service\')))->asSequence()->first().oclAsType(Service) in\r\nif s.oclIsInvalid() \r\n\tthen null \r\n\telse s\r\nendif'"
	 * @generated
	 */
	Service getService();

} // TimedSetter
