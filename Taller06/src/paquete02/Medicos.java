package paquete02;

/**
 *
 * @author andreflores
 */
public class Medicos {

    private String nom;
    private String esp;
    private double s_m;

    public Medicos(String n, String e, double s_M) {
        nom = n;
        esp = e;
        s_m = s_M;
    }

    public void establecerNombre(String n) {
        nom = n;
    }

    public void establecerEspecialidad(String n) {
        esp = n;
    }

    public void establecerSueldo(double n) {
        s_m = n;
    }

    public String obtenerNombre() {
        return nom;
    }

    public String obtenerEspecialidad() {
        return esp;
    }

    public double obtenerSueldo() {
        return s_m;
    }
}
