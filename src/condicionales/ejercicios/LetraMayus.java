package condicionales.ejercicios;

import javax.swing.*;

public class LetraMayus {
    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
        if(Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra " + letra + " es mayúscula");
        }else{
            JOptionPane.showMessageDialog(null, "La letra " + letra + " no es mayuscula");
        }
    }
}
