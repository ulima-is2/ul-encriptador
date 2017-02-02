
package ulencriptador;

public class EncriptadorFactory {
    private static EncriptadorFactory instancia = null;
    
    public static EncriptadorFactory getInstance(){
        if (instancia == null){
            instancia = new EncriptadorFactory();
        }
        return instancia;
    }
    
    private EncriptadorFactory() {}
    
    public EncriptadorAdapter obtenerAdapter(String tipo){
        if (tipo.equals("sha1")){
            return new SHA1Adapter();
        }else if (tipo.equals("md5")){
            return new MD5Adapter();
        }else{
            return null;
        }
    }
}
