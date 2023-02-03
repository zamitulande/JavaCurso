package busquedas;

import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        boolean bandera = false;
        int dato;

        System.out.println("ingrese numero a buscar");
        dato = sc.nextInt();

        int i = 0;
        while (i < array.length && !bandera) {
            if(array[i] == dato) {
                bandera = true;
            }
            i++;
        }
        if (!bandera) {
            System.out.println("numero no encontrado");
        }else {
            System.out.println("numero encontrado en la posicion: " + (i-1));
        }
    }
}
