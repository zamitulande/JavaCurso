package condicionales;

import javax.swing.*;

public class condicionSwitch {
    public static void main(String[] args) {
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        switch (nombre) {
            case "Juan": JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
            break;
            case "Pedro": JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
            break;
            case "Maria": JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
            break;
            default: JOptionPane.showMessageDialog(null, nombre+" no eres bienvenido no estas en la lista. " );
        }




    }
}
