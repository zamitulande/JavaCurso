package POO.ejercicios.poligono;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        llenarPoligonos();
        mostrarResultados();
    }
    public  static void llenarPoligonos(){
        int opcion;
        char respuesta;
        do{
            do{
                System.out.println("digite que poligono desea agregar");
                System.out.println("1. triangulo");
                System.out.println("2. rectangulo");
                System.out.println("Opción: ");
                opcion = sc.nextInt();
            }while(opcion< 1 || opcion>2);

            switch(opcion){
                case 1: llenarTriangulo();//lenar triangulo
                    break;
                case 2: llenarRectangulo();//lenar rectangulo
                    break;
            }
            System.out.println("desea introducir otro poligono?");
            respuesta = sc.next().charAt(0);
            System.out.println("");
        }while(respuesta == 's' || respuesta == 'S');
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("ingrese lado 1 del triangulo");
        lado1 = sc.nextDouble();
        System.out.println("ingrese lado 2 del triangulo");
        lado2 = sc.nextDouble();
        System.out.println("ingrese lado 3 del triangulo");
        lado3 = sc.nextDouble();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligonos.add(triangulo);
    }
    public  static  void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("ingrese lado 1 del rectangulo");
        lado1 = sc.nextDouble();
        System.out.println("ingrese lado 2 del rectangulo");
        lado2 = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligonos.add(rectangulo);
    }
    public static void mostrarResultados(){
        for(Poligono poli: poligonos){
            System.out.println(poli.toString());
            System.out.println("area "+poli.area());
            System.out.println("");
        }
    }
}
