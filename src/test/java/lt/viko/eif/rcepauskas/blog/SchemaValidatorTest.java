package lt.viko.eif.rcepauskas.blog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class SchemaValidatorTest {

    @Test
    void isXmlValid() throws FileNotFoundException {
        boolean isValid = SchemaValidator.isXmlValid(
                "src\\test\\resources\\blog.xml",
                "src\\test\\resources\\blog.xsd");
        Assertions.assertTrue(isValid);
    }
}