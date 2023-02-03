package Arrays.ejercicios;

import java.util.Scanner;

public class TablasABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];

        for (int i = 0; i < tablaA.length; i++) {
            System.out.println((i + 1)+" ingrese numeros");
            tablaA[i] = sc.nextInt();
        }
        for (int i = 0; i < tablaB.length; i++) {
            System.out.println((i + 1)+" ingrese numeros");
            tablaB[i] = sc.nextInt();
        }
        int j=0;
        for (int i = 0; i < 10; i++) {
            tablaC[j] = tablaA[i]; //1erA, 2doA
            j++;
            tablaC[j] = tablaB[i]; //1erB, 2doB
            j++;
        }
        for (int i = 0; i < tablaC.length; i++) {
            System.out.println(tablaC[i]);
        }
    }
}
