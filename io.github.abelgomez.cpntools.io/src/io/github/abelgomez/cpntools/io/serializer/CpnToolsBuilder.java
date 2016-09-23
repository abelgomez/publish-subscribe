package io.github.abelgomez.cpntools.io.serializer;

import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import io.github.abelgomez.cpntools.Alias;
import io.github.abelgomez.cpntools.Annot;
import io.github.abelgomez.cpntools.Arc;
import io.github.abelgomez.cpntools.Block;
import io.github.abelgomez.cpntools.ColorSet;
import io.github.abelgomez.cpntools.ColorSetElement;
import io.github.abelgomez.cpntools.Cpnet;
import io.github.abelgomez.cpntools.Declaration;
import io.github.abelgomez.cpntools.DiagramElement;
import io.github.abelgomez.cpntools.Enumerated;
import io.github.abelgomez.cpntools.Globbox;
import io.github.abelgomez.cpntools.Initmark;
import io.github.abelgomez.cpntools.Mark;
import io.github.abelgomez.cpntools.Ml;
import io.github.abelgomez.cpntools.Page;
import io.github.abelgomez.cpntools.Place;
import io.github.abelgomez.cpntools.Product;
import io.github.abelgomez.cpntools.SimpleColorSet;
import io.github.abelgomez.cpntools.Trans;
import io.github.abelgomez.cpntools.Unit;

public class CpnToolsBuilder {
	private static final String TOOL_NAME = "CPN Tools";
	private static final String TOOL_VERSION = "4.0.1";
	private static final String TOOL_FORMAT = "6";
	private static final Float TOKEN_POS_Y = new Float(0);
	private static final Float TOKEN_POS_X = new Float(-10);
	private static final Float MARKING_POS_X = new Float(0);
	private static final Float MARKING_POS_Y = new Float(0);
	private static final Float ELLIPSE_WIDTH = new Float(60);
	private static final Float ELLIPSE_HEIGHT = new Float(40);
	private static final Float BOX_WIDTH = new Float(60);
	private static final Float BOX_HEIGHT = new Float(40);
	private static final Float BINDING_POS_X = new Float(7.2);
	private static final Float BINDING_POS_Y = new Float(-3);

