package operadoresArit.ejercicios;

import java.util.Scanner;

public class SumaCuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("ingrese numero 1");
        n1 = sc.nextInt();
        System.out.println("ingrese numero 2");
        n2 = sc.nextInt();
        //(a+b)^2 =   a^2   +  b^2     +      2ab
        //             4   +    9          3*2=6*2=12
        //                 13         +          12
        //                            25
        double cuadrada= Math.pow(n1,2) + Math.pow(n2,2)+ (2*n1*n2);
        System.out.println(cuadrada);

    }
}
