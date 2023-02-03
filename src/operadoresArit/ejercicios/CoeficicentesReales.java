package operadoresArit.ejercicios;

import java.util.Scanner;

public class CoeficicentesReales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, result1, result2;
        System.out.println("ingrese el numero A, B y C: ");
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();

        result1 = (-b+Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a);
        result2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);

        System.out.println("la raiz1 es: "+result1);
        System.out.println("la raiz2 es: "+result2);
    }
}
