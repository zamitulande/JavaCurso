package POO.ejercicios.banco;

public class Cuenta {
    private int numCuenta;
    private double saldo;

    public Cuenta(int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        saldo = saldo + cantidad;
    }
    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    }
}
