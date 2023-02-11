package POOHERENCIA.polimorfismo;

public class Buseta extends Vehiculo{
    private String empresa;
    public Buseta(String marca, String modelo, int puertas, String empresa){
        super(marca, modelo, puertas);
        this.empresa = empresa;
    }
    public String getEmpresa(){
        return empresa;
    }

    public String mostrarDatos(){
        return super.mostrarDatos() + "\nEmpresa: " + empresa;
    }
}
