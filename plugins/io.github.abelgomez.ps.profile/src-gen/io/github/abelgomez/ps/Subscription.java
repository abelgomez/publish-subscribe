/**
 */
package io.github.abelgomez.ps;

import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.Subscription#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Subscription#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Subscription#getSubscriptionTime <em>Subscription Time</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Subscription#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getSubscription()
 * @model
 * @generated
 */
public interface Subscription extends ClientToResourceMessage {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see io.github.abelgomez.ps.PsPackage#getSubscription_MinValue()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Subscription#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see io.github.abelgomez.ps.PsPackage#getSubscription_MaxValue()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Subscription#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Returns the value of the '<em><b>Subscription Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Time</em>' attribute.
	 * @see #setSubscriptionTime(int)
	 * @see io.github.abelgomez.ps.PsPackage#getSubscription_SubscriptionTime()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSubscriptionTime();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Subscription#getSubscriptionTime <em>Subscription Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Time</em>' attribute.
	 * @see #getSubscriptionTime()
	 * @generated
	 */
	void setSubscriptionTime(int value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference.
	 * @see #setTriggers(Interaction)
	 * @see io.github.abelgomez.ps.PsPackage#getSubscription_Triggers()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interaction getTriggers();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Subscription#getTriggers <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Interaction value);

} // Subscription
