package POO.ejercicios.poligono;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    public int getNumeroLados() {
        return numeroLados;
    }
    @Override
    public String toString() {
        return "numero lados: " + numeroLados;
    }
    public  abstract double area();
}
