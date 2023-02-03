package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class Suma10N {
    public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese numeros: ");
            numero = scanner.nextInt();
            suma = suma + numero;
        }
        System.out.println(suma);
    }
}
