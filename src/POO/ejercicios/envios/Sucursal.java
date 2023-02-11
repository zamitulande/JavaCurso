package POO.ejercicios.envios;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;
    Paquete paquete[];

    public Sucursal(int numeroSucursal, String direccion, String ciudad, Paquete paquete[]) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.paquete = paquete;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    public String mostrarDatosSucursal(){
        return "Numero de sucursal: "+numeroSucursal+"\nDireccion: "+direccion+"\nCiudad: "+ciudad;
    }
    public  double calcularPrecio(Paquete paquete){
        double precio;
        precio = paquete.getPeso();
        if(paquete.getPrioridad() == 1){
            precio = precio + 10;
        }
        if(paquete.getPrioridad() == 2){
            precio = precio + 20;
        }
        return precio;
    }

}