	public static void serialize(Cpnet cpnet, OutputStream stream) throws ParserConfigurationException, TransformerException {
		Document document = build(cpnet);
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.ENCODING, "iso-8859-1");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "-//CPN//DTD CPNXML 1.0//EN");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "http://cpntools.org/DTD/6/cpn.dtd");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(new DOMSource(document), new StreamResult(stream));
	}

	public static Document build(Cpnet cpnet, boolean reLayout) throws ParserConfigurationException {
		int width = new Float(cpnet.getPage().getWidth() * 0.9).intValue();
		int height = new Float(cpnet.getPage().getHeight() * 0.9).intValue();
		cpnet.getPage().layout(width, height, 5000);
		return build(cpnet, false);
	}

	public static Document build(Cpnet cpnet) throws ParserConfigurationException {
		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		Element root = document.createElement("workspaceElements");
		document.appendChild(root);
		Element generatorNode = document.createElement("generator");
		generatorNode.setAttribute("tool", TOOL_NAME);
		generatorNode.setAttribute("version", TOOL_VERSION);
		generatorNode.setAttribute("format", TOOL_FORMAT);
		root.appendChild(generatorNode);
		root.appendChild(createCpnet(document, cpnet));
		return document;
	}

	private static Node createCpnet(Document document, Cpnet cpnet) {
		Element element = document.createElement("cpnet");
		if (cpnet.getGlobbox() != null) {
			element.appendChild(createGlobbox(document, cpnet.getGlobbox()));
		}
		if (cpnet.getPage() != null) {
			element.appendChild(createPage(document, cpnet.getPage()));
			Object obj = new Object();
			element.appendChild(createInstances(document, cpnet.getPage(), getModelElementId(obj)));
			element.appendChild(createBinders(document, cpnet.getPage(), getModelElementId(obj)));
		}
		return element;
	}

	private static Node createBinders(Document document, Page page, String instanceId) {
		Element element = document.createElement("binders");
		Element cpnbinder = document.createElement("cpnbinder");
		cpnbinder.setAttribute("id", getModelElementId(cpnbinder));
		cpnbinder.setAttribute("x", String.valueOf(page.getPosx()));
		cpnbinder.setAttribute("y", String.valueOf(page.getPosy()));
		cpnbinder.setAttribute("width", String.valueOf(page.getWidth()));
		cpnbinder.setAttribute("height", String.valueOf(page.getHeight()));
		Element sheets = document.createElement("sheets");
		cpnbinder.appendChild(sheets);
		Element cpnsheet = document.createElement("cpnsheet");
		cpnsheet.setAttribute("id", getModelElementId(cpnsheet));
		cpnsheet.setAttribute("instance", instanceId);
		cpnsheet.setAttribute("zoom", "1.0");
		sheets.appendChild(cpnsheet);
		element.appendChild(cpnbinder);
		return element;
	}

	private static Node createInstances(Document document, Page page, String instanceId) {
		Element element = document.createElement("instances");
		Element instance = document.createElement("instance");
		instance.setAttribute("id", instanceId);
		instance.setAttribute("page", getModelElementId(page));
		element.appendChild(instance);
		return element;
	}

	private static Node createPage(Document document, Page page) {
		Element element = document.createElement("page");
		element.setAttribute("id", getModelElementId(page));
		Element pageattr = document.createElement("pageattr");
		pageattr.setAttribute("name", page.getName());
		element.appendChild(pageattr);
		for (Place place : page.getPlaces()) {
			element.appendChild(createPlace(document, place));
		}
		for (Trans transition : page.getTranss()) {
			element.appendChild(createTransition(document, transition));
		}
		for (Arc arc : page.getArcs()) {
			element.appendChild(createArc(document, arc));
		}
		return element;
	}

	private static Node createArc(Document document, Arc arc) {
		Element element = document.createElement("arc");
		element.setAttribute("id", getModelElementId(arc));
		element.setAttribute("orientation", arc.getOrientation().getLiteral());
		element.setAttribute("order", String.valueOf(arc.getOrder()));
		fillElementAttributesFromDiagramElement(document, element, arc);
		Element arrowattr = document.createElement("arrowattr");
		arrowattr.setAttribute("headsize", String.valueOf(arc.getHeadsize()));
		arrowattr.setAttribute("currentcyckle", arc.getCurrentcyckle());
		element.appendChild(arrowattr);
		Element transend = document.createElement("transend");
		transend.setAttribute("idref", getModelElementId(arc.getTrans()));
		element.appendChild(transend);
		Element placeend = document.createElement("placeend");
		placeend.setAttribute("idref", getModelElementId(arc.getPlace()));
		element.appendChild(placeend);
		element.appendChild(createAnnot(document, arc.getAnnot()));
		return element;
	}

	private static Node createAnnot(Document document, Annot annot) {
		Element element = document.createElement("annot");
		element.setAttribute("id", getModelElementId(element));
		fillElementAttributesFromDiagramElement(document, element, annot);
		Element text = (Element) createText(document, annot.getText());
		text.setAttribute("tool", TOOL_NAME);
		text.setAttribute("version", TOOL_VERSION);
		element.appendChild(text);
		return element;
	}

	private static Node createTransition(Document document, Trans transition) {
		Element element = document.createElement("trans");
		element.setAttribute("id", getModelElementId(transition));
		element.setAttribute("explicit", "false");
		fillElementAttributesFromDiagramElement(document, element, transition);
		element.appendChild(createText(document, transition.getText().replaceAll(" ", "\n")));
		element.appendChild(createBox(document, BOX_WIDTH, BOX_HEIGHT));
		Element binding = document.createElement("binding");
		binding.setAttribute("x", BINDING_POS_X.toString());
		binding.setAttribute("y", BINDING_POS_Y.toString());
		element.appendChild(binding);
		return element;
	}

	private static Node createPlace(Document document, Place place) {
		Element element = document.createElement("place");
		element.setAttribute("id", getModelElementId(place));
		fillElementAttributesFromDiagramElement(document, element, place);
		element.appendChild(createText(document, place.getText()));
		element.appendChild(createEllipse(document, ELLIPSE_WIDTH, ELLIPSE_HEIGHT));
		Element token = document.createElement("token");
		token.setAttribute("x", TOKEN_POS_X.toString());
		token.setAttribute("y", TOKEN_POS_Y.toString());
		element.appendChild(token);
		Element marking = document.createElement("marking");
		marking.setAttribute("x", MARKING_POS_X.toString());
		marking.setAttribute("y", MARKING_POS_Y.toString());
		element.appendChild(marking);
		element.appendChild(createPlaceType(document, place));
		if (place.getInitmark() != null) {
			place.getInitmark().setPosx(place.getPosx() + ELLIPSE_WIDTH.intValue());
			place.getInitmark().setPosy(place.getPosy() + ELLIPSE_HEIGHT.intValue());
			element.appendChild(createInitmark(document, place.getInitmark()));
		}
		return element;
	}

	private static Node createInitmark(Document document, Initmark initmark) {
		Element element = document.createElement("initmark");
		element.setAttribute("id", getModelElementId(initmark));
		fillElementAttributesFromDiagramElement(document, element, initmark);
		String initMarkText = "";
		for (Mark mark : initmark.getMarks()) {
			initMarkText = initMarkText.concat(mark.getValue() + "`" + mark.getColorSetElement().getName() + "++\n");
		}
		initMarkText = initMarkText.substring(0, initMarkText.length() - 3);
		Element text = (Element) createText(document, initMarkText);
		text.setAttribute("tool", TOOL_NAME);
		text.setAttribute("version", TOOL_VERSION);
		element.appendChild(text);
		return element;
	}

	private static Node createPlaceType(Document document, Place place) {
		Element element = document.createElement("type");
		element.setAttribute("id", getModelElementId(element));
		fillElementAttributesFromDiagramElement(document, element, place);
		((Element) element.getElementsByTagName("posattr").item(0)).setAttribute("x", Float.toString(place.getPosx() + (place.getWidth() / 2)));
		((Element) element.getElementsByTagName("posattr").item(0)).setAttribute("y", Float.toString(place.getPosy() - (place.getHeight() / 2)));
		Element text = (Element) createText(document, place.getType().getIdname());
		text.setAttribute("tool", TOOL_NAME);
		text.setAttribute("version", TOOL_VERSION);
		element.appendChild(text);
		return element;
	}

	private static Node createEllipse(Document document, Float width, Float height) {
		Element element = document.createElement("ellipse");
		element.setAttribute("w", width.toString());
		element.setAttribute("h", height.toString());
		return element;
	}

	private static Node createBox(Document document, Float width, Float height) {
		Element element = document.createElement("box");
		element.setAttribute("w", width.toString());
		element.setAttribute("h", height.toString());
		return element;
	}

	private static Node createText(Document document, String text) {
		Element element = document.createElement("text");
		element.setTextContent(text);
		return element;
	}

	private static Node fillElementAttributesFromDiagramElement(Document document, Element element, DiagramElement diagramElement) {
		Element posattr = document.createElement("posattr");
		posattr.setAttribute("x", String.format((Locale) null, "%.6f", new Float(diagramElement.getPosx())));
		posattr.setAttribute("y", String.format((Locale) null, "%.6f", new Float(diagramElement.getPosy())));
		Element fillattr = document.createElement("fillattr");
		fillattr.setAttribute("colour", diagramElement.getFillColour());
		fillattr.setAttribute("pattern", diagramElement.getFillPattern());
		fillattr.setAttribute("filled", String.valueOf(diagramElement.isFillFilled()));
		Element lineattr = document.createElement("lineattr");
		lineattr.setAttribute("colour", diagramElement.getLineColour());
		lineattr.setAttribute("thick", String.valueOf(diagramElement.getLineThick()));
		lineattr.setAttribute("type", diagramElement.getLineType());
		Element textattr = document.createElement("textattr");
		textattr.setAttribute("colour", diagramElement.getLineColour());
		textattr.setAttribute("bold", "false");
		element.appendChild(posattr);
		element.appendChild(fillattr);
		element.appendChild(lineattr);
		element.appendChild(textattr);
		return element;
	}

	private static Node createGlobbox(Document document, Globbox globbox) {
		Element element = document.createElement("globbox");
		for (Declaration declaration : globbox.getDeclarations()) {
			if (declaration instanceof Block) {
				Block block = (Block) declaration;
				element.appendChild(createBlock(document, block));
			}
		}
		return element;
	}

	private static Node createBlock(Document document, Block block) {
		Element element = document.createElement("block");
		element.setAttribute("id", getModelElementId(block));
		element.appendChild(createElementId(document, block.getIdname()));
		for (Declaration declaration : block.getDeclarations()) {
			if (declaration instanceof ColorSet) {
				ColorSet colorSet = (ColorSet) declaration;
				element.appendChild(createColorSet(document, colorSet));
			} else if (declaration instanceof Ml) {
				Ml ml = (Ml) declaration;
				element.appendChild(createMl(document, ml));
			}
		}
		return element;
	}

	private static Node createColorSet(Document document, ColorSet colorSet) {
		Element element = document.createElement("color");
		element.setAttribute("id", getModelElementId(colorSet));
		element.appendChild(createElementId(document, colorSet.getIdname()));
		if (colorSet.isTimed()) {
			element.appendChild(document.createElement("timed"));
		}
		// Simple Color Sets
		if (colorSet instanceof Unit) {
			element.appendChild(document.createElement("unit"));
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Boolean) {
			element.appendChild(document.createElement("bool"));
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Integer) {
			element.appendChild(document.createElement("int"));
		} else if (colorSet instanceof io.github.abelgomez.cpntools.LargeInteger) {
			element.appendChild(document.createElement("intinf"));
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Real) {
			element.appendChild(document.createElement("real"));
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Time) {
			element.appendChild(document.createElement("time"));
		} else if (colorSet instanceof io.github.abelgomez.cpntools.String) {
			element.appendChild(document.createElement("string"));
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Enumerated) {
			Element enumElt = document.createElement("enum");
			for (ColorSetElement colorSetElement : ((Enumerated) colorSet).getColorElements()) {
				enumElt.appendChild(createElementId(document, colorSetElement.getName()));
			}
			element.appendChild(enumElt);
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Index) {
			throw new UnsupportedOperationException();
		}
		// Compound Color Sets
		else if (colorSet instanceof io.github.abelgomez.cpntools.Product) {
			Element productElt = document.createElement("product");
			for (SimpleColorSet simpleColorSet : ((Product) colorSet).getSimpleColors()) {
				productElt.appendChild(createElementId(document, simpleColorSet.getIdname()));
			}
			element.appendChild(productElt);
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Record) {
			throw new UnsupportedOperationException();
		} else if (colorSet instanceof io.github.abelgomez.cpntools.List) {
			throw new UnsupportedOperationException();
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Union) {
			throw new UnsupportedOperationException();
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Subset) {
			throw new UnsupportedOperationException();
		} else if (colorSet instanceof io.github.abelgomez.cpntools.Alias) {
			Element aliasElt = document.createElement("alias");
			SimpleColorSet simpleColorSet = ((Alias) colorSet).getSimpleColors().get(0);
			aliasElt.appendChild(createElementId(document, simpleColorSet.getIdname()));
			element.appendChild(aliasElt);
		}
		return element;
	}

	private static Node createMl(Document document, Ml ml) {
		Element element = document.createElement("ml");
		element.setAttribute("id", getModelElementId(ml));
		element.setTextContent(ml.getExpression());
		return element;
	}

	private static Node createElementId(Document document, String id) {
		Element element = document.createElement("id");
		element.setTextContent(id);
		return element;
	}

	private static Map<Object, String> ids = new WeakHashMap<>();
	private static Random generator = new Random();

	private static String getModelElementId(Object object) {
		String id = ids.get(object);
		if (id == null) {
			do {
				id = String.valueOf(Math.abs(generator.nextInt()));
			} while (ids.containsValue(id));
			ids.put(object, id);
		}
		;
		return "ID" + id;
	}
}