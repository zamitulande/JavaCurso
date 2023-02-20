package POO.ejercicios.equipoFutbol;

//clase heredada de principal
public class Futbolista extends Persona{
    //atributos de esta clase
    private int dorsal;
    private String posicion;

    //constructor
    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
       //super llama los atributos de la clase principal para ponerlos en este constructor
        super(nombre,apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    //metodos getter para los atributos de esta clase
    public int getDorsal() {
        return dorsal;
    }
    public String getPosicion() {
        return posicion;
    }
    //implementacion de metodos abstractos heredados de la clase principal

    //el termino @Override estamos sobreescribiendo los metodos de la clase principal
    @Override
    public void partidoFutbol(){
        System.out.println("juega el partido de futbol");
    }
    @Override
    public void entrenamiento(){
        System.out.println("entrena");
    }
    //metodo de esta clase
    public void entrevista(){
        System.out.println("da una entrevista");
    }
}
