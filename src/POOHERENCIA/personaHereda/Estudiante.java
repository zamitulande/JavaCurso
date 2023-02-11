package POOHERENCIA.personaHereda;

public class Estudiante extends Persona {
    String carrera;
    int semestre;

    public Estudiante(String nombre, String apellido, int edad, String carrera, int semestre) {
        super(nombre, apellido, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }
    public  String mostrarDatosPersona(){
        return "Nombre: " + getNombre()+ "\nApellido: " + getApellido() +
                "\nedad: " + getEdad() +
                "\nCarrera: " + getCarrera() +
                "\nSemestre: " + getSemestre();
    }
}
