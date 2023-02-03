package operadoresArit.ejercicios;

import javax.swing.*;

public class AutosVendidos {
    public static void main(String[] args) {
        int salarioBase = 1000, comision=150, valorVehiculo, NumeroCarros;
        String nombre, apellido, codigo;

        nombre = JOptionPane.showInputDialog("Ingrese nombre del vendedor: ");
        apellido = JOptionPane.showInputDialog("Ingrese apellido del vendedor: ");
        codigo = JOptionPane.showInputDialog("Ingrese codigo del vendedor: ");

        valorVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del vehiculo: "));
        NumeroCarros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de carros vendidos: "));

        int comisionPorCarro = comision * NumeroCarros;
        int comisionvalorCarro = (valorVehiculo*5)/100;
        int salarioFinal = salarioBase + comisionPorCarro + comisionvalorCarro;

        JOptionPane.showMessageDialog(null, "El salario final de: " +nombre+" "+apellido+" con codigo: "+codigo+" "+"es de: " +salarioFinal);


    }
}
