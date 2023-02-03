package condicionales.ejercicios;

import javax.swing.*;

public class NumeroMayor {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro numero"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero1);
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero2);
        }else {
            JOptionPane.showMessageDialog(null, "los numeros son iguales");
        }
    }
}
