package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        int numero;
        long factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
