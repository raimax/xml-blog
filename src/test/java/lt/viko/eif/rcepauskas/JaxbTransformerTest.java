package lt.viko.eif.rcepauskas;

import lt.viko.eif.rcepauskas.blog.Blog;
import lt.viko.eif.rcepauskas.blog.JaxbTransformer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;

class JaxbTransformerTest {

    @Test
    void javaToXml() {
    }

    @Test
    void xmlToJava() throws JAXBException {
        Blog blog = (Blog)JaxbTransformer.xmlToJava("blog.xml", Blog.class);

        Assertions.assertNotNull(blog);
    }
}