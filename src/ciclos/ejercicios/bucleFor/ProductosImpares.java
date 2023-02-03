package ciclos.ejercicios.bucleFor;

public class ProductosImpares {
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i <= 20; i+=2){
            producto *= i;
        }
        System.out.println("eñ producto es: "+producto);
    }
}
