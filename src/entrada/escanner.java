package entrada;

import java.util.Scanner;

public class escanner {
    public static void main(String[] args) {
        Scanner entradaInt = new Scanner(System.in);
        int numeroInt;
        System.out.println("digite un numero Int: ");
        numeroInt = entradaInt.nextInt();
        System.out.println("el numero es: "+ numeroInt
        );

        Scanner entradaFloat = new Scanner(System.in);
        float numeroFloat;
        System.out.println("digite un numero Float: ");
        numeroFloat = entradaFloat.nextFloat();
        System.out.println("el numero es: "+ numeroFloat
        );

        Scanner entradaDouble = new Scanner(System.in);
        double numeroDouble;
        System.out.println("digite un numero Double: ");
        numeroDouble = entradaDouble.nextDouble();
        System.out.println("el numero es: "+ numeroDouble
        );

        Scanner entradaString = new Scanner(System.in);
        String string;
        System.out.println("digite un cadena: ");
        string = entradaString.nextLine(); //next solo (imprime primer palabra antes de un espacio)
        System.out.println("la cadena es: "+ string
        );

        Scanner entradaChar = new Scanner(System.in);
        char caracter;
        System.out.println("digite un char: ");
        caracter = entradaChar.next().charAt(0); //chartAt imprime el primer caracter de la cadena (0)
        System.out.println("la cadena es: "+ caracter);
    }
}
