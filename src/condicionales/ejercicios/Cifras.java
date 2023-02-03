package condicionales.ejercicios;

import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese numero");
        numero = sc.nextInt();
        if(numero < 10){
            System.out.println("el numero "+numero+" es de una cifra");
        }else if( numero < 100){
            System.out.println("el numero "+numero+" es de dos cifras");
        }else if(numero < 1000){
            System.out.println("el numero "+numero+" es de tres cifras");
        }else if(numero < 10000){
            System.out.println("el numero "+numero+" es de cuatro cifras");
        }else if(numero < 100000){
            System.out.println("el numero "+numero+" es de cinco cifras");
        }else{
            System.out.println("el numero "+numero+" supera las 5 cifras");
        }
    }
}
