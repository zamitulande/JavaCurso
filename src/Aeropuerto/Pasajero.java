package Aeropuerto;

public class Pasajero {
    //atributos
    private String nombre;
    private String pasaporte;
    private String nacionalidad;

    //constructor
    public Pasajero(String nombre, String pasaporte, String nacionalidad){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }
    //metodos getters de los atributos
    public String getNombre(){
        return this.nombre;
    }
    public String getPasaporte(){
        return this.pasaporte;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }

}
