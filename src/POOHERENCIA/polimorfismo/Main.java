package POOHERENCIA.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("BMW", "2000", 4);
        vehiculos [1] = new Buseta("Audi", "2000", 2,"libertad");
        vehiculos[2] = new Camion("ford","1989",2, 35);
        vehiculos[3]= new Taxi("renault", "2000", 2,6);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}
