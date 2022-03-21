package lt.viko.eif.rcepauskas.blog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Transforms java object to xml and vise versa
 */
public class JaxbTransformer {

    private static JAXBContext jaxbContext;

    /**
     * Transforms java object to xml
     * @param fileName xml output file name
     * @param object object to convert from
     * @throws JAXBException
     */
    public static void pojoToXml(String fileName, Object object) throws JAXBException {
        jaxbContext = JAXBContext.newInstance(object.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(object, new File(fileName));
    }

    /**
     * Transforms xml to java object
     * @param filePath path to xml file
     * @param tClass class to convert to
     * @param <T> any type
     * @return specified tClass object with data
     * @throws JAXBException
     */
    public static <T> Object xmlToPojo(String filePath, Class<T> tClass) throws JAXBException {
        jaxbContext = JAXBContext.newInstance(tClass);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return jaxbUnmarshaller.unmarshal(new File(filePath));
    }
}
