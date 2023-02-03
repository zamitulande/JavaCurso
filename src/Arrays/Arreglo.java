package Arrays;

import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nElementos;
        System.out.println("Ingrese el numero de elementos: ");
        nElementos = sc.nextInt();
        char[] letras = new char[nElementos];
        System.out.println("digite los elementos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+" digite un caractere: ");
            letras[i] = sc.next().charAt(0);
        }
        System.out.println("los caracteres son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(letras[i]);
        }
    }
}
