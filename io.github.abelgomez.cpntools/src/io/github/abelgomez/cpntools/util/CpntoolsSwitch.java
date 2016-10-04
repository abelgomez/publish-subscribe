/*******************************************************************************
 * Copyright (c) 2016 Abel Gómez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Abel Gómez (agomezlla@uoc.edu) - initial API and implementation
 *******************************************************************************/
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
import io.github.abelgomez.cpntools.TransCond;
import io.github.abelgomez.cpntools.TransPriority;
import io.github.abelgomez.cpntools.TransTime;
import io.github.abelgomez.cpntools.Union;
import io.github.abelgomez.cpntools.Unit;
import io.github.abelgomez.cpntools.Var;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.cpntools.CpntoolsPackage
 * @generated
 */
public class CpntoolsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CpntoolsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpntoolsSwitch() {
		if (modelPackage == null) {
			modelPackage = CpntoolsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CpntoolsPackage.CPNET: {
				Cpnet cpnet = (Cpnet)theEObject;
				T result = caseCpnet(cpnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseDiagramElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.COLOR_SET: {
				ColorSet colorSet = (ColorSet)theEObject;
				T result = caseColorSet(colorSet);
				if (result == null) result = caseDeclaration(colorSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.INITMARK: {
				Initmark initmark = (Initmark)theEObject;
				T result = caseInitmark(initmark);
				if (result == null) result = caseDiagramElement(initmark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseDiagramElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.FUSION: {
				Fusion fusion = (Fusion)theEObject;
				T result = caseFusion(fusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.AUXILIARY: {
				Auxiliary auxiliary = (Auxiliary)theEObject;
				T result = caseAuxiliary(auxiliary);
				if (result == null) result = caseDiagramElement(auxiliary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.GLOBBOX: {
				Globbox globbox = (Globbox)theEObject;
				T result = caseGlobbox(globbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.VAR: {
				Var var = (Var)theEObject;
				T result = caseVar(var);
				if (result == null) result = caseDeclaration(var);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.GLOBREF: {
				Globref globref = (Globref)theEObject;
				T result = caseGlobref(globref);
				if (result == null) result = caseDeclaration(globref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.ML: {
				Ml ml = (Ml)theEObject;
				T result = caseMl(ml);
				if (result == null) result = caseDeclaration(ml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseDeclaration(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.AUX_TEXT: {
				AuxText auxText = (AuxText)theEObject;
				T result = caseAuxText(auxText);
				if (result == null) result = caseAuxiliary(auxText);
				if (result == null) result = caseDiagramElement(auxText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = caseDiagramElement(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.TRANS: {
				Trans trans = (Trans)theEObject;
				T result = caseTrans(trans);
				if (result == null) result = caseDiagramElement(trans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.TRANS_COND: {
				TransCond transCond = (TransCond)theEObject;
				T result = caseTransCond(transCond);
				if (result == null) result = caseDiagramElement(transCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.TRANS_PRIORITY: {
				TransPriority transPriority = (TransPriority)theEObject;
				T result = caseTransPriority(transPriority);
				if (result == null) result = caseDiagramElement(transPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.TRANS_TIME: {
				TransTime transTime = (TransTime)theEObject;
				T result = caseTransTime(transTime);
				if (result == null) result = caseDiagramElement(transTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.ANNOT: {
				Annot annot = (Annot)theEObject;
				T result = caseAnnot(annot);
				if (result == null) result = caseDiagramElement(annot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.AUX_ELLIPSE: {
				AuxEllipse auxEllipse = (AuxEllipse)theEObject;
				T result = caseAuxEllipse(auxEllipse);
				if (result == null) result = caseAuxiliary(auxEllipse);
				if (result == null) result = caseDiagramElement(auxEllipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.AUX_BOX: {
				AuxBox auxBox = (AuxBox)theEObject;
				T result = caseAuxBox(auxBox);
				if (result == null) result = caseAuxiliary(auxBox);
				if (result == null) result = caseDiagramElement(auxBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.SIMPLE_COLOR_SET: {
				SimpleColorSet simpleColorSet = (SimpleColorSet)theEObject;
				T result = caseSimpleColorSet(simpleColorSet);
				if (result == null) result = caseColorSet(simpleColorSet);
				if (result == null) result = caseDeclaration(simpleColorSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.COMPOUND_COLOR_SET: {
				CompoundColorSet compoundColorSet = (CompoundColorSet)theEObject;
				T result = caseCompoundColorSet(compoundColorSet);
				if (result == null) result = caseColorSet(compoundColorSet);
				if (result == null) result = caseDeclaration(compoundColorSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseSimpleColorSet(unit);
				if (result == null) result = caseColorSet(unit);
				if (result == null) result = caseDeclaration(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.BOOLEAN: {
				io.github.abelgomez.cpntools.Boolean boolean_ = (io.github.abelgomez.cpntools.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseSimpleColorSet(boolean_);
				if (result == null) result = caseColorSet(boolean_);
				if (result == null) result = caseDeclaration(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.INTEGER: {
				io.github.abelgomez.cpntools.Integer integer = (io.github.abelgomez.cpntools.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseSimpleColorSet(integer);
				if (result == null) result = caseColorSet(integer);
				if (result == null) result = caseDeclaration(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.LARGE_INTEGER: {
				LargeInteger largeInteger = (LargeInteger)theEObject;
				T result = caseLargeInteger(largeInteger);
				if (result == null) result = caseSimpleColorSet(largeInteger);
				if (result == null) result = caseColorSet(largeInteger);
				if (result == null) result = caseDeclaration(largeInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseSimpleColorSet(real);
				if (result == null) result = caseColorSet(real);
				if (result == null) result = caseDeclaration(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseSimpleColorSet(time);
				if (result == null) result = caseColorSet(time);
				if (result == null) result = caseDeclaration(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.STRING: {
				io.github.abelgomez.cpntools.String string = (io.github.abelgomez.cpntools.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseSimpleColorSet(string);
				if (result == null) result = caseColorSet(string);
				if (result == null) result = caseDeclaration(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.ENUMERATED: {
				Enumerated enumerated = (Enumerated)theEObject;
				T result = caseEnumerated(enumerated);
				if (result == null) result = caseSimpleColorSet(enumerated);
				if (result == null) result = caseColorSet(enumerated);
				if (result == null) result = caseDeclaration(enumerated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = caseSimpleColorSet(index);
				if (result == null) result = caseColorSet(index);
				if (result == null) result = caseDeclaration(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseCompoundColorSet(product);
				if (result == null) result = caseColorSet(product);
				if (result == null) result = caseDeclaration(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.RECORD: {
				Record record = (Record)theEObject;
				T result = caseRecord(record);
				if (result == null) result = caseCompoundColorSet(record);
				if (result == null) result = caseColorSet(record);
				if (result == null) result = caseDeclaration(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseCompoundColorSet(list);
				if (result == null) result = caseColorSet(list);
				if (result == null) result = caseDeclaration(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = caseCompoundColorSet(union);
				if (result == null) result = caseColorSet(union);
				if (result == null) result = caseDeclaration(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.SUBSET: {
				Subset subset = (Subset)theEObject;
				T result = caseSubset(subset);
				if (result == null) result = caseCompoundColorSet(subset);
				if (result == null) result = caseColorSet(subset);
				if (result == null) result = caseDeclaration(subset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CpntoolsPackage.ALIAS: {
				Alias alias = (Alias)theEObject;
				T result = caseAlias(alias);
				if (result == null) result = caseCompoundColorSet(alias);
				if (result == null) result = caseColorSet(alias);
				if (result == null) result = caseDeclaration(alias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpnet(Cpnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorSet(ColorSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initmark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initmark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitmark(Initmark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFusion(Fusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliary(Auxiliary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Globbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Globbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobbox(Globbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar(Var object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Globref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Globref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobref(Globref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ml</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ml</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMl(Ml object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aux Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aux Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxText(AuxText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrans(Trans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransCond(TransCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransPriority(TransPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransTime(TransTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnot(Annot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aux Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aux Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxEllipse(AuxEllipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aux Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aux Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxBox(AuxBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Color Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Color Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleColorSet(SimpleColorSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Color Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Color Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundColorSet(CompoundColorSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(io.github.abelgomez.cpntools.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(io.github.abelgomez.cpntools.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeInteger(LargeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(io.github.abelgomez.cpntools.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerated(Enumerated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubset(Subset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlias(Alias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CpntoolsSwitch
