package Arrays.ejercicios;

import java.util.Scanner;

public class InsertarNumeroCreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        boolean creciente = true;
        int numero, posicion=0, j=0;
        do {
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ". Numero: ");
                array[i] = sc.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                //creciente
                if (array[i] < array[i + 1]) {
                    creciente = true;
                }
                //decreciente
                if (array[i] > array[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (!creciente) {
                System.out.println("no esta en creciente, digite de nuevo!!");
            }
        }while (!creciente);
        System.out.println("digite numero a insertar");
        numero = sc.nextInt();

        while (array[j]<numero && j<5) {
            posicion++;
            j++;
        }
        for (int i = 4; i >posicion; i--) {
            array[i+1] = array[i];
        }
        array[posicion] = numero;
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
