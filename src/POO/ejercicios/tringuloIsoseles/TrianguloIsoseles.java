package POO.ejercicios.tringuloIsoseles;

public class TrianguloIsoseles {
    double lado;
    double base;

   public TrianguloIsoseles(double lado, double base){
        this.lado = lado;
        this.base = base;
    }
    public double calcularArea(){
       double area= (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
       return area;
    }
    public double calcularPerimetro(){
       double perimetro= 2*lado+base;
       return perimetro;
    }
}
