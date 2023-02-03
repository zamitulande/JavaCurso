package Arrays.ejercicios;

import java.util.Scanner;

public class InsertarNumero {
    public static void main(String[] args) {
        int[] tablaN = new int[10];
        int numero, posicion, i= 0;
        Scanner sc = new Scanner(System.in);
        for ( i = 0; i < tablaN.length-2; i++) {
            System.out.println((i+1)+". Número: ");
            tablaN [i] = sc.nextInt();
        }
        for (int j = 0; j < tablaN.length; j++) {
            System.out.println("Posición: "+(j+1)+". Número: "+tablaN[j]);
        }
        System.out.println("hacen falta dos numeros, que numeros y en que posicion desea insertar? ");
        System.out.println("ingrese numero: ");
        numero = sc.nextInt();
        System.out.println("ingrese posicion de 1 a 10: ");
        posicion = sc.nextInt();
        for(int k=7;k>=posicion;k--){
            tablaN[i+1]=tablaN[k];
            System.out.println("es la k: "+k);
        }
        tablaN [posicion-1] = numero;
        for (i = 0; i < tablaN.length; i++) {
            System.out.println(tablaN[i]);
        }
    }
}
