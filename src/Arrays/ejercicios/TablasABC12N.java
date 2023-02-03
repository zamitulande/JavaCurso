package Arrays.ejercicios;

import java.util.Scanner;
//leer los datos correspondientes a dos tablas de 12 elementos numericos y mesclarlos en una
//tercera forma: 3 de la tabala A, tres de la tablaB, tres de la tablaA y tres de la tablaB
public class TablasABC12N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaA = new int[12];
        int[] tablaB = new int[12];
        int[] tablaC = new int[24];
        int j,i;
        for (i = 0; i < tablaA.length; i++) {
            System.out.println((i+1)+" ingrese numeros de la tabla A");
            tablaA[i] = sc.nextInt();
        }
        for (i = 0; i < tablaB.length; i++) {
            System.out.println((i+1)+" ingrese numeros de la tabla B");
            tablaB[i] = sc.nextInt();
        }
        j=0;
        i=0;
        while(i<12){
            for(int k=0;k<3;k++){
                tablaC[j]= tablaA[i+k];
                j++;
            }
            for(int k=0;k<3;k++){
                tablaC[j]= tablaB[i+k];
                j++;
            }
            i+=3;
        }
        for (i = 0; i < tablaC.length; i++) {
            System.out.println(tablaC[i]);
        }
    }
}
