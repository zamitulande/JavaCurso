package condicionales.ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese dos numeros para calcular");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("ingrese la operacion que desea realizar");
        System.out.println("r o R para restar, m, M, p o M para producto, s o S para sumar, d o D para division");
        char operacion = sc.next().charAt(0);
        switch (operacion) {
            case 's', 'S':
                int suma = num1 + num2;
                System.out.println("la suma es: " + suma);
            break;
            case 'r', 'R':
                int resta = num1 - num2;
                System.out.println("la resta es: " + resta);
            break;
            case 'm', 'M', 'p', 'P':
                int producto = num1 % num2;
            break;
            case 'd', 'D':
                int division = num1 / num2;
                System.out.println("la division es: " + division);
                break;
            default:
                System.out.println("no es una operacion valida");
        }
    }
}
