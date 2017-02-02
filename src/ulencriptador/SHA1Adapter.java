
package ulencriptador;

import java.security.NoSuchAlgorithmException;
import sha1encoding.SHA1Encoding;

public class SHA1Adapter implements EncriptadorAdapter{

    @Override
    public String encriptar(String cadena)  throws NoSuchAlgorithmException{
        SHA1Encoding encoding = new SHA1Encoding();
        return encoding.encode(cadena);
    }
    
}
