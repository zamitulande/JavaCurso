package ciclos.ejercicios.bucleWhile;

import javax.swing.*;
import java.util.Scanner;

public class SumaIntroducidos {
    public static void main(String[] args) {
        int numero, suma =0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            suma = suma + numero;
        }while (numero!= 0);
        System.out.println("has introducido el numero 0, el bucle ha finalizado");
        System.out.println("la suma de los numeros introducidos es: " + suma);
    }
}
