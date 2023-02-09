package POO.ejercicios.planoCartesiano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlanoCartesiano cart;
        int x,y, opcion, incremento=0;
        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y = sc.nextInt();
        cart = new PlanoCartesiano(x,y);
        do {
            System.out.println("MENU");
            System.out.println("1. mover arriba");
            System.out.println("2. mover abajo");
            System.out.println("3. mover izquierda");
            System.out.println("4. mover derecha");
            System.out.println("5. salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();
            if(opcion <=5) {
                System.out.println("ingrese la cantidad de movimientos: ");
                incremento = sc.nextInt();
            }
            switch (opcion) {
                case 1 -> cart.moverArriba(incremento);
                case 2 -> cart.moverAbajo(incremento);
                case 3 -> cart.moverIzquierda(incremento);
                case 4 -> cart.moverDerecha(incremento);
                case 5 -> System.exit(0);
                default -> System.out.println("Opcion no valida");
            }
            System.out.println("x esta en: "+cart.getX()+" y esta en: "+cart.getY());
        }while (true);
    }
}
