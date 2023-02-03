package Arrays.ejercicios;

import java.util.Scanner;

public class UnaPosicionAtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tabla = new int[10];
        int i = 0;
        for (i = 0; i < tabla.length; i++) {
            System.out.println((i+1)+" ingrese numeros: ");
            tabla[i] = sc.nextInt();
        }
        int ultimo = tabla[9];

        for (i = 8; i >= 0; i--) {
            tabla[i+1] = tabla[i];
        }
        tabla[0] = ultimo;

        for (int k = 0; k < tabla.length; k++) {
            System.out.println(tabla[k]);
        }

    }
}
