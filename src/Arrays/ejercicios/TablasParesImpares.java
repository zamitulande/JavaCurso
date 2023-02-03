package Arrays.ejercicios;

import java.util.Scanner;

public class TablasParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int conteoPar=0;
        int conteoImpar=0;
        int j=0;
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Numero: ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                conteoPar++;
            }else {
                conteoImpar++;
            }
        }
        int[] pares = new int[conteoPar];
        int[] impares = new int[conteoImpar];

        conteoPar=0;
        conteoImpar=0;
        for (int i = 0; i < array.length; i++) {
           if (array[i] % 2 == 0) {
               pares[conteoPar] = array[i];
               conteoPar++;
           }else {
               impares[conteoImpar] = array[i];
               conteoImpar++;
           }
        }
        System.out.println("pares");
        for (int i = 0; i < conteoPar; i++) {
            System.out.println(pares[i]);
        }
        System.out.println("impares");
        for (int i = 0; i < conteoImpar; i++) {
            System.out.println(impares[i]);
        }

    }
}
