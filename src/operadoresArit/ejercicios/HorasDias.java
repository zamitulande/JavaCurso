package operadoresArit.ejercicios;

import java.util.Scanner;

public class HorasDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("ingrese numero de horas");
        hora = sc.nextInt();
        float semanas= hora/168;
        float dias = hora%168/24;
        float horas= hora%24;
        System.out.println(" el tiempo es: "+semanas+" semanas, "+dias+" dias, "+horas+" horas");

    }
}
