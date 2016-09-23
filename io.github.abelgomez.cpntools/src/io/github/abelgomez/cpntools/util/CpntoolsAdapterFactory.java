/**
 */
package io.github.abelgomez.cpntools.util;

import io.github.abelgomez.cpntools.Alias;
import io.github.abelgomez.cpntools.Annot;
import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.AuxBox;
import io.github.abelgomez.cpntools.AuxEllipse;
import io.github.abelgomez.cpntools.AuxText;
import io.github.abelgomez.cpntools.Auxiliary;
import io.github.abelgomez.cpntools.Block;
import io.github.abelgomez.cpntools.ColorSet;
import io.github.abelgomez.cpntools.CompoundColorSet;
import io.github.abelgomez.cpntools.Cond;
import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.Declaration;
import io.github.abelgomez.cpntools.DiagramElement;
import io.github.abelgomez.cpntools.Enumerated;
import io.github.abelgomez.cpntools.Fusion;
import io.github.abelgomez.cpntools.Globbox;
import io.github.abelgomez.cpntools.Globref;
import io.github.abelgomez.cpntools.Group;
import io.github.abelgomez.cpntools.Index;
import io.github.abelgomez.cpntools.Initmark;
import io.github.abelgomez.cpntools.LargeInteger;
import io.github.abelgomez.cpntools.List;
import io.github.abelgomez.cpntools.Mark;
import io.github.abelgomez.cpntools.Ml;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Port;
import io.github.abelgomez.cpntools.Product;
import io.github.abelgomez.cpntools.Real;
import io.github.abelgomez.cpntools.Record;
import io.github.abelgomez.cpntools.SimpleColorSet;
import io.github.abelgomez.cpntools.Subset;
import io.github.abelgomez.cpntools.Time;
import io.github.abelgomez.cpntools.Trans;
import io.github.abelgomez.cpntools.Union;
import io.github.abelgomez.cpntools.Unit;
import io.github.abelgomez.cpntools.Var;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.cpntools.CpntoolsPackage
 * @generated
 */
public class CpntoolsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CpntoolsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpntoolsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CpntoolsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpntoolsSwitch<Adapter> modelSwitch =
		new CpntoolsSwitch<Adapter>() {
			@Override
			public Adapter caseCpnet(Cpnet object) {
				return createCpnetAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseDiagramElement(DiagramElement object) {
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseColorSet(ColorSet object) {
				return createColorSetAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseInitmark(Initmark object) {
				return createInitmarkAdapter();
			}
			@Override
			public Adapter caseMark(Mark object) {
				return createMarkAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseFusion(Fusion object) {
				return createFusionAdapter();
			}
			@Override
			public Adapter caseAuxiliary(Auxiliary object) {
				return createAuxiliaryAdapter();
			}
			@Override
			public Adapter caseGlobbox(Globbox object) {
				return createGlobboxAdapter();
			}
			@Override
			public Adapter caseVar(Var object) {
				return createVarAdapter();
			}
			@Override
			public Adapter caseGlobref(Globref object) {
				return createGlobrefAdapter();
			}
			@Override
			public Adapter caseMl(Ml object) {
				return createMlAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseAuxText(AuxText object) {
				return createAuxTextAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter caseTrans(Trans object) {
				return createTransAdapter();
			}
			@Override
			public Adapter caseCond(Cond object) {
				return createCondAdapter();
			}
			@Override
			public Adapter caseAnnot(Annot object) {
				return createAnnotAdapter();
			}
			@Override
			public Adapter caseAuxEllipse(AuxEllipse object) {
				return createAuxEllipseAdapter();
			}
			@Override
			public Adapter caseAuxBox(AuxBox object) {
				return createAuxBoxAdapter();
			}
			@Override
			public Adapter caseSimpleColorSet(SimpleColorSet object) {
				return createSimpleColorSetAdapter();
			}
			@Override
			public Adapter caseCompoundColorSet(CompoundColorSet object) {
				return createCompoundColorSetAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseBoolean(io.github.abelgomez.cpntools.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseInteger(io.github.abelgomez.cpntools.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseLargeInteger(LargeInteger object) {
				return createLargeIntegerAdapter();
			}
			@Override
			public Adapter caseReal(Real object) {
				return createRealAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseString(io.github.abelgomez.cpntools.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseEnumerated(Enumerated object) {
				return createEnumeratedAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseRecord(Record object) {
				return createRecordAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseSubset(Subset object) {
				return createSubsetAdapter();
			}
			@Override
			public Adapter caseAlias(Alias object) {
				return createAliasAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Cpnet <em>Cpnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Cpnet
	 * @generated
	 */
	public Adapter createCpnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.ColorSet <em>Color Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.ColorSet
	 * @generated
	 */
	public Adapter createColorSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Initmark <em>Initmark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Initmark
	 * @generated
	 */
	public Adapter createInitmarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Mark
	 * @generated
	 */
	public Adapter createMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Fusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Fusion
	 * @generated
	 */
	public Adapter createFusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Auxiliary <em>Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Auxiliary
	 * @generated
	 */
	public Adapter createAuxiliaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Globbox <em>Globbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Globbox
	 * @generated
	 */
	public Adapter createGlobboxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Var
	 * @generated
	 */
	public Adapter createVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Globref <em>Globref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Globref
	 * @generated
	 */
	public Adapter createGlobrefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Ml <em>Ml</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Ml
	 * @generated
	 */
	public Adapter createMlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.AuxText <em>Aux Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.AuxText
	 * @generated
	 */
	public Adapter createAuxTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Trans <em>Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Trans
	 * @generated
	 */
	public Adapter createTransAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Cond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Cond
	 * @generated
	 */
	public Adapter createCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Annot <em>Annot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Annot
	 * @generated
	 */
	public Adapter createAnnotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.AuxEllipse <em>Aux Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.AuxEllipse
	 * @generated
	 */
	public Adapter createAuxEllipseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.AuxBox <em>Aux Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.AuxBox
	 * @generated
	 */
	public Adapter createAuxBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.SimpleColorSet <em>Simple Color Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.SimpleColorSet
	 * @generated
	 */
	public Adapter createSimpleColorSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.CompoundColorSet <em>Compound Color Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.CompoundColorSet
	 * @generated
	 */
	public Adapter createCompoundColorSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.LargeInteger <em>Large Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.LargeInteger
	 * @generated
	 */
	public Adapter createLargeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Enumerated
	 * @generated
	 */
	public Adapter createEnumeratedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Subset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Subset
	 * @generated
	 */
	public Adapter createSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.github.abelgomez.cpntools.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.github.abelgomez.cpntools.Alias
	 * @generated
	 */
	public Adapter createAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CpntoolsAdapterFactory
