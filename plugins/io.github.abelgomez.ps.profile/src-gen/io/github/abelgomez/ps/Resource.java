/**
 */
package io.github.abelgomez.ps;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.base_Artifact.owner.getStereotypeApplication(base_Artifact.owner.getApplicableStereotype('Publish-Subscribe::Service')).oclIsUndefined()._not()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.ps.Resource#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Resource#getEpr <em>Epr</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Resource#getTag <em>Tag</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Resource#getValue <em>Value</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Resource#getTime <em>Time</em>}</li>
 *   <li>{@link io.github.abelgomez.ps.Resource#getOwningService <em>Owning Service</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.ps.PsPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Artifact</em>' reference.
	 * @see #setBase_Artifact(Artifact)
	 * @see io.github.abelgomez.ps.PsPackage#getResource_Base_Artifact()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Artifact getBase_Artifact();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Resource#getBase_Artifact <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Artifact</em>' reference.
	 * @see #getBase_Artifact()
	 * @generated
	 */
	void setBase_Artifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Epr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epr</em>' attribute.
	 * @see #setEpr(String)
	 * @see io.github.abelgomez.ps.PsPackage#getResource_Epr()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getEpr();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Resource#getEpr <em>Epr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epr</em>' attribute.
	 * @see #getEpr()
	 * @generated
	 */
	void setEpr(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see io.github.abelgomez.ps.PsPackage#getResource_Tag()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Resource#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see io.github.abelgomez.ps.PsPackage#getResource_Value()
	 * @model dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Resource#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see io.github.abelgomez.ps.PsPackage#getResource_Time()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Resource#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Owning Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.ps.Service#getPublishes <em>Publishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Service</em>' reference.
	 * @see #setOwningService(Service)
	 * @see io.github.abelgomez.ps.PsPackage#getResource_OwningService()
	 * @see io.github.abelgomez.ps.Service#getPublishes
	 * @model opposite="publishes" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL initial='self.base_Artifact.owner.getStereotypeApplication(base_Artifact.owner.getApplicableStereotype(\'Publish-Subscribe::Service\')).oclAsType(Service)'"
	 * @generated
	 */
	Service getOwningService();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.ps.Resource#getOwningService <em>Owning Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Service</em>' reference.
	 * @see #getOwningService()
	 * @generated
	 */
	void setOwningService(Service value);

} // Resource
