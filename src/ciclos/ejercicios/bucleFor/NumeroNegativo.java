package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        int numero, nNegativo=0;
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < 10; i++) {
            System.out.println("ingrese numeros: ");
            numero = sc.nextInt();
            if (numero < 0) {
                nNegativo = numero;
            }
        }
        if(nNegativo < 0){
            System.out.println("ingresste un numero negativo");
        }else{
            System.out.println("todos los numeros ingresados son positivos");
        }
    }
}
