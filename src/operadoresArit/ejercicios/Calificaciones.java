package operadoresArit.ejercicios;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float participacion, examen1, examen2, examneFinal, notaFinal;
        System.out.println("Ingrese la nota participacion: ");
        participacion = sc.nextFloat();
        System.out.println("Ingrese la nota examen 1: ");
        examen1 = sc.nextFloat();
        System.out.println("Ingrese la nota examen 2: ");
        examen2 = sc.nextFloat();
        System.out.println("Ingrese la nota examen final: ");
        examneFinal = sc.nextFloat();

        participacion *= 0.10f;
        examen1 *= 0.25f;
        examen2 *= 0.25f;
        examneFinal *= 0.50f;

        notaFinal = participacion + examen1 + examen2 + examneFinal;
        System.out.println(" la nota final es: " + notaFinal);

    }
}
