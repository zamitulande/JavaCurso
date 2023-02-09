package POO.ejercicios.tringuloIsoseles;

import java.util.Scanner;

public class Main {
    public  static  double mayorArea(TrianguloIsoseles triangulo[]){
        double area;

        area = triangulo[0].calcularArea();
        for (int i = 1; i < triangulo.length; i++) {
            if (triangulo[i].calcularArea() > area) {
                area = triangulo[i].calcularArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double lado, base;
         int nTriangulos;
        System.out.println("ingrese numero de triangulos");
        nTriangulos = sc.nextInt();

         TrianguloIsoseles triangulo[] = new TrianguloIsoseles[nTriangulos];
         for (int i = 0; i < triangulo.length; i++) {
             System.out.println("ingrese los valores del triangulo " + (i + 1));
             System.out.println("ingrese el lado del triangulo " + (i + 1));
             lado = sc.nextDouble();
             System.out.println("ingrese el base del triangulo " + (i + 1));
             base = sc.nextDouble();

             triangulo[i] = new TrianguloIsoseles(lado, base);
             System.out.println("el perimetro del triangulo " + (i + 1) + " es: " +triangulo[i].calcularPerimetro());
             System.out.println("el area del triangulo " + (i + 1) + " es: " +triangulo[i].calcularArea());
         }
        System.out.println("el area del triangulo mayor es: " +mayorArea(triangulo));
    }
}
