package POO.operacionesArgumentos;

import java.util.Scanner;

public class OperacionesArgumentos {

    int suma, resta, multiplicacion, division;

    public void Suma(int n1, int n2) {
        suma = n1 + n2;
    }
    public void Resta(int n1, int n2){
             resta = n1 - n2;
    }
    public void Multiplicacion(int n1, int n2) {
             multiplicacion = n1 * n2;
    }
    public void Division(int n1, int n2) {
        division = n1 / n2;
    }
    public void MostrarResultados() {
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
}
