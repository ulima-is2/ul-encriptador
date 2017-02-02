
package ulencriptador;

import com.jsatch.MD5Encoding;
import java.security.NoSuchAlgorithmException;

public class MD5Adapter implements EncriptadorAdapter{

    @Override
    public String encriptar(String cadena) throws NoSuchAlgorithmException {
        MD5Encoding encoder = new MD5Encoding();
        return encoder.encode(cadena);
    }
    
}
