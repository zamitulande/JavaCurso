package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class SumaSueldos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldos, suma = 0, contadors = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("ingrese 10 sueldos");
            sueldos = sc.nextInt();
            suma = suma + sueldos;
            if(sueldos > 1000){
                contadors++;
            }
        }
        System.out.println("La suma de los sueldos es: " + suma);
        System.out.println("hay " + contadors + " mayores a 1000");
    }
}
