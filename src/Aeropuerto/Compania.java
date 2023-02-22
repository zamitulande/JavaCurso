package Aeropuerto;

public class Compania {
    //atributos
    private String nombreCompania;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelos=0;

    //constructor

    public Compania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }
    public Compania(String nombreCompania, Vuelo vuelo[]) {
        this.nombreCompania = nombreCompania;
        listaVuelos = vuelo;
        numVuelos = vuelo.length;
    }

    //metodos de esta clase
    public void insertarVuelo(Vuelo vuelo) {
        listaVuelos[numVuelos] = vuelo;
        numVuelos++;
    }

    //metodos getters
    public String getNombreCompania() {
        return nombreCompania;
    }
    public int getNumVuelos() {
        return numVuelos;
    }

    //metodos de esta clase

    //retornar un vuelo segun el indice que indique el usuario
    public Vuelo getVuelo(int i) {
        return listaVuelos[i];
    }
    //retornar un vuelo segun el identificador que indique el usuario
    public Vuelo getVuelo(String identificador) {
        boolean encontrado = false;
        int i = 0;
        Vuelo vuelo = null;
        while ((!encontrado) && (i < listaVuelos.length)) {
            if(identificador.equals(listaVuelos[i].getIdentificador())) {
                encontrado = true;
                vuelo = listaVuelos[i];
            }
            i++;
        }
        return vuelo;
    }
}
