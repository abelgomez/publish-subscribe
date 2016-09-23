/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getHeight <em>Height</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getType <em>Type</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getInitmark <em>Initmark</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getPort <em>Port</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getFusion <em>Fusion</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getPage <em>Page</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getText <em>Text</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Place#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends DiagramElement {
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Height()
	 * @model ordered="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getHeight <em>Height</em>}' attribute.
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Width()
	 * @model ordered="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ColorSet)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ColorSet getType();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ColorSet value);

	/**
	 * Returns the value of the '<em><b>Initmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initmark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initmark</em>' containment reference.
	 * @see #setInitmark(Initmark)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Initmark()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Initmark getInitmark();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getInitmark <em>Initmark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initmark</em>' containment reference.
	 * @see #getInitmark()
	 * @generated
	 */
	void setInitmark(Initmark value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(Port)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Port()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Fusion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Fusion#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fusion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fusion</em>' reference.
	 * @see #setFusion(Fusion)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Fusion()
	 * @see io.github.abelgomez.cpntools.Fusion#getPlaces
	 * @model opposite="places" ordered="false"
	 * @generated
	 */
	Fusion getFusion();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getFusion <em>Fusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fusion</em>' reference.
	 * @see #getFusion()
	 * @generated
	 */
	void setFusion(Fusion value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Page#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' container reference.
	 * @see #setPage(Page)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Page()
	 * @see io.github.abelgomez.cpntools.Page#getPlaces
	 * @model opposite="places" required="true" transient="false"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getPage <em>Page</em>}' container reference.
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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Place#getText <em>Text</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Arc#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPlace_Arcs()
	 * @see io.github.abelgomez.cpntools.Arc#getPlace
	 * @model opposite="place"
	 * @generated
	 */
	EList<Arc> getArcs();

} // Place
