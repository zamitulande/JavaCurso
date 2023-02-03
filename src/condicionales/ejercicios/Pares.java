package condicionales.ejercicios;

import javax.swing.*;

public class Pares {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));

        if(n1 % 2 == 0 && n2 % 2 == 0){
            JOptionPane.showMessageDialog(null, n1 + " y " + n2 + " son pares");
        }else{
            JOptionPane.showMessageDialog(null, n1 + " y " + n2 + " no son pares");
        }
    }
}
