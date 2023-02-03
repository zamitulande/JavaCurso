package Arrays.ejercicios;

import java.util.Scanner;

public class FucionarTablasCrecientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];
        boolean creciente = true;

        System.out.println("digite el primer arreglo");
        do {
            for(int i = 0; i < tablaA.length; i++) {
                System.out.println((i + 1) + " ingrese numero");
                tablaA[i] = sc.nextInt();
            }
            for(int i=0; i<9;i++) {
                if(tablaA[i] < tablaA[i+1]) {
                    creciente = true;
                }
                if(tablaA[i] > tablaA[i+1]) {
                    creciente = false;
                    break;
                }
            }
            if(!creciente) {
                System.out.println("el arreglo esta desordenado, digite de nuevo");
            }
        }while(!creciente);
        System.out.println("digite el segundo arreglo");
        do {
            for(int i = 0; i < tablaB.length; i++) {
                System.out.println((i + 1) + " ingrese numero");
                tablaB[i] = sc.nextInt();
            }
            for(int i=0; i<9;i++) {
                if(tablaB[i] < tablaB[i+1]) {
                    creciente = true;
                }
                if(tablaB[i] > tablaB[i+1]) {
                    creciente = false;
                    break;
                }
            }
            if(!creciente) {
                System.out.println("el arreglo esta desordenado, digite de nuevo");
            }
        }while(!creciente);

        int i = 0; //itereador tablaA
        int j = 0; //itereador tablaB
        int k = 0; //itereador tablaC

        while (i<10 && j<10){
            if(tablaA[i] < tablaB[j]){
                tablaC[k] = tablaA[i];
                i++;
            }else{
                tablaC[k] = tablaB[j];
                j++;
            }
            k++;
        }
        if(i==10){
            while (j<10){
                tablaC[k] = tablaB[j];
                j++;
                k++;
            }
        }else{
            while(i<10){
                tablaC[k] = tablaA[i];
                i++;
                k++;
            }
        }
        System.out.println("la tabla C es: ");
        for (k = 0; k < tablaC.length; k++) {
            System.out.println(tablaC[k]);
        }
    }
}
