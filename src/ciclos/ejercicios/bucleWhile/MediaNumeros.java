package ciclos.ejercicios.bucleWhile;

import javax.swing.*;

public class MediaNumeros {
    public static void main(String[] args) {
        int numeros, suma = 0, contador = 0;
        float media;
        numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while (numeros > 0) {
            suma = suma + numeros;
            contador++;
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        };
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "la divicion entre 0 no existe");
        }else {
            media = (float) suma / contador;
            JOptionPane.showMessageDialog(null,media);
        }
    }
}
