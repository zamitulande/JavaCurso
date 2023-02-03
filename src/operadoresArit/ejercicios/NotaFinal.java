package operadoresArit.ejercicios;

import javax.swing.*;

public class NotaFinal {
    public static void main(String[] args) {
        double nota1, nota2, nota3;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));

        double notaFinal = (nota1 + nota2 + nota3)/3;
        JOptionPane.showMessageDialog(null, notaFinal);


    }
}
