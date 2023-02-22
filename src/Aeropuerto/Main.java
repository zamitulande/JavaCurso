package Aeropuerto;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    final static int numAeropuertos = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];
    public static void main(String[] args) {
        //insertar datos de los aeropuertos
        insertarDatosAeropuertos(aeropuertos);
    }
    public static void insertarDatosAeropuertos(Aeropuerto aeropuerto[]){
        //se crea el aeropuerto publico
        aeropuerto[0] = new AeropuertoPublico("Dorado","Bogota","Colombia",800000);
        //se crean las compañias del aeropuerto
        aeropuerto[0].insertarCopania(new Compania("EasyFlye"));
        aeropuerto[0].insertarCopania(new Compania("latam"));
        //se crean las los vuelos de las compañias del aeropuerto
        aeropuerto[0].getCompania("EasyFlye").insertarVuelo(new Vuelo("B56","BOGOTA","CALI",15.5,128));
        aeropuerto[0].getCompania("EasyFlye").insertarVuelo(new Vuelo("B59","POPAYAN","PASTO",10.5,136));
        aeropuerto[0].getCompania("latam").insertarVuelo(new Vuelo("M99","MOCOA","SANTA MARTA",19.5,165));
        aeropuerto[0].getCompania("latam").insertarVuelo(new Vuelo("V89","CUCUTA","BARRANQUILLA",21.5,196));
        //se crean los pasajeros para los diferentes vuelos de las compañias del aeropuerto
        aeropuerto[0].getCompania("Esyflye").getVuelo("B56").insertarPasajeros(new Pasajero("Juan","123456", "colombiana"));
        aeropuerto[0].getCompania("Esyflye").getVuelo("B59").insertarPasajeros(new Pasajero("Maria","234567", "chilena"));
        aeropuerto[0].getCompania("latam").getVuelo("M99").insertarPasajeros(new Pasajero("Pedro","345678", "peruano"));


        //se crea el aeropuerto publico
        aeropuerto[1] = new AeropuertoPublico("GUILLERMO LEON VALENCIA","POPAYAN","Colombia",9900000);
        //se crean las compañias del aeropuerto
        aeropuerto[1].insertarCopania(new Compania("AVIANCA"));
        aeropuerto[1].insertarCopania(new Compania("SATENA"));
        //se crean las los vuelos de las compañias del aeropuerto
        aeropuerto[1].getCompania("AVIANCA").insertarVuelo(new Vuelo("B56","BOGOTA","CALI",15.5,128));
        aeropuerto[1].getCompania("AVIANCA").insertarVuelo(new Vuelo("B59","POPAYAN","PASTO",10.5,136));
        aeropuerto[1].getCompania("SATENA").insertarVuelo(new Vuelo("M99","MOCOA","SANTA MARTA",19.5,165));
        aeropuerto[1].getCompania("SATENA").insertarVuelo(new Vuelo("V89","CUCUTA","BARRANQUILLA",21.5,196));
        //se crean los pasajeros para los diferentes vuelos de las compañias del aeropuerto
        aeropuerto[1].getCompania("AVIANCA").getVuelo("Z56").insertarPasajeros(new Pasajero("Juana","123456", "colombiana"));
        aeropuerto[1].getCompania("AVIANCA").getVuelo("X59").insertarPasajeros(new Pasajero("Mariano","234567", "chilena"));
        aeropuerto[1].getCompania("SATENA").getVuelo("Y99").insertarPasajeros(new Pasajero("Pedro Pablo","345678", "peruano"));

        //se crea el aeropuerto privado
        aeropuerto [2] = new AeropuertoPrivado("CALEÑO","CALI","COLOMBIA");
        aeropuerto [2].insertarCopania(new Compania("AVIANCA"));
        //crear las empresas que patrocinan el aeropuerto
        String [] empresas = {"SANITAS","GRUPO QUALA"};
        ((AeropuertoPrivado)aeropuerto[2]).insertarEmpresa(empresas);
        //crear vuelos de las compañias del aeropuerto
        aeropuerto [2].getCompania("LATAM").insertarVuelo(new Vuelo("Z96","BOGOTA","CALI",15.5,128));
        //crear pasajeros de los vuelos
        aeropuerto [2].getCompania("LATAM").getVuelo("Z96").insertarPasajeros(new Pasajero("Juanita","12345","Ecuatorian"));

        //se crea el aeropuerto privado
        aeropuerto [3] = new AeropuertoPrivado("CALEÑO","CALI","COLOMBIA");
        aeropuerto [3].insertarCopania(new Compania("AVIANCA"));
        //no se insertan las empresas por que ya estan insertadas en el anterior aeropuerto privado
        //crear vuelos de las compañias del aeropuerto
        aeropuerto [3].getCompania("LATAM").insertarVuelo(new Vuelo("Z96","BOGOTA","CALI",15.5,128));
        //crear pasajeros de los vuelos
        aeropuerto [3].getCompania("LATAM").getVuelo("Z96").insertarPasajeros(new Pasajero("Juanita","12345","Ecuatorian"));
    }

}
