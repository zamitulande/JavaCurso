package POOHERENCIA.polimorfismo;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int puertas;

    public Vehiculo(String marca, String modelo, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPuertas() {
        return puertas;
    }
    public String mostrarDatos(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPuertas: " + puertas;
    }
}
