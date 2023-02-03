package condicionales.ejercicios;

import javax.swing.*;

public class Multiplo {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, numero + " es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, numero + " no es multiplo de 10");
        }

    }
}
