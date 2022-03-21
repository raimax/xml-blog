package lt.viko.eif.rcepauskas.blog;

import lt.viko.eif.rcepauskas.blog.Blog;
import lt.viko.eif.rcepauskas.blog.DataService;
import lt.viko.eif.rcepauskas.blog.JaxbTransformer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.File;

class JaxbTransformerTest {

    @Test
    void javaToXml() throws JAXBException {
        Blog blog = DataService.createBlogData();
        JaxbTransformer.pojoToXml("blog.xml", blog);

        Assertions.assertNotNull(blog);
        Assertions.assertTrue(new File("blog.xml").exists());
    }

    @Test
    void xmlToJava() throws JAXBException {
        Blog blog = (Blog)JaxbTransformer.xmlToPojo("blog.xml", Blog.class);

        Assertions.assertNotNull(blog);
        Assertions.assertNotNull(blog.getPosts());
        Assertions.assertNotNull(blog.getUsers());
    }
}