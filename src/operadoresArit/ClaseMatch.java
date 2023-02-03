package operadoresArit;

public class ClaseMatch {
    public static void main(String[] args) {
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        double base = 10, exponente = 2;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);

        float numero = 10.9654f;
        int redondeo = Math.round(numero);
        System.out.println(redondeo);

        double ramdon= Math.random();
        System.out.println((int)ramdon);
    }
}
