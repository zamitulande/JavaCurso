package POO.ejercicios.atletas;

import java.util.Scanner;

public class Main {
    public  static int indiceAtletaGanador(Atletas atletas[]) {
        float tiempo;
        int indice= 0;
        tiempo = atletas[0].getTiempoCarrera();
        for (int i = 1; i < atletas.length; i++) {
            if(atletas[i].getTiempoCarrera() < tiempo){
                tiempo = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numero;
        float tiempoCarrera;
        int nAtletas, atletaGnador;
        System.out.println("ingrese numero de atletas");
        nAtletas = sc.nextInt();
        Atletas atleta[] = new Atletas[nAtletas];

        for (int i = 0; i < atleta.length; i++) {
            System.out.println("dijite los datos del atleta " + (i + 1));
            System.out.println("ingrese nombre del atleta " + (i + 1));
            nombre = sc.next();
            System.out.println("ingrese numero del atleta " + (i + 1));
            numero = sc.nextInt();
            System.out.println("ingrese tiempo carrera del atleta " + (i + 1));
            tiempoCarrera = sc.nextFloat();

            atleta[i] = new Atletas(nombre, numero, tiempoCarrera);
        }
        atletaGnador = indiceAtletaGanador(atleta);
        System.out.println("el atleta ganador es:");
        System.out.println(atleta[atletaGnador].mostrarDatos());

    }
}
