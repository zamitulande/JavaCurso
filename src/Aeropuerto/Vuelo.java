package Aeropuerto;

public class Vuelo {
    //atrubutos
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajero[];

    //constructor
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajero = new Pasajero[numMaxPasajeros];
    }
    //metodo de esta clase
    public void insertarPasajeros(Pasajero pasajero){
        listaPasajero[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }
    //metodos getters
    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    //metodos de esta clase
    //retornar un pasajero segun el indice que indique el usuario
    public Pasajero getPasajero(int index){
        return listaPasajero[index];
    }
    //retornar un pasajero segun el pasaporte que indique el usuario
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i=0;
        Pasajero pasajero = null;
        while((!encontrado)&&(i<listaPasajero.length)){
            if(pasaporte.equals(listaPasajero[i].getPasaporte())){
                encontrado = true;
                pasajero = listaPasajero[i];
            }
            i++;
        }
        return pasajero;
    }
}
