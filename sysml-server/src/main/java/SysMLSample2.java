import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.ws.rs.WebApplicationException;
import javax.xml.namespace.QName;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFReader;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.oasis.oslcop.sysml.resources.Element;
import org.oasis.oslcop.sysml.resources.Subsetting;

public class SysMLSample2 {

	// Copying from AbstractOslcRdfXmlProvider
	static Object[] readFrom(final Class<?> type, final InputStream inputStream) throws WebApplicationException {
		final Model model = ModelFactory.createDefaultModel();
		RDFReader reader = model.getReader("JSON-LD");
		reader.read(model, inputStream, "");
		return JenaModelHelper.unmarshal(model, type);
	}

	private static void extractElement(InputStream inputStream) throws FileNotFoundException {
		Object[] objs = readFrom(Element.class, inputStream);
		System.out.println("objs.length: " + objs.length);
		
		if (objs.length > 0) {
			Element r = (Element) objs[0];
			System.out.println("element.getIdentifier(): " + r.getIdentifier());
			System.out.println("element.getExtendedProperties().size(): " + r.getExtendedProperties().size());
			for (QName qName : r.getExtendedProperties().keySet()) {
				System.out.println("    Key: " + qName.toString());
			}
		}
	}

	private static void extractSubsetting(InputStream inputStream) throws FileNotFoundException {
		Object[] objs = readFrom(Subsetting.class, inputStream);
		System.out.println("objs.length: " + objs.length);
		
		if (objs.length > 0) {
			Subsetting r = (Subsetting) objs[0];
			System.out.println("subsetting.getIdentifier(): " + r.getIdentifier());
			System.out.println("subsetting.getExtendedProperties().size(): " + r.getExtendedProperties().size());
			for (QName qName : r.getExtendedProperties().keySet()) {
				System.out.println("    Key: " + qName.toString());
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		String path = "C:\\Users\\jad\\git\\sysml-oslc-server\\sysml-server\\src\\main\\resources\\";

		System.out.println("JMH will not detect any objects, because the rdfType does not match the annotations on Element");
		extractElement(new FileInputStream(new File(path + "originalElement.json")));
		System.out.println();
		
		System.out.println("We can bypass that by enabling useBeanClassForParsing. JMH will now detect an Element object. But no properties are detected. Why? annotations on the properties do not match the input");
		OSLC4JUtils.setUseBeanClassForParsing("true");
		extractElement(new FileInputStream(new File(path + "originalElement.json")));
		System.out.println();

		System.out.println("JMH will detect an Element object, since we enabled useBeanClassForParsing. We can also detect identifier since I change the input to be the expected http://purl.org/dc/terms/identifier");
		extractElement(new FileInputStream(new File(path + "improvedElement.json")));
		System.out.println();

		System.out.println("JMH will detect an Subsetting object, if we make the rdfType match the annotations on Element. ");
		OSLC4JUtils.setUseBeanClassForParsing("false");
		extractSubsetting(new FileInputStream(new File(path + "originalElement.json")));
		System.out.println();

		System.out.println("JMH will detect an Subsetting object, if we make the rdfType match the annotations on Element. And now of course, identifier is detected too");
		extractSubsetting(new FileInputStream(new File(path + "improvedElement.json")));
		System.out.println();

		System.out.println("But if we don't want to create all these subclasses, best of all of course if the input has Element as an rdftype. Plus, we need the correct annotation on Identifier");
		extractElement(new FileInputStream(new File(path + "moreImprovedElement.json")));
		System.out.println();

	}

}
