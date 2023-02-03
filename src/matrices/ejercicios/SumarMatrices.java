package matrices.ejercicios;

public class SumarMatrices {
    public static void main(String[] args) {
        int matriz1[][] = {{1, 2, 3}, {4,5,6}, {7,8,9}};
        int matriz2[][] = {{9, 8, 7}, {6,5,4}, {3,2,1}};
        int suma [][];

        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println(" ");
        }

        suma=new int[matriz1.length][matriz2.length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                suma[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        System.out.println("la suma de las dos matreices es ");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
