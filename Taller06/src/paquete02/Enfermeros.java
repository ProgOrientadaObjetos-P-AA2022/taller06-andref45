package paquete02;

/**
 *
 * @author andreflores
 */
public class Enfermeros {

    private String nom;
    private String tipo;
    private double s_m;

    public Enfermeros(String n, String t, double s) {
        nom = n;
        tipo = t;
        s_m = s;
    }

    public void establecerNombre(String n) {
        nom = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldo(double n) {
        s_m = n;
    }

    public String obtenerNombre() {
        return nom;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldo() {
        return s_m;
    }
}
