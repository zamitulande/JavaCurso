package POO.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga("zamila", 100);
        Sobrecarga sobrecarga2 = new Sobrecarga("masculino");
        sobrecarga.Info();
        sobrecarga2.Info("masculino");
    }
}
