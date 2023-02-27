package Aeropuerto;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    final static int numAeropuertos = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[numAeropuertos];
    public static void main(String[] args) {
        //insertar datos de los aeropuertos
        insertarDatosAeropuertos(aeropuertos);
        menu();
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
        aeropuerto[0].getCompania("EasyFlye").getVuelo("B56").insertarPasajeros(new Pasajero("Juan","123456", "colombiana"));
        aeropuerto[0].getCompania("EasyFlye").getVuelo("B59").insertarPasajeros(new Pasajero("Maria","234567", "chilena"));
        aeropuerto[0].getCompania("latam").getVuelo("M99").insertarPasajeros(new Pasajero("Pedro","345678", "peruano"));


        //se crea el aeropuerto publico
        aeropuerto[1] = new AeropuertoPublico("GUILLERMO","POPAYAN","Colombia",9900000);
        //se crean las compañias del aeropuerto
        aeropuerto[1].insertarCopania(new Compania("AVIANCA"));
        aeropuerto[1].insertarCopania(new Compania("SATENA"));
        //se crean las los vuelos de las compañias del aeropuerto
        aeropuerto[1].getCompania("AVIANCA").insertarVuelo(new Vuelo("Z56","BOGOTA","CALI",15.5,128));
        aeropuerto[1].getCompania("AVIANCA").insertarVuelo(new Vuelo("X59","POPAYAN","PASTO",10.5,136));
        aeropuerto[1].getCompania("SATENA").insertarVuelo(new Vuelo("Y99","MOCOA","SANTA MARTA",19.5,165));
        aeropuerto[1].getCompania("SATENA").insertarVuelo(new Vuelo("V89","CUCUTA","BARRANQUILLA",21.5,196));
        //se crean los pasajeros para los diferentes vuelos de las compañias del aeropuerto
        aeropuerto[1].getCompania("AVIANCA").getVuelo("Z56").insertarPasajeros(new Pasajero("Juana","123456", "colombiana"));
        aeropuerto[1].getCompania("AVIANCA").getVuelo("X59").insertarPasajeros(new Pasajero("Mariano","234567", "chilena"));
        aeropuerto[1].getCompania("SATENA").getVuelo("Y99").insertarPasajeros(new Pasajero("Pedro Pablo","345678", "peruano"));

        //se crea el aeropuerto privado
        aeropuerto [2] = new AeropuertoPrivado("CALEÑO","CALI","COLOMBIA");
        aeropuerto [2].insertarCopania(new Compania("AVIANCA"));
        //crear las empresas que patrocinan el aeropuerto
        String [] empresasAero1 = {"SANITAS","GRUPO QUALA"};
        ((AeropuertoPrivado)aeropuerto[2]).insertarEmpresa(empresasAero1);
        //crear vuelos de las compañias del aeropuerto
        aeropuerto [2].getCompania("AVIANCA").insertarVuelo(new Vuelo("Z96","BOGOTA","CALI",15.5,128));
        //crear pasajeros de los vuelos
        aeropuerto [2].getCompania("AVIANCA").getVuelo("Z96").insertarPasajeros(new Pasajero("Juanita","12345","Ecuatorian"));

        //se crea el aeropuerto privado
        aeropuerto [3] = new AeropuertoPrivado("CALEÑO","CALI","COLOMBIA");
        aeropuerto [3].insertarCopania(new Compania("LATAM"));
        //crear las empresas que patrocinan el aeropuerto
        String [] empresasAero2 = {"Cemex","Ecopetrol"};
        ((AeropuertoPrivado)aeropuerto[3]).insertarEmpresa(empresasAero2);
        //crear vuelos de las compañias del aeropuerto
        aeropuerto [3].getCompania("LATAM").insertarVuelo(new Vuelo("Z96","BOGOTA","CALI",15.5,128));
        //crear pasajeros de los vuelos
        aeropuerto [3].getCompania("LATAM").getVuelo("Z96").insertarPasajeros(new Pasajero("Juanita","12345","Ecuatorian"));
    }
    public static void menu(){
        String nombreAeropuerto,nombreCompania, origen, destino;
        Compania compania;
        int opcion;
        Aeropuerto aeropuerto;
        do{
            System.out.println(".MENU.");
            System.out.println("1. ver aeropuertos gestionados (publicos o privados)");
            System.out.println("2. ver empresas(privados) o subsidios(publicos)");
            System.out.println("3. lista de compañias de un aeropuerto");
            System.out.println("4. lista de vuelos por compañia");
            System.out.println("5. listar posibles vuelos de origen a destino");
            System.out.println("6. Salir");
            System.out.println("digite una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1: //ver aeropuertos gestionados (publicos o privados)
                    System.out.println("");
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2: //ver empresas(privados) o subsidios(publicos)
                    System.out.println("");
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3: //lista de compañias de un aeropuerto
                    System.out.println("");
                    System.out.println("que aeropuerto quieres buscar?");
                    nombreAeropuerto = sc.next();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if(aeropuerto == null){
                        System.out.println("no existe el aeropuerto");
                    }else{
                        mostrarCompanias(aeropuerto);
                    }

                    break;
                case 4: //lista de vuelos por compañia por aeropuerto
                    System.out.println("");
                    //primero buscar el aeropuerto
                    System.out.println("que aeropuerto quieres buscar?");
                    nombreAeropuerto = sc.next();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto,aeropuertos);
                    if(aeropuerto == null){
                        System.out.println("no existe el aeropuerto");
                    }else{
                        System.out.println("que compañia quieres buscar?");
                        nombreCompania = sc.next();
                        compania = aeropuerto.getCompania(nombreCompania);
                        mostrarVuelos(compania);
                    }
                    break;
                case 5: //listar posibles vuelos de origen a destino
                    System.out.println("");
                    System.out.println("digite ciudad de origen");
                    origen = sc.next();
                    System.out.println("digite ciudad de destino");
                    destino = sc.next();
                    mostrarVuelosOrigenDestino(origen,destino, aeropuertos);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opcion invalida");
            }
            System.out.println("");
        }while(opcion!= 6);
    }
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuerto[]){
        for(int i = 0; i < aeropuerto.length; i++){
            if(aeropuerto[i] instanceof AeropuertoPublico){
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: "+aeropuerto[i].getNombreAeropuerto());
                System.out.println("Ciudad: "+aeropuerto[i].getCiudadAeropuerto());
                System.out.println("Pais: "+aeropuerto[i].getPais());
            }else{
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: "+aeropuerto[i].getNombreAeropuerto());
                System.out.println("Ciudad: "+aeropuerto[i].getCiudadAeropuerto());
                System.out.println("Pais: "+aeropuerto[i].getPais());
            }
            System.out.println("");
        }
    }
    public static void mostrarPatrocinio(Aeropuerto aeropuerto[]){
        String empresas[];

        for(int i = 0; i < aeropuerto.length; i++){
            if(aeropuerto[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto privado "+aeropuerto[i].getNombreAeropuerto());
                //la clase Aeropuerto no tiene el metodo getListaEmpresas(), por esto se hace downCasting
                //para acceder al metodo de la clase hija
                empresas =((AeropuertoPrivado)aeropuerto[i]).getListaEmpresas();
                System.out.println("empresas: ");
                for(int j = 0; j < empresas.length; j++){
                    System.out.println(empresas[j]);
                }
            }else{
                System.out.println("Aeropuerto publico "+aeropuerto[i].getNombreAeropuerto());
                //la clase Aeropuerto no tiene el metodo getListaEmpresas(), por esto se hace downCasting
                //para acceder al metodo de la clase hija
                System.out.println("subsidio: "+((AeropuertoPublico)aeropuerto[i]).getSubsidio());
            }
            System.out.println("");
        }
    }

    public static Aeropuerto buscarAeropuerto(String nombreAeropuerto, Aeropuerto aeropuerto[]){
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aeropuertoBuscado = null;
        while (!encontrado && i < aeropuerto.length){
            if(aeropuerto[i].getNombreAeropuerto().equals(nombreAeropuerto)){
                encontrado = true;
                aeropuertoBuscado = aeropuerto[i];
            }
            i++;
        }
        return aeropuertoBuscado;
    }
    public static void mostrarCompanias(Aeropuerto aeropuerto){
        System.out.println("las compañias del aeropuerto son: "+aeropuerto.getNombreAeropuerto());
        for(int i = 0; i < aeropuerto.getNumCompania(); i++){
            System.out.println(aeropuerto.getCompania(i).getNombreCompania());
        }
    }
    public static void mostrarVuelos(Compania compania){
        Vuelo vuelo;
        System.out.println("vuelos de la compañia "+compania.getNombreCompania());
        for(int i = 0; i < compania.getNumVuelos(); i++){
            vuelo = compania.getVuelo(i);
            System.out.println("identificador: "+vuelo.getIdentificador());
            System.out.println("ciudad origen: "+vuelo.getCiudadOrigen());
            System.out.println("ciudad destino: "+vuelo.getCiudadDestino());
            System.out.println("precio: "+vuelo.getPrecio());
            System.out.println("");
        }
    }
    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuerto[]){
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelo[];
        for (int i=0; i<aeropuerto.length; i++){//recorre el aeropuerto
            for (int j=0; j<aeropuerto[i].getNumCompania();j++){//recorre las compañias del aeropuerto
             for (int k=0; k<aeropuerto[i].getCompania(j).getNumVuelos();k++){//recorre las vuelos del compañia
                vuelo = aeropuerto[i].getCompania(j).getVuelo(k);
                if (vuelo.getCiudadOrigen().equals(origen) && vuelo.getCiudadDestino().equals(destino)){
                    contador++;
                }
              }
            }
        }
        listaVuelo = new Vuelo[contador];
        int q = 0;
        for (int i=0; i<aeropuerto.length; i++){//recorre el aeropuerto
            for (int j=0; j<aeropuerto[i].getNumCompania();j++){//recorre las compañias del aeropuerto
                for (int k=0; k<aeropuerto[i].getCompania(j).getNumVuelos();k++){//recorre las vuelos del compañia
                    vuelo = aeropuerto[i].getCompania(j).getVuelo(k);
                    if (vuelo.getCiudadOrigen().equals(origen) && vuelo.getCiudadDestino().equals(destino)){
                        listaVuelo[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        return listaVuelo;
    }
    public static void mostrarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuerto[]){
        Vuelo vuelo[];
        vuelo = buscarVuelosOrigenDestino(origen, destino, aeropuerto);
        if(vuelo.length == 0){
            System.out.println("no hay vuelos de esa ciudad origen a destino");
        }else{
            System.out.println("vuelos encontrados: ");
            for(int i = 0; i < vuelo.length; i++){
                System.out.println("identificador: "+vuelo[i].getIdentificador());
                System.out.println("ciudad origen: "+vuelo[i].getCiudadOrigen());
                System.out.println("ciudad destino: "+vuelo[i].getCiudadDestino());
                System.out.println("precio: "+vuelo[i].getPrecio());
                System.out.println("");
            }
        }
    }
}
