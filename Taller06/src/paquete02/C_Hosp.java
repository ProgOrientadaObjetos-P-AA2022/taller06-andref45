package paquete02;

/**
 *
 * @author andreflores
 */
public class C_Hosp {

    private String nom_c;
    private String prov;
    
    public C_Hosp(String n, String p) {
        nom_c = n;
        prov = p;
    }

    public void establecerNombre(String n) {
        nom_c = n;
    }

    public void establecerProv(String n) {
        prov = n;
    }

    public String obtenerNombre() {
        return nom_c;
    }

    public String obtenerProv() {
        return prov;
    }
}
