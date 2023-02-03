package operadoresArit;

import java.util.Scanner;

public class OperacionesAritme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        float numeros1 = scanner.nextFloat();
        float numeros2 = scanner.nextFloat();

        float suma = numeros1+numeros2;
        float resta = numeros1-numeros2;
        float multiplicacion = numeros1*numeros2;
        float division = numeros1/numeros2;
        float modulo = numeros1%numeros2;

        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: " + division);
        System.out.println("la modulo es: " + modulo);

    }
}
