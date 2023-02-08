package POO.operacionesNormal;

import java.util.Scanner;

public class Operaciones {

    int num1, num2;
    int suma, resta, multiplicacion, division;

    public void PedirNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
    }
    public void Suma() {
        suma = num1 + num2;
    }
    public void Resta() {
        resta = num1 - num2;
    }
    public void Multiplicacion() {
        multiplicacion = num1 * num2;
    }
    public void Division() {
        division = num1 / num2;
    }
    public void MostrarResultados() {
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
}
