package ciclos.ejercicios.bucleWhile;

import javax.swing.*;

public class ParOImpar {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, numero + " es par");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            }else{
                JOptionPane.showMessageDialog(null, numero + " es impar");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            }
        }
        JOptionPane.showMessageDialog(null,"ingresaste el numero 0, has salido de bucle");
    }
}
