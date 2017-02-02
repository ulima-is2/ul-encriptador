
package ulencriptador;

import java.security.NoSuchAlgorithmException;

public class GestorEncriptador {
    private static GestorEncriptador instancia = null;
    
    public static GestorEncriptador getInstance(){
        if (instancia == null){
            instancia = new GestorEncriptador();
        }
        return instancia;
    }
    
    private GestorEncriptador() {}
    
    public String encriptar(String tipo, String cadena) 
            throws NoSuchAlgorithmException{
        EncriptadorAdapter adapter = 
                EncriptadorFactory.getInstance().obtenerAdapter(tipo);
        return adapter.encriptar(cadena);
    }
}
