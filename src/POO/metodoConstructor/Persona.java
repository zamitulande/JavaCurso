package POO.metodoConstructor;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void InfoPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
