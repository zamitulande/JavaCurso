package entrada;

import javax.swing.*;

public class OptionPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Ingrese una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal"));

        JOptionPane.showMessageDialog(null, "la cadena es :"+cadena);
        JOptionPane.showMessageDialog(null, "el entero es :"+entero);
        JOptionPane.showMessageDialog(null, "la letra es :"+letra);
        JOptionPane.showMessageDialog(null, "el decimal es :"+decimal);//CON JOPTION SI SE PONE PUNTO

    }
}
