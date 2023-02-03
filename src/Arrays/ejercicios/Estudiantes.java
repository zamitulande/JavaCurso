package Arrays.ejercicios;

import java.util.Scanner;

public class Estudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] primer = new float[5];
        float[] segundo = new float[5];
        float[] tercer = new float[5];
        float sumaPrimer = 0, sumaSegundo = 0, sumaTercer = 0, sumaAlumno=0;
        float promedioPrimer = 0, promedioSegundo = 0, promediotoTercer = 0, promedioAlumno = 0;
        int nPosicion;

        System.out.println("digite notas primer trimestre ");
        for (int i = 0; i < primer.length; i++) {
            System.out.println("alumno " +i+ ":");
            primer[i] = sc.nextFloat();
            sumaPrimer += primer[i];
        }
        System.out.println("digite notas segundo trimestre ");
        for (int i = 0; i < primer.length; i++) {
            System.out.println("alumno " +i+ ":");
            segundo[i] = sc.nextFloat();
            sumaSegundo += segundo[i];
        }
        System.out.println("digite notas tercer trimestre ");
        for (int i = 0; i < primer.length; i++) {
            System.out.println("alumno " +i+ ":");
            tercer[i] = sc.nextFloat();
            sumaTercer += tercer[i];
        }
        promedioPrimer = sumaPrimer / primer.length;
        promedioSegundo = sumaSegundo / segundo.length;
        promediotoTercer = sumaTercer / tercer.length;

        do {
            System.out.println("digite la posicion del alumno(0-4 ");
            nPosicion = sc.nextInt();
        }while (nPosicion < 0 || nPosicion > 4);

        sumaAlumno = primer[nPosicion] + segundo[nPosicion] + tercer[nPosicion];
        promedioAlumno = sumaAlumno / 3;

        System.out.println("mostrando los datos requeridos");
        System.out.println("promedio primer trimestre " + promedioPrimer);
        System.out.println("promedio segundo trimestre " + promedioSegundo);
        System.out.println("promedio tercer trimestre " + promediotoTercer);
        System.out.println("promedio alumno " + promedioAlumno);
    }
}
