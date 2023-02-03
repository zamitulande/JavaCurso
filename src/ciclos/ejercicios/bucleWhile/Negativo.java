package ciclos.ejercicios.bucleWhile;

import javax.swing.*;

public class Negativo {
    public static void main(String[] args) {
        int numero, contador= 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while (numero > 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "has ingresado " + contador + " numeros");
        JOptionPane.showMessageDialog(null, "ingresaste un negativo, fin de bucle");
    }
}
