
package ulencriptador;

import java.security.NoSuchAlgorithmException;

public class ULEncriptador {

    public static void main(String[] args) {
        // La aplicacion recibira los siguientes parametros (por linea
        // de comandos):
        // Tipo de Encriptacion: SHA1 o MD5
        // Palabra a encriptar.
        String tipoEncriptacion = args[0];
        String palabraAEncriptar = args[1];
        
        try {
            System.out.println(
                    tipoEncriptacion + ": " + 
                            GestorEncriptador.getInstance().encriptar(
                                    tipoEncriptacion, palabraAEncriptar));
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Error de encriptacion");
        }
        
    }
    
}
