package POO.ejercicios.equipoFutbol;

//clase heredada de clase principal
public class Medico extends Persona{
    //atributos de esta clase
    private String titulacion;
    private  int aniosExperiencia;

    //constructor
    public Medico(String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        //super llama los atributos de la clase principal para ponerlos en este constructor
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    //metodos getter para los atributos de esta clase

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    //implementacion de metodos abstractos heredados de la clase principal

    //el termino @Override estamos sobreescribiendo los metodos de la clase principal
    @Override
    public void partidoFutbol() {
        System.out.println("supersiva algun accidente en el partido");
    }
    public void entrenamiento() {
        System.out.println("supersiva algun accidente en el entrenamiento y hace masajes");
    }
    //metodo de esta clase
    public void curarLesion() {
        System.out.println("curar la lesion");
    }
}
