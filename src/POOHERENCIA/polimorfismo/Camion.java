package POOHERENCIA.polimorfismo;

public class Camion extends Vehiculo {
    private int cargaToneladas;

    public Camion(String marca, String modelo, int puertas, int cargaToneladas) {
        super(marca, modelo, puertas);
        this.cargaToneladas = cargaToneladas;
    }

    public int getCargaToneladas() {
        return cargaToneladas;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCarga Toneladas: " + cargaToneladas;
    }
}