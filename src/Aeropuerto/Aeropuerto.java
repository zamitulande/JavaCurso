package Aeropuerto;

public class Aeropuerto {
    private String nombreAeropuerto;
    private String ciudadAeropuerto;
    private String pais;
    private Compania listaCompania[] = new Compania[10];
    private int numCompania;

    public Aeropuerto(String nombreAeropuerto, String ciudadAeropuerto, String pais) {
        this.nombreAeropuerto = nombreAeropuerto;
        this.ciudadAeropuerto = ciudadAeropuerto;
        this.pais = pais;
        this.numCompania = 0;
    }
    public Aeropuerto(String nombreAeropuerto, String ciudadAeropuerto, String pais, Compania compania[]) {
        this.nombreAeropuerto = nombreAeropuerto;
        this.ciudadAeropuerto = ciudadAeropuerto;
        this.pais = pais;
        listaCompania = compania;
        this.numCompania = compania.length;
    }
    public void insertarCopania( Compania compania ) {
        listaCompania[numCompania] = compania;
        numCompania++;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public String getCiudadAeropuerto() {
        return ciudadAeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public Compania[] getListaCompania() {
        return listaCompania;
    }

    public int getNumCompania() {
        return numCompania;
    }
    public Compania getCompania(int i) {
        return listaCompania[i];
    }
    public Compania getCompania(String nombre) {
        boolean encontrado = false;
        int i = 0;
        Compania compania = null;
        while((!encontrado) && (i < listaCompania.length)) {
            if(nombre.equals(listaCompania[i].getNombreCompania())) {
                encontrado = true;
                compania = listaCompania[i];
            }
            i++;
        }
        return compania;
    }
}
