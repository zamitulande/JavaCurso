package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota, sumaNota=0, promedio;
        int cantidadAlumnos,totalReprobados=0, totalSuspensos=0, totalAprobados=0;
        System.out.println("ingrese cantidad de alumnos");
        cantidadAlumnos=sc.nextInt();
        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.println("ingrese notas del alunmo: "+i);
            for (int j = 1; j <= 6; j++) {
                System.out.println("ingrese nota: " + j);
                nota = sc.nextFloat();
                sumaNota = sumaNota + nota;
            }
            promedio = sumaNota / 6;
            sumaNota = 0;
            if (promedio < 4) {
                totalReprobados++;
            }
            if(promedio == 4){
                totalSuspensos++;
            }if(promedio >= 5){
                totalAprobados++;
            }
        }
        System.out.println("Total aprobados: " + totalAprobados);
        System.out.println("Total suspensos: " + totalSuspensos);
        System.out.println("Total reprobados: " + totalReprobados);
    }
}
