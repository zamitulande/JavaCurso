package Aeropuerto;

public class AeropuertoPrivado extends Aeropuerto {
    //atributos
    private String listaEmpresas[] = new String[10];
    private int numEmpresas;

    //constructor super de la clase padre
    public AeropuertoPrivado(String nombreAeropuerto, String ciudadAeropuerto, String pais) {
        super(nombreAeropuerto, ciudadAeropuerto, pais);
    }

    //constructor super de la clase padre y de los atrubutos de esta clase
    public AeropuertoPrivado(String nombreAeropuerto, String ciudadAeropuerto, String pais, Compania[] compania, String[] empresas) {
        super(nombreAeropuerto, ciudadAeropuerto, pais, compania);
        this.listaEmpresas = empresas;
        numEmpresas = empresas.length;
    }

    //inssertar empresas
    public void insertarEmpresa(String[] empresas) {
        this.listaEmpresas = empresas;
        this.numEmpresas = empresas.length;
    }
    public void insertarEmpresa(String  empresa) {
        listaEmpresas[numEmpresas] = empresa;
        numEmpresas++;
    }
    //metodos getters

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }
}
