/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.Service#getBase_Node <em>Base Node</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Service#getPublishes <em>Publishes</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Node</em>' reference.
	 * @see #setBase_Node(Node)
	 * @see io.github.abelgomez.ps.PsPackage#getService_Base_Node()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getBase_Node();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Service#getBase_Node <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Node</em>' reference.
	 * @see #getBase_Node()
	 * @generated
	 */
	void setBase_Node(Node value);

	/**
	 * Returns the value of the '<em><b>Publishes</b></em>' reference list.
	 * The list contents are of type {@link io.github.abelgomez.ps.Resource}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.ps.Resource#getOwningService <em>Owning Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishes</em>' reference list.
	 * @see io.github.abelgomez.ps.PsPackage#getService_Publishes()
	 * @see io.github.abelgomez.ps.Resource#getOwningService
	 * @model opposite="owningService" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.base_Node.nestedClassifier->collect(getStereotypeApplication(getApplicableStereotype(\'Publish-Subscribe::Resource\')))->reject(oclIsUndefined()).oclAsType(Resource)->asSet()'"
	 * @generated
	 */
	EList<Resource> getPublishes();

} // Service
