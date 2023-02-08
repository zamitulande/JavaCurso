package POO.ejercicios.areacuadrilatero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCuadrilatero c1;
        float lado1, lado2;

        System.out.println("ingrese lado 1");
        lado1= sc.nextFloat();
        System.out.println("ingrese lado 2");
        lado2= sc.nextFloat();

        if(lado1==lado2){
            c1 = new AreaCuadrilatero(lado1);
        }else{
            c1 = new AreaCuadrilatero(lado1, lado2);
        }
        System.out.println("el perimetro es: "+c1.getPerimetro());
        System.out.println("el area es: "+c1.getArea());
    }
}
