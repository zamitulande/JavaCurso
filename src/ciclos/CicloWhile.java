package ciclos;

import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, contador;
        System.out.println("ingrese cuantos numero desea ver");
        contador = sc.nextInt();
        while (i <= contador) {
            System.out.println(i);
            i++;
        }
    }
}
