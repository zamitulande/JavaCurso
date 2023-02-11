package POOHERENCIA.polimorfismo;

public class Taxi extends Vehiculo {
    private int pasajeros;
    public Taxi(String marca, String modelo, int puertas, int pasajeros) {
        super(marca, modelo, puertas);
        this.pasajeros = pasajeros;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nPasajeros: " + pasajeros;
    }

}
