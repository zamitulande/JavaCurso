package ciclos.ejercicios.bucleFor;

import java.util.Scanner;

public class PosNegCero {
    public static void main(String[] args) {
        int num, contador = 0, contadorn=0, contadorCeros=0, sumap = 0, suman = 0;
        float  media = 0, median=0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println("ingrese un numero");
            num = sc.nextInt();
            if(num > 0){
                contador++;
                sumap = sumap + num;
                media = (float)sumap / contador;
            }else if(num < 0){
                contadorn++;
                suman = suman + num;
                median = (float)suman / contadorn;
            }else if(num == 0){
                contadorCeros++;
            }
        }
        System.out.println("media de positivos: "+media);
        System.out.println("media de negativos: "+median);
        System.out.println("la cantidad de ceros es: "+contadorCeros);
    }
}
