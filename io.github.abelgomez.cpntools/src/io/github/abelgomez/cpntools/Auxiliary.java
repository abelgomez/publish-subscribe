/**
 */
package io.github.abelgomez.cpntools;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Auxiliary#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getAuxiliary()
 * @model abstract="true"
 * @generated
 */
public interface Auxiliary extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Page#getAuxiliarys <em>Auxiliarys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' container reference.
	 * @see #setPage(Page)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getAuxiliary_Page()
	 * @see io.github.abelgomez.cpntools.Page#getAuxiliarys
	 * @model opposite="auxiliarys" required="true" transient="false"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Auxiliary#getPage <em>Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' container reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // Auxiliary
