/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Trans#getHeight <em>Height</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Trans#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Trans#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Trans#getCond <em>Cond</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Trans#getPage <em>Page</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Trans#getText <em>Text</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Trans#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans()
 * @model
 * @generated
 */
public interface Trans extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans_Height()
	 * @model ordered="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Trans#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans_Width()
	 * @model ordered="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Trans#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit</em>' attribute.
	 * @see #setExplicit(boolean)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans_Explicit()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isExplicit();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Trans#isExplicit <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit</em>' attribute.
	 * @see #isExplicit()
	 * @generated
	 */
	void setExplicit(boolean value);

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Cond)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans_Cond()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Cond getCond();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Trans#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Cond value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Page#getTranss <em>Transs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' container reference.
	 * @see #setPage(Page)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans_Page()
	 * @see io.github.abelgomez.cpntools.Page#getTranss
	 * @model opposite="transs" required="true" transient="false"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Trans#getPage <em>Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' container reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Trans#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Arc}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Arc#getTrans <em>Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getTrans_Arcs()
	 * @see io.github.abelgomez.cpntools.Arc#getTrans
	 * @model opposite="trans"
	 * @generated
	 */
	EList<Arc> getArcs();

} // Trans
