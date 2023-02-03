package metodosOrdenamiento;

import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        System.out.println("Ingrese el número de elementos: ");
        nElementos = sc.nextInt();

        arreglo = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1) + ". Elemento: ");
            arreglo[i] = sc.nextInt();
        }
        //metodo burbuja
        for (int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.println("arrelgo ordenado en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("arreglo ordenado en forma decrescente: ");
        for (int i = (nElementos-1); i>=0 ; i--) {
            System.out.println(arreglo[i]);
        }
    }
}
