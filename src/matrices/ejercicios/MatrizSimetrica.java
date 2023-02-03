package matrices.ejercicios;

import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][];
        int filas, columnas;
        boolean simetrica= true;


        System.out.println("ingrese cantida de filas ");
        filas = sc.nextInt();
        System.out.println("ingrese cantida de columnas ");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }
        if(filas == columnas){
            int i, j;
            i=0;
            while(i<filas && simetrica){
                j=0;
                while(j<i && simetrica){
                    if(matriz[i][j]!=matriz[j][i]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica){
                System.out.println("la matriz es simetrica");
            }else{
                System.out.println("la matriz no es simetrica");
            }
        }else{
            System.out.println("La matriz no es simetrica");
        }
    }
}
