package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class AlgunSuspenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota=0, nAlumnos;
        boolean notaFinal = false;
        float promedio=0, sumaNota=0;
        System.out.println("ingrese numero de alumnos");
        nAlumnos = sc.nextInt();
        for (int i = 1; i <= nAlumnos; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Digite nota " + j + ":");
                nota = sc.nextInt();
                sumaNota=sumaNota+nota;
            }
            promedio = sumaNota/5;
            sumaNota =0;
            if (promedio == 4) {
                notaFinal = true;
            }
        }
        if (notaFinal) {
            System.out.println("hay un alunmno suspenso");
        }else {
            System.out.println("no hay suspensos");
        }
    }
}
