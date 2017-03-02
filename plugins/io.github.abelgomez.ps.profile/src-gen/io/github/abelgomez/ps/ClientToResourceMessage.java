/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client To Resource Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.ClientToResourceMessage#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.ClientToResourceMessage#getResource <em>Resource</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.ClientToResourceMessage#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getClientToResourceMessage()
 * @model abstract="true"
 * @generated
 */
public interface ClientToResourceMessage extends EObject {
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
	 * @see io.github.abelgomez.ps.PsPackage#getClientToResourceMessage_Base_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.ClientToResourceMessage#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see io.github.abelgomez.ps.PsPackage#getClientToResourceMessage_Resource()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let r : Resource = self.base_Message.receiveEvent.oclAsType(uml::MessageOccurrenceSpecification).covered.represents.type->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Resource\')))->asSequence()->first().oclAsType(Resource) in\r\nif r.oclIsInvalid() \r\n\tthen null \r\n\telse r \r\nendif'"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see io.github.abelgomez.ps.PsPackage#getClientToResourceMessage_Client()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let c : Client = self.base_Message.sendEvent.oclAsType(uml::MessageOccurrenceSpecification).covered->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Client\')))->asSequence()->first().oclAsType(Client) in\r\nif c.oclIsInvalid() \r\n\tthen null \r\n\telse c\r\nendif\r\n'"
	 * @generated
	 */
	Client getClient();

} // ClientToResourceMessage
