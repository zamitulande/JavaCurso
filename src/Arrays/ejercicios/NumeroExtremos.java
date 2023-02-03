package Arrays.ejercicios;

import java.util.Scanner;

public class NumeroExtremos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese numeros: "+(i+1));
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < (numeros.length/2); i++) {
            System.out.println(numeros[i]+" ");
            System.out.println(numeros[numeros.length-1-i]+" ");
        }
    }
}
