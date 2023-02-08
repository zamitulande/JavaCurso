package POO.sobrecarga;

public class Sobrecarga {
     String nombre;
     int edad;
     String sexo;

    public Sobrecarga(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Sobrecarga(String sexo) {
        this.sexo = sexo;
    }

    public  void Info(){
        System.out.println("Nombre: "+nombre+" edad: "+edad);
    }
    public void Info(String sexo){
        System.out.println("sexo: "+sexo);
    }
}
