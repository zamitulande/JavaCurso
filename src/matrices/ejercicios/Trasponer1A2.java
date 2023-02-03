package matrices.ejercicios;

public class Trasponer1A2 {
    public static void main(String[] args) {
        int[][] matriz3 = new int[5][9];
        int[][] matriz2 = new int[9][5];

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                matriz3[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println("matriz1 5*9");
        for (int i = 0; i < matriz3.length; i++) {
            for(int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j]);
            }
            System.out.println("");
        }
        System.out.println("trasponer 9*5");
        for (int i = 0; i < matriz3.length; i++) {
            for(int j = 0; j < matriz3[i].length; j++) {
                matriz2 [j][i] = matriz3[i][j];
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println("");
        }
    }
}
