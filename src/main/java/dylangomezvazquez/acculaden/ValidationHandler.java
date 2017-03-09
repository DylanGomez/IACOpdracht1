package dylangomezvazquez.acculaden;

/**
 * Created by dylan on 7-3-2017.
 */
import com.sun.xml.ws.developer.ValidationErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ValidationHandler extends ValidationErrorHandler{

        @Override
        public void warning(SAXParseException exception) throws SAXException {
            packet.invocationProperties.put("error", exception);
        }

        @Override
        public void error(SAXParseException exception) throws SAXException {
            throw exception;
        }

        @Override
        public void fatalError(SAXParseException exception) throws SAXException {

        }
}
