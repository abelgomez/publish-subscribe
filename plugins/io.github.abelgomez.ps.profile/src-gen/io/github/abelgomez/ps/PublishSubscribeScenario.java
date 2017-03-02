/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publish Subscribe Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.PublishSubscribeScenario#getBase_Interaction <em>Base Interaction</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getPublishSubscribeScenario()
 * @model
 * @generated
 */
public interface PublishSubscribeScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interaction</em>' reference.
	 * @see #setBase_Interaction(Interaction)
	 * @see io.github.abelgomez.ps.PsPackage#getPublishSubscribeScenario_Base_Interaction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interaction getBase_Interaction();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.PublishSubscribeScenario#getBase_Interaction <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interaction</em>' reference.
	 * @see #getBase_Interaction()
	 * @generated
	 */
	void setBase_Interaction(Interaction value);

} // PublishSubscribeScenario
