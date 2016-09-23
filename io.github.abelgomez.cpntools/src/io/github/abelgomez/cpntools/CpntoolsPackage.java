/**
 */
package io.github.abelgomez.cpntools;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.cpntools.CpntoolsFactory
 * @model kind="package"
 * @generated
 */
public interface CpntoolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cpntools";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://io.github.abelgomez/cpntools/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cpntools";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpntoolsPackage eINSTANCE = io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.CpnetImpl <em>Cpnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.CpnetImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getCpnet()
	 * @generated
	 */
	int CPNET = 0;

	/**
	 * The feature id for the '<em><b>Fusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPNET__FUSIONS = 0;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPNET__GLOBBOX = 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPNET__PAGE = 2;

	/**
	 * The number of structural features of the '<em>Cpnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPNET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cpnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPNET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.PageImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PLACES = 1;

	/**
	 * The feature id for the '<em><b>Auxiliarys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__AUXILIARYS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Cpnet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CPNET = 4;

	/**
	 * The feature id for the '<em><b>Transs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TRANSS = 5;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ARCS = 6;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__POSX = 7;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__POSY = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__WIDTH = 9;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEIGHT = 10;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Layout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___LAYOUT__INTEGER_INTEGER_INTEGER = 0;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.GroupImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Group Elms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP_ELMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PAGE = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.DiagramElementImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__LINE_COLOUR = 0;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__FILL_FILLED = 1;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__LINE_THICK = 2;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__POSX = 3;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__LINE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__POSY = 5;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__FILL_COLOUR = 6;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__FILL_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__GROUP = 8;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.PlaceImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 4;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__HEIGHT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__WIDTH = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initmark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITMARK = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PORT = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fusion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__FUSION = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PAGE = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ARCS = DIAGRAM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.DeclarationImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__GLOBBOX = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.ColorSetImpl <em>Color Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.ColorSetImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getColorSet()
	 * @generated
	 */
	int COLOR_SET = 5;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET__GLOBBOX = DECLARATION__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET__BLOCK = DECLARATION__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET__IDNAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET__COLOR_SET_TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET__TIMED = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET__DECLARE = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Color Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Color Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SET_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.InitmarkImpl <em>Initmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.InitmarkImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getInitmark()
	 * @generated
	 */
	int INITMARK = 7;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK__MARKS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITMARK_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.MarkImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Initmark</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__INITMARK = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__TIME = 3;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.PortImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.FusionImpl <em>Fusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.FusionImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getFusion()
	 * @generated
	 */
	int FUSION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION__PLACES = 1;

	/**
	 * The feature id for the '<em><b>Cpnet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION__CPNET = 2;

	/**
	 * The number of structural features of the '<em>Fusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.AuxiliaryImpl <em>Auxiliary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.AuxiliaryImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxiliary()
	 * @generated
	 */
	int AUXILIARY = 11;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY__PAGE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auxiliary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.GlobboxImpl <em>Globbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.GlobboxImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getGlobbox()
	 * @generated
	 */
	int GLOBBOX = 12;

	/**
	 * The feature id for the '<em><b>Cpnet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBBOX__CPNET = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBBOX__DECLARATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBBOX__NAME = 2;

	/**
	 * The number of structural features of the '<em>Globbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBBOX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Globbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBBOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.VarImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 13;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__GLOBBOX = DECLARATION__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__BLOCK = DECLARATION__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__IDNAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.GlobrefImpl <em>Globref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.GlobrefImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getGlobref()
	 * @generated
	 */
	int GLOBREF = 14;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBREF__GLOBBOX = DECLARATION__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBREF__BLOCK = DECLARATION__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBREF__IDNAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Globref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBREF_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Globref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBREF_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.MlImpl <em>Ml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.MlImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getMl()
	 * @generated
	 */
	int ML = 15;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML__GLOBBOX = DECLARATION__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML__BLOCK = DECLARATION__BLOCK;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML__EXPRESSION = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.BlockImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 16;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__GLOBBOX = DECLARATION__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK = DECLARATION__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IDNAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DECLARATIONS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.AuxTextImpl <em>Aux Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.AuxTextImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxText()
	 * @generated
	 */
	int AUX_TEXT = 17;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__LINE_COLOUR = AUXILIARY__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__FILL_FILLED = AUXILIARY__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__LINE_THICK = AUXILIARY__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__POSX = AUXILIARY__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__LINE_TYPE = AUXILIARY__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__POSY = AUXILIARY__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__FILL_COLOUR = AUXILIARY__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__FILL_PATTERN = AUXILIARY__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__GROUP = AUXILIARY__GROUP;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__PAGE = AUXILIARY__PAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT__TEXT = AUXILIARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aux Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT_FEATURE_COUNT = AUXILIARY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aux Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_TEXT_OPERATION_COUNT = AUXILIARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.ArcImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 18;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Headsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__HEADSIZE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PLACE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ORIENTATION = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currentcyckle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__CURRENTCYCKLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ORDER = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TRANS = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ANNOT = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PAGE = DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.TransImpl <em>Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.TransImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getTrans()
	 * @generated
	 */
	int TRANS = 19;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__HEIGHT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__WIDTH = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__EXPLICIT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__COND = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__PAGE = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS__ARCS = DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.CondImpl <em>Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.CondImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getCond()
	 * @generated
	 */
	int COND = 20;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND__TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.AnnotImpl <em>Annot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.AnnotImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAnnot()
	 * @generated
	 */
	int ANNOT = 21;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__LINE_COLOUR = DIAGRAM_ELEMENT__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__FILL_FILLED = DIAGRAM_ELEMENT__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__LINE_THICK = DIAGRAM_ELEMENT__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__POSX = DIAGRAM_ELEMENT__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__LINE_TYPE = DIAGRAM_ELEMENT__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__POSY = DIAGRAM_ELEMENT__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__FILL_COLOUR = DIAGRAM_ELEMENT__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__FILL_PATTERN = DIAGRAM_ELEMENT__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__GROUP = DIAGRAM_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT__TEXT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOT_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.AuxEllipseImpl <em>Aux Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.AuxEllipseImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxEllipse()
	 * @generated
	 */
	int AUX_ELLIPSE = 22;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__LINE_COLOUR = AUXILIARY__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__FILL_FILLED = AUXILIARY__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__LINE_THICK = AUXILIARY__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__POSX = AUXILIARY__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__LINE_TYPE = AUXILIARY__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__POSY = AUXILIARY__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__FILL_COLOUR = AUXILIARY__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__FILL_PATTERN = AUXILIARY__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__GROUP = AUXILIARY__GROUP;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__PAGE = AUXILIARY__PAGE;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__HEIGHT = AUXILIARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE__WIDTH = AUXILIARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aux Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE_FEATURE_COUNT = AUXILIARY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aux Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_ELLIPSE_OPERATION_COUNT = AUXILIARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.AuxBoxImpl <em>Aux Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.AuxBoxImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxBox()
	 * @generated
	 */
	int AUX_BOX = 23;

	/**
	 * The feature id for the '<em><b>Line Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__LINE_COLOUR = AUXILIARY__LINE_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__FILL_FILLED = AUXILIARY__FILL_FILLED;

	/**
	 * The feature id for the '<em><b>Line Thick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__LINE_THICK = AUXILIARY__LINE_THICK;

	/**
	 * The feature id for the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__POSX = AUXILIARY__POSX;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__LINE_TYPE = AUXILIARY__LINE_TYPE;

	/**
	 * The feature id for the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__POSY = AUXILIARY__POSY;

	/**
	 * The feature id for the '<em><b>Fill Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__FILL_COLOUR = AUXILIARY__FILL_COLOUR;

	/**
	 * The feature id for the '<em><b>Fill Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__FILL_PATTERN = AUXILIARY__FILL_PATTERN;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__GROUP = AUXILIARY__GROUP;

	/**
	 * The feature id for the '<em><b>Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__PAGE = AUXILIARY__PAGE;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__HEIGHT = AUXILIARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX__WIDTH = AUXILIARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aux Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX_FEATURE_COUNT = AUXILIARY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aux Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_BOX_OPERATION_COUNT = AUXILIARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.SimpleColorSetImpl <em>Simple Color Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.SimpleColorSetImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getSimpleColorSet()
	 * @generated
	 */
	int SIMPLE_COLOR_SET = 24;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET__GLOBBOX = COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET__BLOCK = COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET__IDNAME = COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET__COLOR_SET_TYPE = COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET__TIMED = COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET__DECLARE = COLOR_SET__DECLARE;

	/**
	 * The number of structural features of the '<em>Simple Color Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET_FEATURE_COUNT = COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Color Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COLOR_SET_OPERATION_COUNT = COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.CompoundColorSetImpl <em>Compound Color Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.CompoundColorSetImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getCompoundColorSet()
	 * @generated
	 */
	int COMPOUND_COLOR_SET = 25;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET__GLOBBOX = COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET__BLOCK = COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET__IDNAME = COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET__COLOR_SET_TYPE = COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET__TIMED = COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET__DECLARE = COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>Simple Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET__SIMPLE_COLORS = COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Color Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET_FEATURE_COUNT = COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compound Color Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_COLOR_SET_OPERATION_COUNT = COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.UnitImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 26;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.BooleanImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 27;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.IntegerImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 28;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.LargeIntegerImpl <em>Large Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.LargeIntegerImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getLargeInteger()
	 * @generated
	 */
	int LARGE_INTEGER = 29;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Large Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Large Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_INTEGER_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.RealImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 30;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.TimeImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 31;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.StringImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getString()
	 * @generated
	 */
	int STRING = 32;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>And</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__AND = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.EnumeratedImpl <em>Enumerated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.EnumeratedImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 33;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.IndexImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 34;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__GLOBBOX = SIMPLE_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__BLOCK = SIMPLE_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__IDNAME = SIMPLE_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COLOR_SET_TYPE = SIMPLE_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__TIMED = SIMPLE_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__DECLARE = SIMPLE_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__WITH = SIMPLE_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = SIMPLE_COLOR_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = SIMPLE_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.ProductImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 35;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__GLOBBOX = COMPOUND_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BLOCK = COMPOUND_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IDNAME = COMPOUND_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COLOR_SET_TYPE = COMPOUND_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TIMED = COMPOUND_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DECLARE = COMPOUND_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>Simple Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SIMPLE_COLORS = COMPOUND_COLOR_SET__SIMPLE_COLORS;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = COMPOUND_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = COMPOUND_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.RecordImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 36;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__GLOBBOX = COMPOUND_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__BLOCK = COMPOUND_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__IDNAME = COMPOUND_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COLOR_SET_TYPE = COMPOUND_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__TIMED = COMPOUND_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__DECLARE = COMPOUND_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>Simple Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SIMPLE_COLORS = COMPOUND_COLOR_SET__SIMPLE_COLORS;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = COMPOUND_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = COMPOUND_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.ListImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 37;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__GLOBBOX = COMPOUND_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BLOCK = COMPOUND_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IDNAME = COMPOUND_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__COLOR_SET_TYPE = COMPOUND_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TIMED = COMPOUND_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__DECLARE = COMPOUND_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>Simple Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SIMPLE_COLORS = COMPOUND_COLOR_SET__SIMPLE_COLORS;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = COMPOUND_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = COMPOUND_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.UnionImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 38;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__GLOBBOX = COMPOUND_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__BLOCK = COMPOUND_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__IDNAME = COMPOUND_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__COLOR_SET_TYPE = COMPOUND_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__TIMED = COMPOUND_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__DECLARE = COMPOUND_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>Simple Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__SIMPLE_COLORS = COMPOUND_COLOR_SET__SIMPLE_COLORS;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = COMPOUND_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = COMPOUND_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.SubsetImpl <em>Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.SubsetImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getSubset()
	 * @generated
	 */
	int SUBSET = 39;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__GLOBBOX = COMPOUND_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__BLOCK = COMPOUND_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__IDNAME = COMPOUND_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__COLOR_SET_TYPE = COMPOUND_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__TIMED = COMPOUND_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__DECLARE = COMPOUND_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>Simple Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__SIMPLE_COLORS = COMPOUND_COLOR_SET__SIMPLE_COLORS;

	/**
	 * The number of structural features of the '<em>Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_FEATURE_COUNT = COMPOUND_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_OPERATION_COUNT = COMPOUND_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.impl.AliasImpl
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 40;

	/**
	 * The feature id for the '<em><b>Globbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__GLOBBOX = COMPOUND_COLOR_SET__GLOBBOX;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__BLOCK = COMPOUND_COLOR_SET__BLOCK;

	/**
	 * The feature id for the '<em><b>Idname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__IDNAME = COMPOUND_COLOR_SET__IDNAME;

	/**
	 * The feature id for the '<em><b>Color Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__COLOR_SET_TYPE = COMPOUND_COLOR_SET__COLOR_SET_TYPE;

	/**
	 * The feature id for the '<em><b>Timed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__TIMED = COMPOUND_COLOR_SET__TIMED;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__DECLARE = COMPOUND_COLOR_SET__DECLARE;

	/**
	 * The feature id for the '<em><b>Simple Colors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__SIMPLE_COLORS = COMPOUND_COLOR_SET__SIMPLE_COLORS;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = COMPOUND_COLOR_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_OPERATION_COUNT = COMPOUND_COLOR_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.cpntools.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.cpntools.Orientation
	 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 41;


	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Cpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpnet</em>'.
	 * @see io.github.abelgomez.cpntools.Cpnet
	 * @generated
	 */
	EClass getCpnet();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Cpnet#getFusions <em>Fusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fusions</em>'.
	 * @see io.github.abelgomez.cpntools.Cpnet#getFusions()
	 * @see #getCpnet()
	 * @generated
	 */
	EReference getCpnet_Fusions();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.cpntools.Cpnet#getGlobbox <em>Globbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Globbox</em>'.
	 * @see io.github.abelgomez.cpntools.Cpnet#getGlobbox()
	 * @see #getCpnet()
	 * @generated
	 */
	EReference getCpnet_Globbox();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.cpntools.Cpnet#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page</em>'.
	 * @see io.github.abelgomez.cpntools.Cpnet#getPage()
	 * @see #getCpnet()
	 * @generated
	 */
	EReference getCpnet_Page();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see io.github.abelgomez.cpntools.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Page#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getGroup()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Page#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getPlaces()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Page#getAuxiliarys <em>Auxiliarys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliarys</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getAuxiliarys()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Auxiliarys();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Page#getCpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cpnet</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getCpnet()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Cpnet();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Page#getTranss <em>Transs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transs</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getTranss()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Transs();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Page#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getArcs()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Arcs();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Page#getPosx <em>Posx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posx</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getPosx()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Posx();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Page#getPosy <em>Posy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posy</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getPosy()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Posy();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Page#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getWidth()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Width();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Page#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see io.github.abelgomez.cpntools.Page#getHeight()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Height();

	/**
	 * Returns the meta object for the '{@link io.github.abelgomez.cpntools.Page#layout(java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Layout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Layout</em>' operation.
	 * @see io.github.abelgomez.cpntools.Page#layout(java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getPage__Layout__Integer_Integer_Integer();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see io.github.abelgomez.cpntools.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Group#getGroupElms <em>Group Elms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Elms</em>'.
	 * @see io.github.abelgomez.cpntools.Group#getGroupElms()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_GroupElms();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.cpntools.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Group#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see io.github.abelgomez.cpntools.Group#getPage()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Page();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#getLineColour <em>Line Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Colour</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getLineColour()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_LineColour();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#isFillFilled <em>Fill Filled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Filled</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#isFillFilled()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_FillFilled();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#getLineThick <em>Line Thick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Thick</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getLineThick()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_LineThick();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#getPosx <em>Posx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posx</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getPosx()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_Posx();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#getLineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Type</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getLineType()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_LineType();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#getPosy <em>Posy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posy</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getPosy()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_Posy();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#getFillColour <em>Fill Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Colour</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getFillColour()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_FillColour();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.DiagramElement#getFillPattern <em>Fill Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Pattern</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getFillPattern()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_FillPattern();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.DiagramElement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see io.github.abelgomez.cpntools.DiagramElement#getGroup()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Group();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see io.github.abelgomez.cpntools.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Place#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getHeight()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Height();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Place#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getWidth()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Width();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.cpntools.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Type();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.cpntools.Place#getInitmark <em>Initmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initmark</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getInitmark()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Initmark();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.cpntools.Place#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getPort()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Port();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.cpntools.Place#getFusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fusion</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getFusion()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Fusion();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Place#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getPage()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Page();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Place#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getText()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Text();

	/**
	 * Returns the meta object for the reference list '{@link io.github.abelgomez.cpntools.Place#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see io.github.abelgomez.cpntools.Place#getArcs()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Arcs();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.ColorSet <em>Color Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Set</em>'.
	 * @see io.github.abelgomez.cpntools.ColorSet
	 * @generated
	 */
	EClass getColorSet();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.ColorSet#getIdname <em>Idname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idname</em>'.
	 * @see io.github.abelgomez.cpntools.ColorSet#getIdname()
	 * @see #getColorSet()
	 * @generated
	 */
	EAttribute getColorSet_Idname();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.ColorSet#getColorSetType <em>Color Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Set Type</em>'.
	 * @see io.github.abelgomez.cpntools.ColorSet#getColorSetType()
	 * @see #getColorSet()
	 * @generated
	 */
	EAttribute getColorSet_ColorSetType();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.ColorSet#isTimed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timed</em>'.
	 * @see io.github.abelgomez.cpntools.ColorSet#isTimed()
	 * @see #getColorSet()
	 * @generated
	 */
	EAttribute getColorSet_Timed();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.ColorSet#getDeclare <em>Declare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declare</em>'.
	 * @see io.github.abelgomez.cpntools.ColorSet#getDeclare()
	 * @see #getColorSet()
	 * @generated
	 */
	EAttribute getColorSet_Declare();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see io.github.abelgomez.cpntools.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Declaration#getGlobbox <em>Globbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Globbox</em>'.
	 * @see io.github.abelgomez.cpntools.Declaration#getGlobbox()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Globbox();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Declaration#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see io.github.abelgomez.cpntools.Declaration#getBlock()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Block();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Initmark <em>Initmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initmark</em>'.
	 * @see io.github.abelgomez.cpntools.Initmark
	 * @generated
	 */
	EClass getInitmark();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Initmark#getMarks <em>Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marks</em>'.
	 * @see io.github.abelgomez.cpntools.Initmark#getMarks()
	 * @see #getInitmark()
	 * @generated
	 */
	EReference getInitmark_Marks();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see io.github.abelgomez.cpntools.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Mark#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see io.github.abelgomez.cpntools.Mark#getValue()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Value();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Mark#getInitmark <em>Initmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Initmark</em>'.
	 * @see io.github.abelgomez.cpntools.Mark#getInitmark()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Initmark();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Mark#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see io.github.abelgomez.cpntools.Mark#getExpression()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Expression();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Mark#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see io.github.abelgomez.cpntools.Mark#getTime()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Time();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see io.github.abelgomez.cpntools.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Port#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see io.github.abelgomez.cpntools.Port#getPortType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_PortType();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Fusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fusion</em>'.
	 * @see io.github.abelgomez.cpntools.Fusion
	 * @generated
	 */
	EClass getFusion();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Fusion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.cpntools.Fusion#getName()
	 * @see #getFusion()
	 * @generated
	 */
	EAttribute getFusion_Name();

	/**
	 * Returns the meta object for the reference list '{@link io.github.abelgomez.cpntools.Fusion#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Places</em>'.
	 * @see io.github.abelgomez.cpntools.Fusion#getPlaces()
	 * @see #getFusion()
	 * @generated
	 */
	EReference getFusion_Places();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Fusion#getCpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cpnet</em>'.
	 * @see io.github.abelgomez.cpntools.Fusion#getCpnet()
	 * @see #getFusion()
	 * @generated
	 */
	EReference getFusion_Cpnet();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Auxiliary <em>Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary</em>'.
	 * @see io.github.abelgomez.cpntools.Auxiliary
	 * @generated
	 */
	EClass getAuxiliary();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Auxiliary#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see io.github.abelgomez.cpntools.Auxiliary#getPage()
	 * @see #getAuxiliary()
	 * @generated
	 */
	EReference getAuxiliary_Page();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Globbox <em>Globbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Globbox</em>'.
	 * @see io.github.abelgomez.cpntools.Globbox
	 * @generated
	 */
	EClass getGlobbox();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Globbox#getCpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cpnet</em>'.
	 * @see io.github.abelgomez.cpntools.Globbox#getCpnet()
	 * @see #getGlobbox()
	 * @generated
	 */
	EReference getGlobbox_Cpnet();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Globbox#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see io.github.abelgomez.cpntools.Globbox#getDeclarations()
	 * @see #getGlobbox()
	 * @generated
	 */
	EReference getGlobbox_Declarations();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Globbox#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.cpntools.Globbox#getName()
	 * @see #getGlobbox()
	 * @generated
	 */
	EAttribute getGlobbox_Name();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see io.github.abelgomez.cpntools.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Var#getIdname <em>Idname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idname</em>'.
	 * @see io.github.abelgomez.cpntools.Var#getIdname()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Idname();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.cpntools.Var#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see io.github.abelgomez.cpntools.Var#getType()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Type();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Globref <em>Globref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Globref</em>'.
	 * @see io.github.abelgomez.cpntools.Globref
	 * @generated
	 */
	EClass getGlobref();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Globref#getIdname <em>Idname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idname</em>'.
	 * @see io.github.abelgomez.cpntools.Globref#getIdname()
	 * @see #getGlobref()
	 * @generated
	 */
	EAttribute getGlobref_Idname();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Ml <em>Ml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ml</em>'.
	 * @see io.github.abelgomez.cpntools.Ml
	 * @generated
	 */
	EClass getMl();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Ml#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see io.github.abelgomez.cpntools.Ml#getExpression()
	 * @see #getMl()
	 * @generated
	 */
	EAttribute getMl_Expression();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see io.github.abelgomez.cpntools.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Block#getIdname <em>Idname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idname</em>'.
	 * @see io.github.abelgomez.cpntools.Block#getIdname()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Idname();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.cpntools.Block#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see io.github.abelgomez.cpntools.Block#getDeclarations()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Declarations();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.AuxText <em>Aux Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aux Text</em>'.
	 * @see io.github.abelgomez.cpntools.AuxText
	 * @generated
	 */
	EClass getAuxText();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.AuxText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see io.github.abelgomez.cpntools.AuxText#getText()
	 * @see #getAuxText()
	 * @generated
	 */
	EAttribute getAuxText_Text();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see io.github.abelgomez.cpntools.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Arc#getHeadsize <em>Headsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headsize</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getHeadsize()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Headsize();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.cpntools.Arc#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Place();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Arc#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getOrientation()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Arc#getCurrentcyckle <em>Currentcyckle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currentcyckle</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getCurrentcyckle()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Currentcyckle();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Arc#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getOrder()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Order();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.cpntools.Arc#getTrans <em>Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trans</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getTrans()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Trans();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.cpntools.Arc#getAnnot <em>Annot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annot</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getAnnot()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Annot();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Arc#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see io.github.abelgomez.cpntools.Arc#getPage()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Page();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Trans <em>Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trans</em>'.
	 * @see io.github.abelgomez.cpntools.Trans
	 * @generated
	 */
	EClass getTrans();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Trans#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see io.github.abelgomez.cpntools.Trans#getHeight()
	 * @see #getTrans()
	 * @generated
	 */
	EAttribute getTrans_Height();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Trans#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see io.github.abelgomez.cpntools.Trans#getWidth()
	 * @see #getTrans()
	 * @generated
	 */
	EAttribute getTrans_Width();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Trans#isExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit</em>'.
	 * @see io.github.abelgomez.cpntools.Trans#isExplicit()
	 * @see #getTrans()
	 * @generated
	 */
	EAttribute getTrans_Explicit();

	/**
	 * Returns the meta object for the containment reference '{@link io.github.abelgomez.cpntools.Trans#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see io.github.abelgomez.cpntools.Trans#getCond()
	 * @see #getTrans()
	 * @generated
	 */
	EReference getTrans_Cond();

	/**
	 * Returns the meta object for the container reference '{@link io.github.abelgomez.cpntools.Trans#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page</em>'.
	 * @see io.github.abelgomez.cpntools.Trans#getPage()
	 * @see #getTrans()
	 * @generated
	 */
	EReference getTrans_Page();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Trans#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see io.github.abelgomez.cpntools.Trans#getText()
	 * @see #getTrans()
	 * @generated
	 */
	EAttribute getTrans_Text();

	/**
	 * Returns the meta object for the reference list '{@link io.github.abelgomez.cpntools.Trans#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see io.github.abelgomez.cpntools.Trans#getArcs()
	 * @see #getTrans()
	 * @generated
	 */
	EReference getTrans_Arcs();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Cond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cond</em>'.
	 * @see io.github.abelgomez.cpntools.Cond
	 * @generated
	 */
	EClass getCond();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Cond#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see io.github.abelgomez.cpntools.Cond#getText()
	 * @see #getCond()
	 * @generated
	 */
	EAttribute getCond_Text();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Annot <em>Annot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annot</em>'.
	 * @see io.github.abelgomez.cpntools.Annot
	 * @generated
	 */
	EClass getAnnot();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Annot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see io.github.abelgomez.cpntools.Annot#getText()
	 * @see #getAnnot()
	 * @generated
	 */
	EAttribute getAnnot_Text();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.AuxEllipse <em>Aux Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aux Ellipse</em>'.
	 * @see io.github.abelgomez.cpntools.AuxEllipse
	 * @generated
	 */
	EClass getAuxEllipse();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.AuxEllipse#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see io.github.abelgomez.cpntools.AuxEllipse#getHeight()
	 * @see #getAuxEllipse()
	 * @generated
	 */
	EAttribute getAuxEllipse_Height();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.AuxEllipse#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see io.github.abelgomez.cpntools.AuxEllipse#getWidth()
	 * @see #getAuxEllipse()
	 * @generated
	 */
	EAttribute getAuxEllipse_Width();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.AuxBox <em>Aux Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aux Box</em>'.
	 * @see io.github.abelgomez.cpntools.AuxBox
	 * @generated
	 */
	EClass getAuxBox();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.AuxBox#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see io.github.abelgomez.cpntools.AuxBox#getHeight()
	 * @see #getAuxBox()
	 * @generated
	 */
	EAttribute getAuxBox_Height();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.AuxBox#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see io.github.abelgomez.cpntools.AuxBox#getWidth()
	 * @see #getAuxBox()
	 * @generated
	 */
	EAttribute getAuxBox_Width();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.SimpleColorSet <em>Simple Color Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Color Set</em>'.
	 * @see io.github.abelgomez.cpntools.SimpleColorSet
	 * @generated
	 */
	EClass getSimpleColorSet();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.CompoundColorSet <em>Compound Color Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Color Set</em>'.
	 * @see io.github.abelgomez.cpntools.CompoundColorSet
	 * @generated
	 */
	EClass getCompoundColorSet();

	/**
	 * Returns the meta object for the reference list '{@link io.github.abelgomez.cpntools.CompoundColorSet#getSimpleColors <em>Simple Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simple Colors</em>'.
	 * @see io.github.abelgomez.cpntools.CompoundColorSet#getSimpleColors()
	 * @see #getCompoundColorSet()
	 * @generated
	 */
	EReference getCompoundColorSet_SimpleColors();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see io.github.abelgomez.cpntools.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.cpntools.Unit#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.Unit#getWith()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_With();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see io.github.abelgomez.cpntools.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.Boolean#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.Boolean#getWith()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_With();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see io.github.abelgomez.cpntools.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.Integer#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.Integer#getWith()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_With();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.LargeInteger <em>Large Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Integer</em>'.
	 * @see io.github.abelgomez.cpntools.LargeInteger
	 * @generated
	 */
	EClass getLargeInteger();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.LargeInteger#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.LargeInteger#getWith()
	 * @see #getLargeInteger()
	 * @generated
	 */
	EAttribute getLargeInteger_With();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see io.github.abelgomez.cpntools.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.Real#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.Real#getWith()
	 * @see #getReal()
	 * @generated
	 */
	EAttribute getReal_With();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see io.github.abelgomez.cpntools.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see io.github.abelgomez.cpntools.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.String#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.String#getWith()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_With();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.String#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>And</em>'.
	 * @see io.github.abelgomez.cpntools.String#getAnd()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_And();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated</em>'.
	 * @see io.github.abelgomez.cpntools.Enumerated
	 * @generated
	 */
	EClass getEnumerated();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.Enumerated#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.Enumerated#getWith()
	 * @see #getEnumerated()
	 * @generated
	 */
	EAttribute getEnumerated_With();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see io.github.abelgomez.cpntools.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute list '{@link io.github.abelgomez.cpntools.Index#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With</em>'.
	 * @see io.github.abelgomez.cpntools.Index#getWith()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_With();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see io.github.abelgomez.cpntools.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see io.github.abelgomez.cpntools.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see io.github.abelgomez.cpntools.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see io.github.abelgomez.cpntools.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Subset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subset</em>'.
	 * @see io.github.abelgomez.cpntools.Subset
	 * @generated
	 */
	EClass getSubset();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.cpntools.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see io.github.abelgomez.cpntools.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for enum '{@link io.github.abelgomez.cpntools.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see io.github.abelgomez.cpntools.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpntoolsFactory getCpntoolsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.CpnetImpl <em>Cpnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.CpnetImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getCpnet()
		 * @generated
		 */
		EClass CPNET = eINSTANCE.getCpnet();

		/**
		 * The meta object literal for the '<em><b>Fusions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPNET__FUSIONS = eINSTANCE.getCpnet_Fusions();

		/**
		 * The meta object literal for the '<em><b>Globbox</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPNET__GLOBBOX = eINSTANCE.getCpnet_Globbox();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPNET__PAGE = eINSTANCE.getCpnet_Page();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.PageImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__GROUP = eINSTANCE.getPage_Group();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PLACES = eINSTANCE.getPage_Places();

		/**
		 * The meta object literal for the '<em><b>Auxiliarys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__AUXILIARYS = eINSTANCE.getPage_Auxiliarys();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Cpnet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CPNET = eINSTANCE.getPage_Cpnet();

		/**
		 * The meta object literal for the '<em><b>Transs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__TRANSS = eINSTANCE.getPage_Transs();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ARCS = eINSTANCE.getPage_Arcs();

		/**
		 * The meta object literal for the '<em><b>Posx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__POSX = eINSTANCE.getPage_Posx();

		/**
		 * The meta object literal for the '<em><b>Posy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__POSY = eINSTANCE.getPage_Posy();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__WIDTH = eINSTANCE.getPage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__HEIGHT = eINSTANCE.getPage_Height();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___LAYOUT__INTEGER_INTEGER_INTEGER = eINSTANCE.getPage__Layout__Integer_Integer_Integer();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.GroupImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Group Elms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUP_ELMS = eINSTANCE.getGroup_GroupElms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PAGE = eINSTANCE.getGroup_Page();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.DiagramElementImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Line Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__LINE_COLOUR = eINSTANCE.getDiagramElement_LineColour();

		/**
		 * The meta object literal for the '<em><b>Fill Filled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__FILL_FILLED = eINSTANCE.getDiagramElement_FillFilled();

		/**
		 * The meta object literal for the '<em><b>Line Thick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__LINE_THICK = eINSTANCE.getDiagramElement_LineThick();

		/**
		 * The meta object literal for the '<em><b>Posx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__POSX = eINSTANCE.getDiagramElement_Posx();

		/**
		 * The meta object literal for the '<em><b>Line Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__LINE_TYPE = eINSTANCE.getDiagramElement_LineType();

		/**
		 * The meta object literal for the '<em><b>Posy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__POSY = eINSTANCE.getDiagramElement_Posy();

		/**
		 * The meta object literal for the '<em><b>Fill Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__FILL_COLOUR = eINSTANCE.getDiagramElement_FillColour();

		/**
		 * The meta object literal for the '<em><b>Fill Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__FILL_PATTERN = eINSTANCE.getDiagramElement_FillPattern();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__GROUP = eINSTANCE.getDiagramElement_Group();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.PlaceImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__HEIGHT = eINSTANCE.getPlace_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__WIDTH = eINSTANCE.getPlace_Width();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '<em><b>Initmark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INITMARK = eINSTANCE.getPlace_Initmark();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__PORT = eINSTANCE.getPlace_Port();

		/**
		 * The meta object literal for the '<em><b>Fusion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__FUSION = eINSTANCE.getPlace_Fusion();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__PAGE = eINSTANCE.getPlace_Page();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TEXT = eINSTANCE.getPlace_Text();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__ARCS = eINSTANCE.getPlace_Arcs();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.ColorSetImpl <em>Color Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.ColorSetImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getColorSet()
		 * @generated
		 */
		EClass COLOR_SET = eINSTANCE.getColorSet();

		/**
		 * The meta object literal for the '<em><b>Idname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_SET__IDNAME = eINSTANCE.getColorSet_Idname();

		/**
		 * The meta object literal for the '<em><b>Color Set Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_SET__COLOR_SET_TYPE = eINSTANCE.getColorSet_ColorSetType();

		/**
		 * The meta object literal for the '<em><b>Timed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_SET__TIMED = eINSTANCE.getColorSet_Timed();

		/**
		 * The meta object literal for the '<em><b>Declare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_SET__DECLARE = eINSTANCE.getColorSet_Declare();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.DeclarationImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Globbox</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__GLOBBOX = eINSTANCE.getDeclaration_Globbox();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__BLOCK = eINSTANCE.getDeclaration_Block();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.InitmarkImpl <em>Initmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.InitmarkImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getInitmark()
		 * @generated
		 */
		EClass INITMARK = eINSTANCE.getInitmark();

		/**
		 * The meta object literal for the '<em><b>Marks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITMARK__MARKS = eINSTANCE.getInitmark_Marks();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.MarkImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__VALUE = eINSTANCE.getMark_Value();

		/**
		 * The meta object literal for the '<em><b>Initmark</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__INITMARK = eINSTANCE.getMark_Initmark();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__EXPRESSION = eINSTANCE.getMark_Expression();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__TIME = eINSTANCE.getMark_Time();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.PortImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT_TYPE = eINSTANCE.getPort_PortType();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.FusionImpl <em>Fusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.FusionImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getFusion()
		 * @generated
		 */
		EClass FUSION = eINSTANCE.getFusion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUSION__NAME = eINSTANCE.getFusion_Name();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUSION__PLACES = eINSTANCE.getFusion_Places();

		/**
		 * The meta object literal for the '<em><b>Cpnet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUSION__CPNET = eINSTANCE.getFusion_Cpnet();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.AuxiliaryImpl <em>Auxiliary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.AuxiliaryImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxiliary()
		 * @generated
		 */
		EClass AUXILIARY = eINSTANCE.getAuxiliary();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY__PAGE = eINSTANCE.getAuxiliary_Page();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.GlobboxImpl <em>Globbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.GlobboxImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getGlobbox()
		 * @generated
		 */
		EClass GLOBBOX = eINSTANCE.getGlobbox();

		/**
		 * The meta object literal for the '<em><b>Cpnet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBBOX__CPNET = eINSTANCE.getGlobbox_Cpnet();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBBOX__DECLARATIONS = eINSTANCE.getGlobbox_Declarations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBBOX__NAME = eINSTANCE.getGlobbox_Name();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.VarImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Idname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__IDNAME = eINSTANCE.getVar_Idname();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__TYPE = eINSTANCE.getVar_Type();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.GlobrefImpl <em>Globref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.GlobrefImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getGlobref()
		 * @generated
		 */
		EClass GLOBREF = eINSTANCE.getGlobref();

		/**
		 * The meta object literal for the '<em><b>Idname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBREF__IDNAME = eINSTANCE.getGlobref_Idname();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.MlImpl <em>Ml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.MlImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getMl()
		 * @generated
		 */
		EClass ML = eINSTANCE.getMl();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML__EXPRESSION = eINSTANCE.getMl_Expression();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.BlockImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Idname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__IDNAME = eINSTANCE.getBlock_Idname();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DECLARATIONS = eINSTANCE.getBlock_Declarations();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.AuxTextImpl <em>Aux Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.AuxTextImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxText()
		 * @generated
		 */
		EClass AUX_TEXT = eINSTANCE.getAuxText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUX_TEXT__TEXT = eINSTANCE.getAuxText_Text();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.ArcImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Headsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__HEADSIZE = eINSTANCE.getArc_Headsize();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PLACE = eINSTANCE.getArc_Place();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__ORIENTATION = eINSTANCE.getArc_Orientation();

		/**
		 * The meta object literal for the '<em><b>Currentcyckle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__CURRENTCYCKLE = eINSTANCE.getArc_Currentcyckle();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__ORDER = eINSTANCE.getArc_Order();

		/**
		 * The meta object literal for the '<em><b>Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TRANS = eINSTANCE.getArc_Trans();

		/**
		 * The meta object literal for the '<em><b>Annot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__ANNOT = eINSTANCE.getArc_Annot();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PAGE = eINSTANCE.getArc_Page();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.TransImpl <em>Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.TransImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getTrans()
		 * @generated
		 */
		EClass TRANS = eINSTANCE.getTrans();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANS__HEIGHT = eINSTANCE.getTrans_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANS__WIDTH = eINSTANCE.getTrans_Width();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANS__EXPLICIT = eINSTANCE.getTrans_Explicit();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANS__COND = eINSTANCE.getTrans_Cond();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANS__PAGE = eINSTANCE.getTrans_Page();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANS__TEXT = eINSTANCE.getTrans_Text();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANS__ARCS = eINSTANCE.getTrans_Arcs();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.CondImpl <em>Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.CondImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getCond()
		 * @generated
		 */
		EClass COND = eINSTANCE.getCond();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COND__TEXT = eINSTANCE.getCond_Text();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.AnnotImpl <em>Annot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.AnnotImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAnnot()
		 * @generated
		 */
		EClass ANNOT = eINSTANCE.getAnnot();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOT__TEXT = eINSTANCE.getAnnot_Text();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.AuxEllipseImpl <em>Aux Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.AuxEllipseImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxEllipse()
		 * @generated
		 */
		EClass AUX_ELLIPSE = eINSTANCE.getAuxEllipse();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUX_ELLIPSE__HEIGHT = eINSTANCE.getAuxEllipse_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUX_ELLIPSE__WIDTH = eINSTANCE.getAuxEllipse_Width();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.AuxBoxImpl <em>Aux Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.AuxBoxImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAuxBox()
		 * @generated
		 */
		EClass AUX_BOX = eINSTANCE.getAuxBox();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUX_BOX__HEIGHT = eINSTANCE.getAuxBox_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUX_BOX__WIDTH = eINSTANCE.getAuxBox_Width();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.SimpleColorSetImpl <em>Simple Color Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.SimpleColorSetImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getSimpleColorSet()
		 * @generated
		 */
		EClass SIMPLE_COLOR_SET = eINSTANCE.getSimpleColorSet();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.CompoundColorSetImpl <em>Compound Color Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.CompoundColorSetImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getCompoundColorSet()
		 * @generated
		 */
		EClass COMPOUND_COLOR_SET = eINSTANCE.getCompoundColorSet();

		/**
		 * The meta object literal for the '<em><b>Simple Colors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_COLOR_SET__SIMPLE_COLORS = eINSTANCE.getCompoundColorSet_SimpleColors();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.UnitImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__WITH = eINSTANCE.getUnit_With();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.BooleanImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__WITH = eINSTANCE.getBoolean_With();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.IntegerImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__WITH = eINSTANCE.getInteger_With();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.LargeIntegerImpl <em>Large Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.LargeIntegerImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getLargeInteger()
		 * @generated
		 */
		EClass LARGE_INTEGER = eINSTANCE.getLargeInteger();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_INTEGER__WITH = eINSTANCE.getLargeInteger_With();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.RealImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL__WITH = eINSTANCE.getReal_With();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.TimeImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.StringImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__WITH = eINSTANCE.getString_With();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__AND = eINSTANCE.getString_And();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.EnumeratedImpl <em>Enumerated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.EnumeratedImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getEnumerated()
		 * @generated
		 */
		EClass ENUMERATED = eINSTANCE.getEnumerated();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATED__WITH = eINSTANCE.getEnumerated_With();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.IndexImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__WITH = eINSTANCE.getIndex_With();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.ProductImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.RecordImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.ListImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.UnionImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.SubsetImpl <em>Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.SubsetImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getSubset()
		 * @generated
		 */
		EClass SUBSET = eINSTANCE.getSubset();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.impl.AliasImpl
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getAlias()
		 * @generated
		 */
		EClass ALIAS = eINSTANCE.getAlias();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.cpntools.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.cpntools.Orientation
		 * @see io.github.abelgomez.cpntools.impl.CpntoolsPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

	}

} //CpntoolsPackage
