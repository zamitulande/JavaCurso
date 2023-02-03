package condicionales.ejercicios;

import java.util.Scanner;

public class FechaCorrecta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, year;
        System.out.println("ingrese el dia ");
        dia = sc.nextInt();
        System.out.println("ingrese el mes ");
        mes = sc.nextInt();
        System.out.println("ingrese el año ");
        year = sc.nextInt();
        switch (mes) {
            case 1,3,5,7,8,10,12:
                if(dia <= 31 && year > 1970){
                    System.out.println(dia + " " + mes + " " + year+" es correcto");
                }
            break;
            case 4,6,9,11:
                    if(dia <= 30 && year > 1970){
                        System.out.println(dia + " " + mes + " " + year+" es correcto");
                    }
            break;
            case 2:
                if(dia <= 28 && year > 1970){
                    System.out.println(dia + " " + mes + " " + year+" es correcto");
                }
            default:
                System.out.println("la fecha es incorrecta");
        }
    }
}
