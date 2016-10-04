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
package io.github.abelgomez.cpntools.impl;

import io.github.abelgomez.cpntools.Alias;
import io.github.abelgomez.cpntools.Annot;
import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.AuxBox;
import io.github.abelgomez.cpntools.AuxEllipse;
import io.github.abelgomez.cpntools.AuxText;
import io.github.abelgomez.cpntools.Block;
import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsFactory;
import io.github.abelgomez.cpntools.CpntoolsPackage;
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
import io.github.abelgomez.cpntools.Orientation;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Port;
import io.github.abelgomez.cpntools.Product;
import io.github.abelgomez.cpntools.Real;
import io.github.abelgomez.cpntools.Record;
import io.github.abelgomez.cpntools.Subset;
import io.github.abelgomez.cpntools.Time;
import io.github.abelgomez.cpntools.Trans;
import io.github.abelgomez.cpntools.TransCond;
import io.github.abelgomez.cpntools.TransPriority;
import io.github.abelgomez.cpntools.TransTime;
import io.github.abelgomez.cpntools.Union;
import io.github.abelgomez.cpntools.Unit;
import io.github.abelgomez.cpntools.Var;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpntoolsFactoryImpl extends EFactoryImpl implements CpntoolsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CpntoolsFactory init() {
		try {
			CpntoolsFactory theCpntoolsFactory = (CpntoolsFactory)EPackage.Registry.INSTANCE.getEFactory(CpntoolsPackage.eNS_URI);
			if (theCpntoolsFactory != null) {
				return theCpntoolsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CpntoolsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpntoolsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CpntoolsPackage.CPNET: return createCpnet();
			case CpntoolsPackage.PAGE: return createPage();
			case CpntoolsPackage.GROUP: return createGroup();
			case CpntoolsPackage.PLACE: return createPlace();
			case CpntoolsPackage.INITMARK: return createInitmark();
			case CpntoolsPackage.PORT: return createPort();
			case CpntoolsPackage.FUSION: return createFusion();
			case CpntoolsPackage.GLOBBOX: return createGlobbox();
			case CpntoolsPackage.VAR: return createVar();
			case CpntoolsPackage.GLOBREF: return createGlobref();
			case CpntoolsPackage.ML: return createMl();
			case CpntoolsPackage.BLOCK: return createBlock();
			case CpntoolsPackage.AUX_TEXT: return createAuxText();
			case CpntoolsPackage.ARC: return createArc();
			case CpntoolsPackage.TRANS: return createTrans();
			case CpntoolsPackage.TRANS_COND: return createTransCond();
			case CpntoolsPackage.TRANS_PRIORITY: return createTransPriority();
			case CpntoolsPackage.TRANS_TIME: return createTransTime();
			case CpntoolsPackage.ANNOT: return createAnnot();
			case CpntoolsPackage.AUX_ELLIPSE: return createAuxEllipse();
			case CpntoolsPackage.AUX_BOX: return createAuxBox();
			case CpntoolsPackage.UNIT: return createUnit();
			case CpntoolsPackage.BOOLEAN: return createBoolean();
			case CpntoolsPackage.INTEGER: return createInteger();
			case CpntoolsPackage.LARGE_INTEGER: return createLargeInteger();
			case CpntoolsPackage.REAL: return createReal();
			case CpntoolsPackage.TIME: return createTime();
			case CpntoolsPackage.STRING: return createString();
			case CpntoolsPackage.ENUMERATED: return createEnumerated();
			case CpntoolsPackage.INDEX: return createIndex();
			case CpntoolsPackage.PRODUCT: return createProduct();
			case CpntoolsPackage.RECORD: return createRecord();
			case CpntoolsPackage.LIST: return createList();
			case CpntoolsPackage.UNION: return createUnion();
			case CpntoolsPackage.SUBSET: return createSubset();
			case CpntoolsPackage.ALIAS: return createAlias();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CpntoolsPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CpntoolsPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpnet createCpnet() {
		CpnetImpl cpnet = new CpnetImpl();
		return cpnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initmark createInitmark() {
		InitmarkImpl initmark = new InitmarkImpl();
		return initmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fusion createFusion() {
		FusionImpl fusion = new FusionImpl();
		return fusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Globbox createGlobbox() {
		GlobboxImpl globbox = new GlobboxImpl();
		return globbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var createVar() {
		VarImpl var = new VarImpl();
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Globref createGlobref() {
		GlobrefImpl globref = new GlobrefImpl();
		return globref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ml createMl() {
		MlImpl ml = new MlImpl();
		return ml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxText createAuxText() {
		AuxTextImpl auxText = new AuxTextImpl();
		return auxText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trans createTrans() {
		TransImpl trans = new TransImpl();
		return trans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransCond createTransCond() {
		TransCondImpl transCond = new TransCondImpl();
		return transCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransPriority createTransPriority() {
		TransPriorityImpl transPriority = new TransPriorityImpl();
		return transPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransTime createTransTime() {
		TransTimeImpl transTime = new TransTimeImpl();
		return transTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annot createAnnot() {
		AnnotImpl annot = new AnnotImpl();
		return annot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxEllipse createAuxEllipse() {
		AuxEllipseImpl auxEllipse = new AuxEllipseImpl();
		return auxEllipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxBox createAuxBox() {
		AuxBoxImpl auxBox = new AuxBoxImpl();
		return auxBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public io.github.abelgomez.cpntools.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public io.github.abelgomez.cpntools.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeInteger createLargeInteger() {
		LargeIntegerImpl largeInteger = new LargeIntegerImpl();
		return largeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public io.github.abelgomez.cpntools.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerated createEnumerated() {
		EnumeratedImpl enumerated = new EnumeratedImpl();
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset createSubset() {
		SubsetImpl subset = new SubsetImpl();
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpntoolsPackage getCpntoolsPackage() {
		return (CpntoolsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CpntoolsPackage getPackage() {
		return CpntoolsPackage.eINSTANCE;
	}

} //CpntoolsFactoryImpl
