package POO.operacionesArgumentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperacionesArgumentos opA = new OperacionesArgumentos();
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.println("ingrese numero 1");
        n1 = sc.nextInt();
        System.out.println("ingrese numero 2");
        n2 = sc.nextInt();
        opA.Suma(n1, n2);
        opA.Resta(n1, n2);
        opA.Multiplicacion(n1, n2);
        opA.Division(n1, n2);
        opA.MostrarResultados();
    }
}
