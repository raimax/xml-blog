package lt.viko.eif.rcepauskas.blog;

import org.xmlunit.validation.Languages;
import org.xmlunit.validation.ValidationResult;
import org.xmlunit.validation.Validator;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * A class for validating xml files
 */
public abstract class SchemaValidator {

    /**
     * Validates xml file against xsd
     * @param xmlFilePath path to xml file
     * @param xsdFilePath path to xsd file
     * @return {@link true} if code is valid, {@link false} otherwise
     */
    public static boolean isXmlValid(String xmlFilePath, String xsdFilePath) throws FileNotFoundException {
        if (!new File(xmlFilePath).exists()) {
            System.out.println("Xml file doesn't exist");
            throw new FileNotFoundException("");
        }
        if (!new File(xsdFilePath).exists()) {
            System.out.println("Xsd file doesn't exist");
            throw new FileNotFoundException("");
        }
        Validator validator = Validator.forLanguage(Languages.W3C_XML_SCHEMA_NS_URI);
        validator.setSchemaSource(new StreamSource(xsdFilePath));
        ValidationResult validationResult = validator.validateInstance(new StreamSource(new File(xmlFilePath)));
        return validationResult.isValid();
    }
}
