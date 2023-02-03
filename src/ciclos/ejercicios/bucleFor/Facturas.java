package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class Facturas {
    public static void main(String[] args) {
        int codigo=0, cantidadLitros=0,litrosArt1=0, precioLitro=0, facturaTotal, facturacionTotal=0, conteoMayor600=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            System.out.println("ingrese condigo de articulo");
            codigo = sc.nextInt();
            System.out.println("cantidad de litros vendidos");
            cantidadLitros = sc.nextInt();
            System.out.println("ingrese precio de litro");
            precioLitro = sc.nextInt();
            facturaTotal = cantidadLitros * precioLitro;
            facturacionTotal += facturaTotal;
            if ( codigo == 1) {
                litrosArt1 += cantidadLitros;
            }
            if(facturaTotal > 600){
                conteoMayor600++;
            }
        }
        System.out.println("resumen de ventas");
        System.out.println("facturacion total: "+facturacionTotal);
        System.out.println("cantidad en litros vendidos del articulo 1: "+litrosArt1);
        System.out.println("cantidad de facturas mayor a 600: "+conteoMayor600);
    }
}
