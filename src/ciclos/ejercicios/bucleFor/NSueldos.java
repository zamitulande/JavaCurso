package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class NSueldos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sueldos;
        float sueldoMax=0;
        System.out.println("ingrese numero de sueldos");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("ingrese sueldo: " + i);
            sueldos = sc.nextInt();
            if(sueldos>sueldoMax){
                sueldoMax=sueldos;
            }
        }
        System.out.println("el sueldo máximo es: "+sueldoMax);
    }
}
