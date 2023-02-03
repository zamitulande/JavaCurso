package Arrays.ejercicios;

import java.util.Scanner;

public class DesplazarNPosiciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        int posiciones, ultimo;
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+" ingrese numeros: ");
            array[i] = sc.nextInt();
        }
        System.out.println("cuantas posiciones desea desplazar: ");
        posiciones = sc.nextInt();

        for (int i = 0; i <=posiciones-1; i++) {
            ultimo = array[9];
            for (int j = 8; j >=0; j--) {
                array[j+1] = array[j];
            }
            array[0] = ultimo;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " "+array[i]);
        }
    }
}
