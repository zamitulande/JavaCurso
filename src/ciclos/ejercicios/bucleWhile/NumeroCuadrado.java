package ciclos.ejercicios.bucleWhile;

import java.util.Scanner;

public class NumeroCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.println("ingrese un numero");
        numero = sc.nextDouble();
        while (numero >= 0) {
            double cuadrado = Math.pow(numero,2);
            System.out.println("la cuadrado del "+ numero+" es: " + cuadrado);
            System.out.println("ingrese un numero");
            numero = sc.nextDouble();
        }
        System.out.println("has ingresado un numero negativo, saliste del bucle");

    }
}
