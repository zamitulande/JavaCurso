package ciclos.ejercicios.bucleWhile;

import javax.swing.*;

public class PositivoONegativo {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while (numero != 0 ){
            if (numero > 0){
                JOptionPane.showMessageDialog(null, "El numero es positivo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            }else {
                JOptionPane.showMessageDialog(null, "El numero es negativo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            }
        }
        JOptionPane.showMessageDialog(null, "ingresaste el numero 0, has salido del bucle");
    }
}
