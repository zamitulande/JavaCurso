package condicionales.ejercicios;

import java.util.Scanner;

public class MayorAMenor {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("ingrese tres numeros");
        n1 = sca.nextInt();
        n2 = sca.nextInt();
        n3 = sca.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1+" "+n2+" "+n3);
        }else if ((n1 > n3) && (n3 > n2)) {
            System.out.println(n1+" "+n3+" "+n2);
        }else if ((n2 > n1) && (n1 > n3)) {
            System.out.println(n2+" "+n1+" "+n3);
        }else if ((n2 > n3) && (n3 > n1)) {
            System.out.println(n2+" "+n3+" "+n1);
        }else if ((n3 > n1) && (n1 > n2)) {
            System.out.println(n3+" "+n1+" "+n2);
        }else{
            System.out.println(n3+" "+n2+" "+n1);
        }

    }
}
