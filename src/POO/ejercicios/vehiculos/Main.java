package POO.ejercicios.vehiculos;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static int indiceCocheBaarato(Vehiculos coches[]) {
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
           if (coches[i].getPrecio() < precio) {
               precio= coches[i].getPrecio();
               indice = i;
           }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca;
        int modelo;
        float precio;
        int nVehiculos, cocheBarato;

        System.out.println("ingrese cantidad de vehiculos");
        nVehiculos = sc.nextInt();
        Vehiculos coche[] = new Vehiculos[nVehiculos];

        for (int i = 0; i < coche.length; i++) {
            sc.nextLine();//para que no aparezca junto
            System.out.println("digite las caracteristicas del vehiculo " + (i + 1));
            System.out.println("digite la marca del vehiculo " + (i + 1));
            marca = sc.nextLine();
            System.out.println("digite el modelo del vehiculo " + (i + 1));
            modelo = sc.nextInt();
            System.out.println("digite el precio del vehiculo " + (i + 1));
            precio = sc.nextFloat();

            coche[i] = new Vehiculos(marca, modelo, precio);
        }
        cocheBarato = indiceCocheBaarato(coche);
        System.out.println("el coche mas barato es: ");
        System.out.println(coche[cocheBarato].mostrarDatos());
    }
}
