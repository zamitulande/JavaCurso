package ciclos.ejercicios.bucleWhile;

import java.util.Scanner;

public class MostratNumerosN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, numeros;
        System.out.println("ingrese cantidad de numeros a ver");
        numeros = sc.nextInt();
        while (i<=numeros) {
            System.out.println(i);
            i++;
        }
    }
}
