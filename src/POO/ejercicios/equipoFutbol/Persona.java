package POO.ejercicios.equipoFutbol;

//clase principal
public abstract class Persona {
    //se coloca protecteed a los atributos por que va a heredar
    protected String nombre;
    protected String apellido;
    protected int edad;

    //constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //metodos getter
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    //no se pone abastract por que si se van usar de la misma
    //manera en las subclases
    public void viajar() {
        System.out.println("viajar");
    }
    //se pone abstract por que se van a usar estos metodos
    //pero de manera diferente en cada subclase
    public abstract void partidoFutbol();
    public abstract void entrenamiento();
}
