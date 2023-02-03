package Arrays.ejercicios;

import java.util.Scanner;

public class BuscarNenTabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        boolean creciente = false;
        int numero;
        do {
            for ( int i = 0; i < array.length; i++) {
                System.out.println((i + 1) + " ingrese numero");
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                if (array[i] < array[i + 1]) {
                    creciente = true;
                }
                if (array[i] > array[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (!creciente) {
                System.out.println("arreglo en desorden, ingreselo de nuevo");
            }
        } while (!creciente);
        System.out.println("que numero desea buscar?");
        numero = scanner.nextInt();

        int i=0;
        while (i<10 && array[i]<numero) {
            i++;
        }
        if(i==10){
            System.out.println("numero no encontrado");
        }else{
            if(array[i]==numero){
                System.out.println("numero encontrado en la posicion " + i);
            }else{
                System.out.println("numero no encontrado");
            }
        }

    }
}
