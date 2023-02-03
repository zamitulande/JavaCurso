package condicionales;

import javax.swing.*;

public class Ternario {
    public static void main(String[] args) {
        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        mensaje = (numero % 2 == 0)? "Es par" : "No es par ";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
