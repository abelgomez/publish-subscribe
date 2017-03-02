/**
 */
package io.github.abelgomez.ps;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Getter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.Getter#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getGetter()
 * @model
 * @generated
 */
public interface Getter extends ClientToResourceMessage {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see io.github.abelgomez.ps.PsPackage#getGetter_Variable()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Getter#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // Getter
