/**
 */
package io.github.abelgomez.cpntools;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initmark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Initmark#getMarks <em>Marks</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getInitmark()
 * @model
 * @generated
 */
public interface Initmark extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Marks</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Mark}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Mark#getInitmark <em>Initmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marks</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getInitmark_Marks()
	 * @see io.github.abelgomez.cpntools.Mark#getInitmark
	 * @model opposite="initmark" containment="true" ordered="false"
	 * @generated
	 */
	EList<Mark> getMarks();

} // Initmark
