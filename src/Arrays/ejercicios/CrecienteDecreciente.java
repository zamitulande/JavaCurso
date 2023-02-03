package Arrays.ejercicios;

import java.util.Scanner;

public class CrecienteDecreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean creciente = false, decreciente = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ". Numero: ");
            numeros[i] = sc.nextInt();
        }
        for(int j = 0; j < numeros.length-1; j++){
            if(numeros[j] < numeros[j+1]){
                creciente = true;
            }
            if(numeros[j] > numeros[j+1]){
                decreciente= true;
            }
        }
        if(creciente && !decreciente){
            System.out.println("esta en orden creciente");
        }else if(decreciente &&!creciente){
            System.out.println("esta en orden decreciente");
        }else if(creciente && decreciente){
            System.out.println("esta en desorden");
        }else if(!creciente &&!decreciente){
            System.out.println("todos los numero son iguales");
        }
    }
}
