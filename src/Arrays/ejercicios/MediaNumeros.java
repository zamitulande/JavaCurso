package Arrays.ejercicios;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        float sumaPositivos=0, sumaNegativos=0, conteoCeros=0, conteoPositivos=0, conteoNegativos=0;
        float mediaNegativos=0,mediaPositivos=0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese numero: " + (i + 1)+ " ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0){
                sumaNegativos = sumaNegativos + numeros[i];
                conteoNegativos++;
                mediaNegativos = (sumaNegativos / conteoNegativos);
            }else if(numeros[i] > 0){
                sumaPositivos = sumaPositivos + numeros[i];
                conteoPositivos++;
                mediaPositivos = (sumaPositivos / conteoPositivos);
            }else if(numeros[i] == 0){
                conteoCeros ++;
            }
        }
        System.out.println("la media de los negativos es: " + mediaNegativos);
        System.out.println("la media de los positivos es: " + mediaPositivos);
        System.out.println("la cantidad de ceros es: " + conteoCeros);

    }
}
