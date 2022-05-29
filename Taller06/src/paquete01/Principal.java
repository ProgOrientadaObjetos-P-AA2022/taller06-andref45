package paquete01;

import java.util.Scanner;
import paquete02.*;

/**
 *
 * @author andreflores
 */
public class Principal {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String nom, nC, bar, prov;
        int espe;
        System.out.println("Ingrese el nombre del hospital");
        nom = ent.nextLine();

        System.out.println("Ingrese el nombre de la ciudad");
        nC = ent.nextLine();

        System.out.println("Ingrese la dirección del hospital");
        bar = ent.nextLine();

        System.out.println("Ingrese la provincia del hospital");
        prov = ent.nextLine();

        C_Hosp c = new C_Hosp(nC, prov);

        System.out.println("Ingrese el número de especialidades del hospital");
        espe = ent.nextInt();
        
        ent.nextLine();
        String n, tp;
        double s;

        System.out.println("Ingrese el nombre de un médico:");
        n = ent.nextLine();

        System.out.println("Ingrese el sueldo de un médico:");
        s = ent.nextDouble();

        System.out.println("Ingrese la especialidad de un médico:");
        tp = ent.nextLine();

        Medicos m = new Medicos(n, tp, s);

        ent.nextLine();
        String n2, tp2;
        double s2;
        System.out.println("Ingrese el nombre de un médico:");
        n2 = ent.nextLine();

        System.out.println("Ingrese el sueldo de un médico:");
        s2 = ent.nextDouble();

        System.out.println("Ingrese la especialidad de un médico:");
        tp2 = ent.nextLine();

        Medicos m2 = new Medicos(n, tp, s);
        ent.nextLine();

        String n3, tp3;
        double s3;
        System.out.println("Ingrese el nombre de un médico:");
        n3 = ent.nextLine();

        System.out.println("Ingrese el sueldo de un médico:");
        s3 = ent.nextDouble();

        System.out.println("Ingrese la especialidad de un médico:");
        tp3 = ent.nextLine();

        Medicos m3 = new Medicos(n, tp, s);
        ent.nextLine();

        
        
        String n4, tp4;
        double s4;
        System.out.println("Ingrese el nombre de un médico:");
        n4 = ent.nextLine();

        System.out.println("Ingrese el sueldo de un médico:");
        s4 = ent.nextDouble();

        System.out.println("Ingrese la especialidad de un médico:");
        tp4 = ent.nextLine();

        Medicos m4 = new Medicos(n, tp, s);
        ent.nextLine();
        
        String nE, tpE;
        double sE;
        System.out.println("Ingrese el nombre de un enfermero:");
        nE = ent.nextLine();

        System.out.println("Ingrese el sueldo de un enfermero:");
        sE = ent.nextDouble();

        System.out.println("Ingrese el tipo de contrato de un enfermero:");
        tpE = ent.nextLine();
        ent.nextLine();

        Enfermeros e = new Enfermeros(n, tp, s);
        ent.nextLine();

        String nE2, tpE2;
        double sE2;
        System.out.println("Ingrese el nombre de un enfermero:");
        nE2 = ent.nextLine();

        System.out.println("Ingrese el sueldo de un enfermero:");
        sE2 = ent.nextDouble();

        System.out.println("Ingrese el tipo de contrato de un enfermero:");
        tpE2 = ent.nextLine();

        Enfermeros e2 = new Enfermeros(n, tp, s);
        ent.nextLine();

        String nE3, tpE3;
        double sE3;
        System.out.println("Ingrese el nombre de un enfermero:");
        nE3 = ent.nextLine();

        System.out.println("Ingrese el sueldo de un enfermero:");
        sE3 = ent.nextDouble();

        System.out.println("Ingrese el tipo de contrato de un enfermero:");
        tpE3 = ent.nextLine();

        Enfermeros e3 = new Enfermeros(n, tp, s);
        ent.nextLine();

        Sueldos ss1 = new Sueldos(0.0, m, e);
        Sueldos ss2 = new Sueldos(0.0, m2, e2);
        Sueldos ss3 = new Sueldos(0.0, m3, e3);
        

        Sueldos[] lista = {ss1, ss2, ss3};
        EntidadHospitalaria ent1 = new EntidadHospitalaria(nom, c, espe, lista,
        bar);
        System.out.println(ent1);
    }

}
