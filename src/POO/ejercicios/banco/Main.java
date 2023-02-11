package POO.ejercicios.banco;

import java.util.Scanner;

public class Main {
    public  static int buscarNumeroCuenta(Cuenta[] cuentas, int numeroCuenta) {
        int i=0, indice=0;
        boolean encontrado=false;

        while(i<cuentas.length && !encontrado){
            if(cuentas[i].getNumCuenta()==numeroCuenta){
                encontrado=true;
                indice=i;
            }
            i++;
        }
        if(!encontrado){
            indice=-1;
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, apellido, cedula;
        double saldo, cantidad;
        int numCuenta, ncuentas, opcion, indiceCuenta;
        Cliente cliente;
        Cuenta cuenta[];

        System.out.println("Bienvenido al sistema de cuenta bancaria");
        System.out.println("ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("ingrese su cedula");
        cedula = sc.nextLine();
        System.out.println("ingrese cuantas cuentas tiene");
        ncuentas = sc.nextInt();

        cuenta = new Cuenta[ncuentas];
        for (int i = 0; i < cuenta.length; i++) {
            System.out.println("ingrese datos de la cuenta " + (i + 1));
            System.out.println("ingrese numero de la cuenta "+ (i + 1));
            numCuenta = sc.nextInt();
            System.out.println("ingrese saldo de la cuenta "+ (i + 1));
            saldo = sc.nextDouble();

            cuenta[i] = new Cuenta(numCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, cedula, cuenta);

        do {
            System.out.println("MENU");
            System.out.println("1. Ingresar dinero a la cuenta");
            System.out.println("2. Retirar dinero a la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.println("ingrese una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("digite el numero de la cuenta");
                    numCuenta = sc.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuenta, numCuenta);

                    if(indiceCuenta==-1){
                        System.out.println("el numero de la cuenta no existe");
                    }else{
                        System.out.println("digite la cantidad a ingresar");
                        cantidad = sc.nextDouble();

                        cliente.ingresarDinero(indiceCuenta, cantidad);
                        System.out.println("ingreso correctamente");
                        System.out.println("saldo de la cuenta: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 2:
                    System.out.println("digite el numero de la cuenta");
                    numCuenta = sc.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuenta, numCuenta);
                    if(indiceCuenta==-1){
                        System.out.println("el numero de la cuenta no existe");
                    }else{
                        System.out.println("ingrese cantidad a retirar");
                        cantidad = sc.nextDouble();

                        if(cantidad>cliente.consultarSaldo(indiceCuenta)){
                            System.out.println("saldo insuficiente");
                        }else {
                            cliente.retirarDinero(indiceCuenta, cantidad);
                            System.out.println("retiro correctamente");
                            System.out.println("saldo de la cuenta: " + cliente.consultarSaldo(indiceCuenta));
                        }
                    }
                    break;
                case 3:
                    System.out.println("digite el numero de la cuenta");
                    numCuenta = sc.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuenta, numCuenta);
                    if(indiceCuenta==-1) {
                        System.out.println("el numero de la cuenta no existe");
                    }else{
                        System.out.println("saldo de la cuenta: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("la opcion no existe");
            }
        }while (opcion!= 4);

    }
}
