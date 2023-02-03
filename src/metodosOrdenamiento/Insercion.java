package metodosOrdenamiento;

import java.util.Scanner;

public class Insercion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos, posicion, aux;
        System.out.println("ingrese el numero de elementos: ");
        nElementos = sc.nextInt();
        arreglo = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            System.out.println("ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < nElementos; i++) {
            posicion = i;
            aux = arreglo[i];

            while (posicion > 0 && arreglo[posicion - 1] > aux){
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
            arreglo[posicion] = aux;
        }
        //accendente
        System.out.println("acendente");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
        //descendente
        System.out.println("desencendente");
        for (int i = nElementos - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
}
