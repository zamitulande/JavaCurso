package operadoresArit.ejercicios;

import javax.swing.*;

public class SalarioSemanal {
    public static void main(String[] args) {
        float horasLaboradas, salarioHora;
        horasLaboradas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese horas laboradas"));
        salarioHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese salario de hora"));

        float salario = horasLaboradas * salarioHora;
        JOptionPane.showMessageDialog(null,"el salario semanal es: "+ salario);

    }
}
