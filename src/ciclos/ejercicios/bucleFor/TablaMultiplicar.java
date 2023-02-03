package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resultado;
        System.out.println("ingrese numero entre 0 y 10 para generar la tabla de multiplicar");
        numero = sc.nextInt();
        if (numero >= 0 && numero <= 10) {
            for (int i = 1; i <= 10; i++) {
                resultado= numero *i;
                System.out.println(numero +"*"+i+"="+resultado);
            }
        }else{
            System.out.println("el numero ingresado no esta en el rango");
        }
    }
}
