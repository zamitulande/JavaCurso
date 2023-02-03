package matrices;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        int filas, columnas;
        System.out.println("digite el numero de filas de la matriz: ");
        filas = sc.nextInt();
        System.out.println("digite el numero de columnas de la matriz: ");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
