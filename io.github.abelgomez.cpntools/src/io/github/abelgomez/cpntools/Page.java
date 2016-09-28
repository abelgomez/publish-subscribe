/**
 */
package io.github.abelgomez.cpntools;

import java.lang.Integer;
import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getGroup <em>Group</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getPlaces <em>Places</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getAuxiliarys <em>Auxiliarys</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getCpnet <em>Cpnet</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getTranss <em>Transs</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getArcs <em>Arcs</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getPosx <em>Posx</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getPosy <em>Posy</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getWidth <em>Width</em>}</li>
 *   <li>{@link io.github.abelgomez.cpntools.Page#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Group}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Group#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Group()
	 * @see io.github.abelgomez.cpntools.Group#getPage
	 * @model opposite="page" containment="true" ordered="false"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Place}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Place#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Places()
	 * @see io.github.abelgomez.cpntools.Place#getPage
	 * @model opposite="page" containment="true" ordered="false"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Auxiliarys</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Auxiliary}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Auxiliary#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliarys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliarys</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Auxiliarys()
	 * @see io.github.abelgomez.cpntools.Auxiliary#getPage
	 * @model opposite="page" containment="true" ordered="false"
	 * @generated
	 */
	EList<Auxiliary> getAuxiliarys();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cpnet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Cpnet#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpnet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpnet</em>' container reference.
	 * @see #setCpnet(Cpnet)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Cpnet()
	 * @see io.github.abelgomez.cpntools.Cpnet#getPage
	 * @model opposite="page" transient="false"
	 * @generated
	 */
	Cpnet getCpnet();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getCpnet <em>Cpnet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpnet</em>' container reference.
	 * @see #getCpnet()
	 * @generated
	 */
	void setCpnet(Cpnet value);

	/**
	 * Returns the value of the '<em><b>Transs</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Trans}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Trans#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transs</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Transs()
	 * @see io.github.abelgomez.cpntools.Trans#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<Trans> getTranss();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.cpntools.Arc}.
	 * It is bidirectional and its opposite is '{@link io.github.abelgomez.cpntools.Arc#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Arcs()
	 * @see io.github.abelgomez.cpntools.Arc#getPage
	 * @model opposite="page" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Posx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posx</em>' attribute.
	 * @see #setPosx(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Posx()
	 * @model
	 * @generated
	 */
	int getPosx();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getPosx <em>Posx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posx</em>' attribute.
	 * @see #getPosx()
	 * @generated
	 */
	void setPosx(int value);

	/**
	 * Returns the value of the '<em><b>Posy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posy</em>' attribute.
	 * @see #setPosy(int)
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Posy()
	 * @model
	 * @generated
	 */
	int getPosy();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getPosy <em>Posy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posy</em>' attribute.
	 * @see #getPosy()
	 * @generated
	 */
	void setPosy(int value);

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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

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
	 * @see io.github.abelgomez.cpntools.CpntoolsPackage#getPage_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.cpntools.Page#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='DirectedSparseGraph<DiagramElement, Arc> graph = new DirectedSparseGraph<DiagramElement, Arc>();\r\n\r\nfor (Arc arc : this.getArcs()) {\r\n\tgraph.addVertex(arc.getPlace());\r\n\tgraph.addVertex(arc.getTrans());\r\n\r\n\tPair<DiagramElement> pair = null;\r\n\tif (arc.getOrientation() == Orientation.PTO_T) {\r\n\t\tpair = new Pair<DiagramElement>(arc.getPlace(), arc.getTrans());\r\n\t} else {\r\n\t\tpair = new Pair<DiagramElement>(arc.getTrans(), arc.getPlace());\r\n\t}\r\n\tgraph.addEdge(arc, pair);\r\n}\r\n\r\nFRLayout<DiagramElement, Arc> layout = new FRLayout<DiagramElement, Arc>(\r\n\t\tgraph, new Dimension(width, height));\r\nlayout.initialize();\r\n\r\nlayout.setMaxIterations(steps);\r\n\r\nwhile (!layout.done()) {\r\n\tlayout.step();\r\n}\r\n\r\nfor (DiagramElement element : graph.getVertices()) {\r\n\tint x = (int) layout.getX(element) - (width / 2);\r\n\tint y = (int) layout.getY(element) - (height / 2);\r\n\r\n\telement.setPosx(x);\r\n\telement.setPosy(y);\r\n\t\r\n\tif (element instanceof Trans) {\r\n\t\tTrans trans = (Trans) element;\r\n\t\tif (trans.getCond() != null) {\r\n\t\t\ttrans.getCond().setPosx(x - 40);\r\n\t\t\ttrans.getCond().setPosy(y + 30);\r\n\t\t}\r\n\t\tif (trans.getPriority() != null) {\r\n\t\t\ttrans.getPriority().setPosx(x - 40);\r\n\t\t\ttrans.getPriority().setPosy(y - 30);\r\n\t\t}\r\n\t\tif (trans.getTime() != null) {\r\n\t\t\ttrans.getTime().setPosx(x + 40);\r\n\t\t\ttrans.getTime().setPosy(y - 30);\r\n\t\t}\r\n\t}\r\n}\r\n\r\nfor (Arc arc : graph.getEdges()) {\r\n\tDiagramElement source = graph.getSource(arc);\r\n\tDiagramElement target = graph.getDest(arc);\r\n\r\n\tint sourceX = (int) layout.getX(source) - (width / 2);\r\n\tint sourceY = (int) layout.getY(source) - (height / 2);\r\n\tint targetX = (int) layout.getX(target) - (width / 2);\r\n\tint targetY = (int) layout.getY(target) - (height / 2);\r\n\r\n\tif (arc.getAnnot() != null) {\r\n\t\tdouble pos = ThreadLocalRandom.current().nextDouble(0.35, 0.65); \r\n\t\tarc.getAnnot().setPosx(sourceX + (int) ((targetX - sourceX) * pos));\r\n\t\tarc.getAnnot().setPosy(sourceY + (int) ((targetY - sourceY) * pos));\r\n\t}\r\n}'"
	 * @generated
	 */
	void layout(Integer width, Integer height, Integer steps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int width = new Float(getWidth() * 0.9).intValue();\r\nint height = new Float(getHeight() * 0.9).intValue();\r\nlayout(width, height, 5000);'"
	 * @generated
	 */
	void layout();

} // Page
