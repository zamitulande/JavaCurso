package ciclos;

import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador;
        System.out.println("ingrese cantidad de numeros");
        contador = sc.nextInt();
        for (int i = 1; i <= contador; i++) {
            System.out.println(i);
        }
    }
}
