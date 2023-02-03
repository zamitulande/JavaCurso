package condicionales.ejercicios;

import javax.swing.*;

public class Cajero {
    public static void main(String[] args) {
        final int saldoInicial = 1000;
        float ingreso, retiro, saldoFinal;
        int opciones;
        opciones = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al cajero, estas son las opciones:\n" +
                "1. ingresar dinero\n" +
                "2. retiro dinero\n" +
                "3. salir"));
        switch (opciones) {
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("cuanto es el ingreso"));
                    saldoFinal = saldoInicial + ingreso;
                    JOptionPane.showMessageDialog(null,"El nuevo saldo es:" +saldoFinal);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("cuanto es el retiro"));
                    if (retiro <= saldoInicial) {
                        saldoFinal = saldoInicial - retiro;
                        JOptionPane.showMessageDialog(null,"El nuevo saldo es:" +saldoFinal);
                    }else {
                        JOptionPane.showMessageDialog(null,"No tiene fondos sufientes");
                    }

                    break;
            case 3: System.exit(0);
                    break;
            default:
                JOptionPane.showMessageDialog(null,"Opción incorrecta");
        }
    }
}
