package condicionales.ejercicios;

import java.util.Scanner;

public class PedirNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nota entre 0 y 10");
        int nota= sc.nextInt();
        switch (nota) {
            case 0,1,2:
                System.out.println("su nota es Insuficiente");
                break;
            case 3,4:
                System.out.println("su nota es suficiente");
                break;
            case 5,6:
                System.out.println("su nota es bien");
                break;
            case 7,8:
                System.out.println("su notas es notable");
                break;
            case 9,10:
                System.out.println("su nota es sobresaliente");
                break;
            default:
                System.out.println("la nota no esta en el rango");
        }

    }
}
