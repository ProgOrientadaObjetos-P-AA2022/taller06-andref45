package paquete02;

/**
 *
 * @author andreflores
 */
public class Sueldos {

    private double s;
    private Medicos m;
    private Enfermeros enf;

    public Sueldos(double n, Medicos me, Enfermeros e) {
        s = n;
        m = me;
        enf = e;
    }

    public void establecerSueldo(double n) {
        s = n;
    }

    public void establecerMedico(Medicos n) {
        m = n;
    }

    public void establecerEnf(Enfermeros n) {
        enf = n;
    }

    public double obtenerSueldo() {
        return s;
    }

    public Medicos obtenerMedicos() {
        return m;
    }

    public Enfermeros obtenerEnf() {
        return enf;
    }
}
