package POO.ejercicios.equipoFutbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    //crear arreglo para almacenar todo el equipo, jugador, doctor y entrenador
    static ArrayList<Persona> persona = new ArrayList<Persona>();

    //crear objetos de tipo staticos para cada clase
    static Persona futbolista1 = new Futbolista("james", "rodriguez", 25, 10, "volante");
    static Persona futbolista2 = new Futbolista("radamel", "falcar", 28, 9, "delantero");
    static Persona entrenador = new Entrenador("posecion", "jose", "pekerman", 62);
    static Persona medico = new Medico("diego", "bastidas", 25,"anastesiologo",12);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        menu();
    }
    public static void menu() {
        int opcion;
        do {
            System.out.println(".MENU.");
            System.out.println("1. viaje de equipo");
            System.out.println("2. entrenamiento");
            System.out.println("3. partido de futbol");
            System.out.println("4. planificar entrenamiento");
            System.out.println("5. entrevista");
            System.out.println("6. curar lesion");
            System.out.println("7. salir");
            System.out.println("ingrese opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    viajarEquipo();  //viaje de equipo
                    break;
                case 2:
                    System.out.println("");
                    entrenamiento(); //entrenamiento
                    break;
                case 3:
                    System.out.println("");
                    partidoFutbol(); //partido de futbol
                    break;
                case 4:
                    System.out.println("");
                    planificarEntrenamiento(); //planificar entrenamiento
                    break;
                case 5:
                    System.out.println("");
                    entrevista(); //entrevista
                    break;
                case 6:
                    System.out.println("");
                    curarLesion(); //curar lesion
                    break;
                case 7: //salir
                default:
                    System.out.println("opcion no valida");
                    break;
            }
            System.out.println("");
        }while (opcion!= 7);
    }
    //metodo viajarEquipo se aplica para todos por que no es abtracto
    public static void viajarEquipo() {
        for(Persona equipo: persona) {
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+"--> ");
            equipo.viajar();
        }
    }
    public static void entrenamiento() {
        for(Persona equipo: persona) {
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+"--> ");
            equipo.entrenamiento();
        }
    }
    public static void partidoFutbol() {
        for(Persona equipo: persona) {
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+"--> ");
            equipo.partidoFutbol();
        }
    }
    public static void planificarEntrenamiento() {
        System.out.println(entrenador.getNombre()+" "+entrenador.getApellido()+"--> ");
        //downcasting
        ((Entrenador)entrenador).planificarEntrenamiento();
    }
    public static void entrevista() {
        System.out.println(futbolista1.getNombre()+" "+futbolista1.getApellido()+"--> ");
        //downcasting
        ((Futbolista)futbolista1).entrevista();
        System.out.println(futbolista2.getNombre()+" "+futbolista2.getApellido()+"--> ");
        //downcasting
        ((Futbolista)futbolista2).entrevista();
    }
    public static void curarLesion() {
        System.out.println(medico.getNombre()+" "+medico.getApellido()+"--> ");
        //downcasting
        ((Medico)medico).curarLesion();
    }
}
