package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) {
        try {
            Blog blog = DataService.createBlogData();

            JaxbTransformer.javaToXml("blog.xml", blog);
            Blog blogFromXml = (Blog)JaxbTransformer.xmlToJava("blog.xml", Blog.class);

            System.out.println(blogFromXml);
        }
        catch (JAXBException ex) {
            System.out.println("Transformation error: " + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
