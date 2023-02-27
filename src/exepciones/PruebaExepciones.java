package exepciones;

import java.io.*;

public class PruebaExepciones {
    public void leerArchivo1() throws IOException {
        File archivo = new File("C:\\archivo.txt");//en el nombre ejemplo.txt en el directorio solo va el nombre "ejemplo" sin la extrencion, esta extencion se da por defecto
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        while ((linea = bf.readLine())!= null) {
            System.out.println(linea);
        }
    }
    public void leerArchivo2() {
        try {
            leerArchivo1();

        }catch (FileNotFoundException ex) {//esta exepcion se da cuando no encuentra el archivo, el ex es el alias
            System.out.println("no se encontro el archivo deseado, verificar ruta");
        }catch (IOException e) {//esta exepcion se da cuando no puede leer el archivo por que no se encontro
            System.out.println("ha ocurrido una exepcion verificada");
        }
        System.out.println("programa terminado");
    }
    public static void main(String[] args) {
        PruebaExepciones p = new PruebaExepciones();
        p.leerArchivo2();
    }
}