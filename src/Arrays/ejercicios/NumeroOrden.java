package Arrays.ejercicios;

import java.util.Scanner;

public class NumeroOrden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese numero " + (i + 1)+": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("numeros: ");
        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
