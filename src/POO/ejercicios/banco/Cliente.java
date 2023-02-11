package POO.ejercicios.banco;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    Cuenta cuenta[];

    public Cliente(String nombre, String apellido, String cedula, Cuenta cuenta[]) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public double consultarSaldo(int n) {
        return cuenta[n].getSaldo();
    }
    public void ingresarDinero(int n, double cantidad) {
        cuenta[n].ingresar(cantidad);
    }
    public void retirarDinero(int n, double cantidad) {
        cuenta[n].retirar(cantidad);
    }
}
