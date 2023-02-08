package POO.operacionesReturn;

public class OperacionesReturn {

    int suma, resta, multiplicacion, division;

    public int Suma(int n1, int n2) {
        return suma = n1 + n2;
    }
    public int Resta(int n1, int n2){
        return resta = n1 - n2;
    }
    public int Multiplicacion(int n1, int n2) {
        return multiplicacion = n1 * n2;
    }
    public int Division(int n1, int n2) {
        return division = n1 / n2;
    }
    public void MostrarResultados() {
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
}
