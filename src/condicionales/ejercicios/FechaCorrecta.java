package condicionales.ejercicios;

import java.util.Scanner;

public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, year;
        System.out.println("ingrese dia ");
        dia = sc.nextInt();
        System.out.println("ingrese mes ");
        mes = sc.nextInt();
        System.out.println("ingrese año ");
        year = sc.nextInt();
        if (dia <= 31 && mes <=12 && (year > 1900 && year < 2100 ) ){
            System.out.println("la fecha "+ dia+ "-"+mes+"-"+year+" es correcta");
        }else{
            System.out.println("la fecha es incorrecta");
        }
    }
}
