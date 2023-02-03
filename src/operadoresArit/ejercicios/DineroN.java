package operadoresArit.ejercicios;

import java.util.Scanner;

public class DineroN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double dolares;
        System.out.println("digite numero de dolares de Guillermo:");
        dolares = sc.nextDouble();
        System.out.println("guillermo tiene " + dolares + " dolares");
        double luis = dolares / 2;
        System.out.println("luis tiene " + luis + " dolares");
        double juan = (dolares + luis) / 2;
        System.out.println("juan tiene " + juan + " dolares");
    }
}
