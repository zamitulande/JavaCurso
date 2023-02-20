package POO.ejercicios.equipoFutbol;

//clase heredada de clase principal
public class Entrenador extends Persona {

    //atributos de esta clase
    private String estrategia;

    //constructor
    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        //super llama los atributos de la clase principal para ponerlos en este constructor
        super(nombre, apellido, edad);;
        this.estrategia = estrategia;
    }
    //metodos getter para los atributos de esta clase
    public String getEstrategia() {
        return estrategia;
    }
    //implementacion de metodos abstractos heredados de la clase principal

    //el termino @Override estamos sobreescribiendo los metodos de la clase principal
    @Override
    public void partidoFutbol() {
        System.out.println("dirige el partido de Futbol");
    }
    @Override
    public void entrenamiento() {
        System.out.println("entrena los juagadores");
    }
    //metodo de esta clase
    public void planificarEntrenamiento() {
        System.out.println("planifica el entrenamiento");
    }

}
