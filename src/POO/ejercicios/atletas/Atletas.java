package POO.ejercicios.atletas;

public class Atletas {
    String nombre;
    int numero;
    float tiempoCarrera;

    public Atletas(String nombre, int numero, float tiempoCarrera) {
        this.nombre = nombre;
        this.numero = numero;
        this.tiempoCarrera = tiempoCarrera;
    }
    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nNumero: " + numero + "\nTiempo: " + tiempoCarrera;
    }

}
