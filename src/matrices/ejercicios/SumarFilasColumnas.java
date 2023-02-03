package matrices.ejercicios;

import java.util.Scanner;

public class SumarFilasColumnas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][], filas, columnas;
        int sumaFilas=0, sumaColumnas=0;

        System.out.println("ingrese numero de filas");
        filas = sc.nextInt();
        System.out.println("ingrese numero de columnas");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];

        System.out.println("digite la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        //sumar filas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas = sumaFilas + matriz[i][j];
            }
            System.out.println("suma de la fila " + i + " es: " + sumaFilas);
        }
        System.out.println("");

        //suma columnas
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                sumaColumnas = sumaColumnas + matriz[i][j];
            }
            System.out.println("suma de la columna " + j + " es: " + sumaColumnas);
        }
        System.out.println("");
    }
}
