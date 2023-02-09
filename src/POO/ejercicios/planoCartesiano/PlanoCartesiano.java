package POO.ejercicios.planoCartesiano;

public class PlanoCartesiano {
    private int x;
    private int y;

    public PlanoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moverArriba(int incremento) {
        x = x + incremento;
    }
    public void moverAbajo(int incremento) {
        x = x - incremento;
    }
    public void moverIzquierda(int incremento) {
        y = y - incremento;
    }
    public void moverDerecha(int incremento) {
        y = y + incremento;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
