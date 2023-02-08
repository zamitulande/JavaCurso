package POO.operacionesReturn;

import POO.operacionesArgumentos.OperacionesArgumentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperacionesReturn opR = new OperacionesReturn();
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.println("ingrese numero 1");
        n1 = sc.nextInt();
        System.out.println("ingrese numero 2");
        n2 = sc.nextInt();
        opR.Suma(n1, n2);
        opR.Resta(n1, n2);
        opR.Multiplicacion(n1, n2);
        opR.Division(n1, n2);
        opR.MostrarResultados();
    }
}
