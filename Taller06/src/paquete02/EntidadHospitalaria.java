package paquete02;

/**
 *
 * @author andreflores
 */
public class EntidadHospitalaria {

    private String n_hosp;
    private C_Hosp c_hosp;
    private int n_esp;
    private Sueldos[] sueldos;
    private double sueldoTT;
    private String dir;

    public EntidadHospitalaria(String n_H, C_Hosp c_H, int esp, Sueldos[] s, String r) {
        n_hosp = n_H;
        c_hosp = c_H;
        n_esp = esp;
        sueldos = s;
        dir = r;
    }

    public void establecerNombreHosp(String n) {
        n_hosp = n;
    }

    public void establecerDir(String n) {
        dir = n;
    }

    public void establecerCiudadHosp(C_Hosp n) {
        c_hosp = n;
    }

    public void establecerNEsp(int n) {
        n_esp = n;
    }

    public void establecerSueldoTT() {
        double suma = 0;

        for (int i = 0; i < obtenerSueldos().length; i++) {
            suma += obtenerSueldos()[i].obtenerMedicos().obtenerSueldo();
            suma += obtenerSueldos()[i].obtenerEnf().obtenerSueldo();
        }

        sueldoTT = suma;
    }

    public void establecerSueldos(Sueldos[] n) {
        sueldos = n;
    }

    public String obtenerNombreHosp() {
        return n_hosp;
    }

    public String obtenerDir() {
        return dir;
    }

    public C_Hosp obtenerCiudadHosp() {
        return c_hosp;
    }

    public int obtenerNEsp() {
        return n_esp;
    }

    public Sueldos[] obtenerSueldos() {
        return sueldos;
    }

    public double obtenerSueldoTT() {
        return sueldoTT;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%s%s\\Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos\n",
                cadena, obtenerNombreHosp().toUpperCase(),
                obtenerDir(), obtenerCiudadHosp().obtenerNombre(),
                obtenerCiudadHosp().obtenerProv(),
                obtenerNEsp());

        for (int i = 0; i < obtenerSueldos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.0f - %s\n", cadena,
                    obtenerSueldos()[i].obtenerMedicos().obtenerNombre(),
                    obtenerSueldos()[i].obtenerMedicos().obtenerSueldo(),
                    obtenerSueldos()[i].obtenerMedicos().obtenerEspecialidad());
        }
        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);

        for (int i = 0; i < obtenerSueldos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.0f - %s\n", cadena,
                    obtenerSueldos()[i].obtenerEnf().obtenerNombre(),
                    obtenerSueldos()[i].obtenerEnf().obtenerSueldo(),
                    obtenerSueldos()[i].obtenerEnf().obtenerTipo());
        }

        cadena = String.format("%s\nTotal de sueldos a pagar por mes:  %.0f\n",
                cadena, obtenerSueldoTT());
        return cadena;
    }
}
