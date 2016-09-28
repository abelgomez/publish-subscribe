/**
 */
package io.github.abelgomez.cpntools.impl;

import java.awt.Dimension;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.Pair;
import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.Auxiliary;
import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.CpntoolsPackage;
import io.github.abelgomez.cpntools.DiagramElement;
import io.github.abelgomez.cpntools.Group;
import io.github.abelgomez.cpntools.Orientation;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Trans;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getAuxiliarys <em>Auxiliarys</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getCpnet <em>Cpnet</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getTranss <em>Transs</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getPosx <em>Posx</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getPosy <em>Posy</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.impl.PageImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * The cached value of the '{@link #getAuxiliarys() <em>Auxiliarys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliarys()
	 * @generated
	 * @ordered
	 */
	protected EList<Auxiliary> auxiliarys;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTranss() <em>Transs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranss()
	 * @generated
	 * @ordered
	 */
	protected EList<Trans> transs;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcs;

	/**
	 * The default value of the '{@link #getPosx() <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosx()
	 * @generated
	 * @ordered
	 */
	protected static final int POSX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosx() <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosx()
	 * @generated
	 * @ordered
	 */
	protected int posx = POSX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosy() <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosy()
	 * @generated
	 * @ordered
	 */
	protected static final int POSY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosy() <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosy()
	 * @generated
	 * @ordered
	 */
	protected int posy = POSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpntoolsPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentWithInverseEList<Group>(Group.class, this, CpntoolsPackage.PAGE__GROUP, CpntoolsPackage.GROUP__PAGE);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentWithInverseEList<Place>(Place.class, this, CpntoolsPackage.PAGE__PLACES, CpntoolsPackage.PLACE__PAGE);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auxiliary> getAuxiliarys() {
		if (auxiliarys == null) {
			auxiliarys = new EObjectContainmentWithInverseEList<Auxiliary>(Auxiliary.class, this, CpntoolsPackage.PAGE__AUXILIARYS, CpntoolsPackage.AUXILIARY__PAGE);
		}
		return auxiliarys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpnet getCpnet() {
		if (eContainerFeatureID() != CpntoolsPackage.PAGE__CPNET) return null;
		return (Cpnet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpnet(Cpnet newCpnet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCpnet, CpntoolsPackage.PAGE__CPNET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpnet(Cpnet newCpnet) {
		if (newCpnet != eInternalContainer() || (eContainerFeatureID() != CpntoolsPackage.PAGE__CPNET && newCpnet != null)) {
			if (EcoreUtil.isAncestor(this, newCpnet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCpnet != null)
				msgs = ((InternalEObject)newCpnet).eInverseAdd(this, CpntoolsPackage.CPNET__PAGE, Cpnet.class, msgs);
			msgs = basicSetCpnet(newCpnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PAGE__CPNET, newCpnet, newCpnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trans> getTranss() {
		if (transs == null) {
			transs = new EObjectContainmentWithInverseEList<Trans>(Trans.class, this, CpntoolsPackage.PAGE__TRANSS, CpntoolsPackage.TRANS__PAGE);
		}
		return transs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentWithInverseEList<Arc>(Arc.class, this, CpntoolsPackage.PAGE__ARCS, CpntoolsPackage.ARC__PAGE);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosx() {
		return posx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosx(int newPosx) {
		int oldPosx = posx;
		posx = newPosx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PAGE__POSX, oldPosx, posx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosy() {
		return posy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosy(int newPosy) {
		int oldPosy = posy;
		posy = newPosy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PAGE__POSY, oldPosy, posy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpntoolsPackage.PAGE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void layout(final Integer width, final Integer height, final Integer steps) {
		DirectedSparseGraph<DiagramElement, Arc> graph = new DirectedSparseGraph<DiagramElement, Arc>();
		
		for (Arc arc : this.getArcs()) {
			graph.addVertex(arc.getPlace());
			graph.addVertex(arc.getTrans());
		
			Pair<DiagramElement> pair = null;
			if (arc.getOrientation() == Orientation.PTO_T) {
				pair = new Pair<DiagramElement>(arc.getPlace(), arc.getTrans());
			} else {
				pair = new Pair<DiagramElement>(arc.getTrans(), arc.getPlace());
			}
			graph.addEdge(arc, pair);
		}
		
		FRLayout<DiagramElement, Arc> layout = new FRLayout<DiagramElement, Arc>(
				graph, new Dimension(width, height));
		layout.initialize();
		
		layout.setMaxIterations(steps);
		
		while (!layout.done()) {
			layout.step();
		}
		
		for (DiagramElement element : graph.getVertices()) {
			int x = (int) layout.getX(element) - (width / 2);
			int y = (int) layout.getY(element) - (height / 2);
		
			element.setPosx(x);
			element.setPosy(y);
			
			if (element instanceof Trans) {
				Trans trans = (Trans) element;
				if (trans.getCond() != null) {
					trans.getCond().setPosx(x - 40);
					trans.getCond().setPosy(y + 30);
				}
				if (trans.getPriority() != null) {
					trans.getPriority().setPosx(x - 40);
					trans.getPriority().setPosy(y - 30);
				}
				if (trans.getTime() != null) {
					trans.getTime().setPosx(x + 40);
					trans.getTime().setPosy(y - 30);
				}
			}
		}
		
		for (Arc arc : graph.getEdges()) {
			DiagramElement source = graph.getSource(arc);
			DiagramElement target = graph.getDest(arc);
		
			int sourceX = (int) layout.getX(source) - (width / 2);
			int sourceY = (int) layout.getY(source) - (height / 2);
			int targetX = (int) layout.getX(target) - (width / 2);
			int targetY = (int) layout.getY(target) - (height / 2);
		
			if (arc.getAnnot() != null) {
				double pos = ThreadLocalRandom.current().nextDouble(0.35, 0.65); 
				arc.getAnnot().setPosx(sourceX + (int) ((targetX - sourceX) * pos));
				arc.getAnnot().setPosy(sourceY + (int) ((targetY - sourceY) * pos));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void layout() {
		int width = new Float(getWidth() * 0.9).intValue();
		int height = new Float(getHeight() * 0.9).intValue();
		layout(width, height, 5000);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.PAGE__GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup()).basicAdd(otherEnd, msgs);
			case CpntoolsPackage.PAGE__PLACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlaces()).basicAdd(otherEnd, msgs);
			case CpntoolsPackage.PAGE__AUXILIARYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliarys()).basicAdd(otherEnd, msgs);
			case CpntoolsPackage.PAGE__CPNET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCpnet((Cpnet)otherEnd, msgs);
			case CpntoolsPackage.PAGE__TRANSS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTranss()).basicAdd(otherEnd, msgs);
			case CpntoolsPackage.PAGE__ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArcs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpntoolsPackage.PAGE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.PAGE__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.PAGE__AUXILIARYS:
				return ((InternalEList<?>)getAuxiliarys()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.PAGE__CPNET:
				return basicSetCpnet(null, msgs);
			case CpntoolsPackage.PAGE__TRANSS:
				return ((InternalEList<?>)getTranss()).basicRemove(otherEnd, msgs);
			case CpntoolsPackage.PAGE__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CpntoolsPackage.PAGE__CPNET:
				return eInternalContainer().eInverseRemove(this, CpntoolsPackage.CPNET__PAGE, Cpnet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpntoolsPackage.PAGE__GROUP:
				return getGroup();
			case CpntoolsPackage.PAGE__PLACES:
				return getPlaces();
			case CpntoolsPackage.PAGE__AUXILIARYS:
				return getAuxiliarys();
			case CpntoolsPackage.PAGE__NAME:
				return getName();
			case CpntoolsPackage.PAGE__CPNET:
				return getCpnet();
			case CpntoolsPackage.PAGE__TRANSS:
				return getTranss();
			case CpntoolsPackage.PAGE__ARCS:
				return getArcs();
			case CpntoolsPackage.PAGE__POSX:
				return getPosx();
			case CpntoolsPackage.PAGE__POSY:
				return getPosy();
			case CpntoolsPackage.PAGE__WIDTH:
				return getWidth();
			case CpntoolsPackage.PAGE__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CpntoolsPackage.PAGE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case CpntoolsPackage.PAGE__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case CpntoolsPackage.PAGE__AUXILIARYS:
				getAuxiliarys().clear();
				getAuxiliarys().addAll((Collection<? extends Auxiliary>)newValue);
				return;
			case CpntoolsPackage.PAGE__NAME:
				setName((String)newValue);
				return;
			case CpntoolsPackage.PAGE__CPNET:
				setCpnet((Cpnet)newValue);
				return;
			case CpntoolsPackage.PAGE__TRANSS:
				getTranss().clear();
				getTranss().addAll((Collection<? extends Trans>)newValue);
				return;
			case CpntoolsPackage.PAGE__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case CpntoolsPackage.PAGE__POSX:
				setPosx((Integer)newValue);
				return;
			case CpntoolsPackage.PAGE__POSY:
				setPosy((Integer)newValue);
				return;
			case CpntoolsPackage.PAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CpntoolsPackage.PAGE__HEIGHT:
				setHeight((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CpntoolsPackage.PAGE__GROUP:
				getGroup().clear();
				return;
			case CpntoolsPackage.PAGE__PLACES:
				getPlaces().clear();
				return;
			case CpntoolsPackage.PAGE__AUXILIARYS:
				getAuxiliarys().clear();
				return;
			case CpntoolsPackage.PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CpntoolsPackage.PAGE__CPNET:
				setCpnet((Cpnet)null);
				return;
			case CpntoolsPackage.PAGE__TRANSS:
				getTranss().clear();
				return;
			case CpntoolsPackage.PAGE__ARCS:
				getArcs().clear();
				return;
			case CpntoolsPackage.PAGE__POSX:
				setPosx(POSX_EDEFAULT);
				return;
			case CpntoolsPackage.PAGE__POSY:
				setPosy(POSY_EDEFAULT);
				return;
			case CpntoolsPackage.PAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CpntoolsPackage.PAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CpntoolsPackage.PAGE__GROUP:
				return group != null && !group.isEmpty();
			case CpntoolsPackage.PAGE__PLACES:
				return places != null && !places.isEmpty();
			case CpntoolsPackage.PAGE__AUXILIARYS:
				return auxiliarys != null && !auxiliarys.isEmpty();
			case CpntoolsPackage.PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CpntoolsPackage.PAGE__CPNET:
				return getCpnet() != null;
			case CpntoolsPackage.PAGE__TRANSS:
				return transs != null && !transs.isEmpty();
			case CpntoolsPackage.PAGE__ARCS:
				return arcs != null && !arcs.isEmpty();
			case CpntoolsPackage.PAGE__POSX:
				return posx != POSX_EDEFAULT;
			case CpntoolsPackage.PAGE__POSY:
				return posy != POSY_EDEFAULT;
			case CpntoolsPackage.PAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CpntoolsPackage.PAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CpntoolsPackage.PAGE___LAYOUT__INTEGER_INTEGER_INTEGER:
				layout((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case CpntoolsPackage.PAGE___LAYOUT:
				layout();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", posx: ");
		result.append(posx);
		result.append(", posy: ");
		result.append(posy);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //PageImpl
