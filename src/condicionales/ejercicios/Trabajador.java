package condicionales.ejercicios;

import javax.swing.*;

public class Trabajador {
    public static void main(String[] args) {
        int horasTrabajadas, pagoNormal;
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: "));
        if(horasTrabajadas <= 40){
            pagoNormal = horasTrabajadas * 16;
        }else{
           pagoNormal = (40*16) + ((horasTrabajadas-40)*20);
        }
        JOptionPane.showMessageDialog(null, "su pago es: " + pagoNormal);
    }
}
