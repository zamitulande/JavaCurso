package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class AlturaEstatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, contadorEdad = 0, contadorAltura = 0, contadorMayor =0, contadorMas175 = 0;
        float altura, mediaEdad, mediaAltura, sumaEdad=0, sumaAltura=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("inggrese la edad");
            edad = sc.nextInt();
            System.out.println("ingrese la altura");
            altura = sc.nextFloat();
            sumaEdad = sumaEdad + edad;
            contadorEdad++;
            sumaAltura = sumaAltura + altura;
            contadorAltura++;
            if(edad >= 18) {
                contadorMayor++;
            }
            if(altura >= 1.75) {
                contadorMas175++;
            }
        }
        mediaAltura=sumaAltura/contadorAltura;
        mediaEdad=sumaEdad/contadorEdad;
        System.out.println("la edad media es: " +mediaEdad);
        System.out.println("la altura media es: " +mediaAltura);
        System.out.println("la cantidad de alunmos mayores de 18 años es: " +contadorMayor);
        System.out.println("la cantidad de alunmos que miden mas de 1.75 es: " +contadorMas175);
    }
}
