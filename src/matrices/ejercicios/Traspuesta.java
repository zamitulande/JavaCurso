package matrices.ejercicios;

public class Traspuesta {
    public static void main(String[] args) {
        int traspuesta[][]={{1,3,5},{2,6,8},{6,9,7}};
        //primera opcion
//        System.out.println("traspuesta");
//        for (int i = 0; i < traspuesta.length; i++) {
//            for (int j = 0; j < traspuesta.length; j++) {
//                System.out.print(traspuesta[j][i]);
//            }
//            System.out.println("");
//        }

        //segunda opcion
        System.out.println("original");
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta.length; j++) {
                System.out.print(traspuesta[i][j]);
            }
            System.out.println(" ");
        }

        int aux;
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < i; j++) {
                aux=traspuesta[i][j];
                traspuesta[i][j]=traspuesta[j][i];
                traspuesta[j][i]=aux;
            }
        }
        System.out.println("traspuesta");
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta.length; j++) {
                System.out.print(traspuesta[i][j]);
            }
            System.out.println("");
        }
    }
}
