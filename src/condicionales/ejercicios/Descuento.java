package condicionales.ejercicios;

import javax.swing.*;

public class Descuento {
    public static void main(String[] args) {
        double compra, descuento, total;
        compra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la compra"));
        if (compra >= 300) {
            descuento = compra * 0.20;
            total = compra - descuento;
            JOptionPane.showMessageDialog(null, "El total a pagar es: " + total);
        }else {
            JOptionPane.showMessageDialog(null, "no tiene descuento");
        }
    }
}
