/**
 */
package io.github.abelgomez.cpntools;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.cpntools.CpntoolsPackage
 * @generated
 */
public interface CpntoolsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpntoolsFactory eINSTANCE = io.github.abelgomez.cpntools.impl.CpntoolsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cpnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpnet</em>'.
	 * @generated
	 */
	Cpnet createCpnet();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Initmark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initmark</em>'.
	 * @generated
	 */
	Initmark createInitmark();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Fusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fusion</em>'.
	 * @generated
	 */
	Fusion createFusion();

	/**
	 * Returns a new object of class '<em>Globbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Globbox</em>'.
	 * @generated
	 */
	Globbox createGlobbox();

	/**
	 * Returns a new object of class '<em>Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var</em>'.
	 * @generated
	 */
	Var createVar();

	/**
	 * Returns a new object of class '<em>Globref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Globref</em>'.
	 * @generated
	 */
	Globref createGlobref();

	/**
	 * Returns a new object of class '<em>Ml</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ml</em>'.
	 * @generated
	 */
	Ml createMl();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Aux Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aux Text</em>'.
	 * @generated
	 */
	AuxText createAuxText();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Trans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trans</em>'.
	 * @generated
	 */
	Trans createTrans();

	/**
	 * Returns a new object of class '<em>Trans Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trans Cond</em>'.
	 * @generated
	 */
	TransCond createTransCond();

	/**
	 * Returns a new object of class '<em>Trans Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trans Priority</em>'.
	 * @generated
	 */
	TransPriority createTransPriority();

	/**
	 * Returns a new object of class '<em>Trans Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trans Time</em>'.
	 * @generated
	 */
	TransTime createTransTime();

	/**
	 * Returns a new object of class '<em>Annot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annot</em>'.
	 * @generated
	 */
	Annot createAnnot();

	/**
	 * Returns a new object of class '<em>Aux Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aux Ellipse</em>'.
	 * @generated
	 */
	AuxEllipse createAuxEllipse();

	/**
	 * Returns a new object of class '<em>Aux Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aux Box</em>'.
	 * @generated
	 */
	AuxBox createAuxBox();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	Integer createInteger();

	/**
	 * Returns a new object of class '<em>Large Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Large Integer</em>'.
	 * @generated
	 */
	LargeInteger createLargeInteger();

	/**
	 * Returns a new object of class '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real</em>'.
	 * @generated
	 */
	Real createReal();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated</em>'.
	 * @generated
	 */
	Enumerated createEnumerated();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record</em>'.
	 * @generated
	 */
	Record createRecord();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union</em>'.
	 * @generated
	 */
	Union createUnion();

	/**
	 * Returns a new object of class '<em>Subset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subset</em>'.
	 * @generated
	 */
	Subset createSubset();

	/**
	 * Returns a new object of class '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias</em>'.
	 * @generated
	 */
	Alias createAlias();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CpntoolsPackage getCpntoolsPackage();

} //CpntoolsFactory
