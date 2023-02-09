package POO.ejercicios.vehiculos;

public class Vehiculos {
    String marca;
    int modelo;
    float precio;

    public Vehiculos(String marca, int modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public float getPrecio() {
        return precio;
    }
    public String mostrarDatos(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio;
    }
}
