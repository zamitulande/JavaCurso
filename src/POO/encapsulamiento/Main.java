package POO.encapsulamiento;

public class Main {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        clase1.setNombre("zami");
        System.out.println("nombre: " + clase1.getNombre());

        clase1.setApellido("tulande");
        System.out.println("apellido: " + clase1.getApellido());
    }
}
