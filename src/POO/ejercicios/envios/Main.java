package POO.ejercicios.envios;

import java.util.Scanner;

public class Main {
    public static int buscarSucursal(Sucursal[] sucursal, int numeroSucursal) {
        int i = 0, indice = 0;
        boolean encontrado = false;

        while(i < sucursal.length && !encontrado) {
            if(sucursal[i].getNumeroSucursal() == numeroSucursal) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if(!encontrado) {
            indice = -1;
        }
        return indice;
    }
    public static int buscarPaquete(Paquete[] paquete, int numeroPaquete) {
        int i = 0, indice = 0;
        boolean encontrado = false;

        while(i < paquete.length && !encontrado) {
            if(paquete[i].getNumeroPaquete() == numeroPaquete) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if(!encontrado) {
            indice = -1;
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSucursal, numeroPaquete, prioridad, opcion, indiceSucursal, indicePaquete;
        String direccion, ciudad, dni;
        double peso, precioPaquete;
        Sucursal sucursal[] = new Sucursal[2];
        Paquete paquete[] = new Paquete[2];
        do {
            System.out.println("MENU");
            System.out.println("1. Crear sucursal");
            System.out.println("2. enviar paquete");
            System.out.println("3. consultar sucursal");
            System.out.println("4. consultar paquete");
            System.out.println("5. mostrar todas las sucursales");
            System.out.println("6. mostrar todas las paquetes");
            System.out.println("7. salir");
            System.out.println("Ingrese una opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < sucursal.length; i++) {
                        System.out.println("Creando sucursal: " + (i + 1));
                        System.out.println("ingrese numero de sucursal: "+ (i + 1));
                        numeroSucursal = sc.nextInt();
                        System.out.println("Ingrese direccion de sucursal: "+ (i + 1));
                        direccion = sc.next();
                        System.out.println("ingrese ciudad de sucursal: "+ (i + 1));
                        ciudad = sc.next();

                        sucursal[i] = new Sucursal(numeroSucursal, direccion, ciudad,paquete);

                    }
                    break;
                case 2:
                    System.out.println("digite numero de la sucursal a enviar");
                    numeroSucursal = sc.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal);

                    if(indiceSucursal== -1) {
                        System.out.println("sucursal no encontrada");
                    }else {
                        for (int i = 0; i < paquete.length; i++) {
                            System.out.println("Creando paquete: " + (i + 1)+" para enviar");
                            System.out.println("ingrese numero de paquete: "+ (i + 1));
                            numeroPaquete = sc.nextInt();
                            System.out.println("ingrese DNI del paquete: "+ (i + 1));
                            dni = sc.next();
                            System.out.println("dingrese peso del paquete: "+ (i + 1));
                            peso = sc.nextDouble();
                            System.out.println("ingrese prioridad del paquete: "+ (i + 1));
                            prioridad = sc.nextInt();

                            paquete[i] = new Paquete(numeroPaquete, dni,peso,prioridad);

                            precioPaquete=sucursal[indiceSucursal].calcularPrecio(paquete[i]);
                            System.out.println("el precio del paquete es: "+ precioPaquete);

                        }
                    }
                    break;
                case 3:
                    System.out.println("digite numero de la sucursal a consultar");
                    numeroSucursal = sc.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal);

                    if(indiceSucursal== -1) {
                        System.out.println("sucursal no encontrada");
                    }else{
                        System.out.println("la sucursal es: "+sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.println("digite numero de la paquete a consultar");
                    numeroPaquete = sc.nextInt();
                    indicePaquete = buscarPaquete(paquete, numeroPaquete);

                    if(indicePaquete== -1) {
                        System.out.println("paquete no encontrada");
                    }else{
                        System.out.println("el paquete es: "+paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;
                case 5:
                    System.out.println("estas son todas las sucursales");
                    for (int i = 0; i < sucursal.length; i++) {
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break;
                case 6:
                    System.out.println("estas son todos las paquetes");
                    for (int i = 0; i < paquete.length; i++) {
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }

            }
        }while(opcion!= 7);
    }
}
