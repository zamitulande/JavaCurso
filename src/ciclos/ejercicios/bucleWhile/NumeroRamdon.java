package ciclos.ejercicios.bucleWhile;

import java.util.Random;
import java.util.Scanner;

public class NumeroRamdon {
    public static void main(String[] args) {
        Random random = new Random();
        int nVariable = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese posible numero a adivinar: ");
        int numero;
        numero = sc.nextInt();
        while (numero!= nVariable) {
            String mensaje = (numero > nVariable)? "debe ser menor" : "debe ser mayor";
            System.out.println(mensaje);
            System.out.println("ingrese posible numero a adivinar: ");
            numero = sc.nextInt();
        }
        System.out.println("acertaste!! el numero "+numero+" es igual a "+nVariable);

    }
}
