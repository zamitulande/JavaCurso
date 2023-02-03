package Arrays.ejercicios;

import java.util.Scanner;

public class EliminarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int posicion;
        for (int i = 0; i < tabla.length; i++) {
            System.out.print((i + 1)+ ". Numero: ");
            tabla[i] = sc.nextInt();
        }
        System.out.print("elija una posicion entre 0 y 9 a eliminar: ");
        posicion = sc.nextInt();
        for (int i = posicion-1; i < 9; i++) {
            tabla[i] = tabla[i+1];
            System.out.println("esta es la posicion " + i);
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(tabla[i]);
        }
    }
}

