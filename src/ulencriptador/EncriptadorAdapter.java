
package ulencriptador;

import java.security.NoSuchAlgorithmException;

public interface EncriptadorAdapter {
    public String encriptar(String cadena) throws NoSuchAlgorithmException;
}
