package Aeropuerto;

public class AeropuertoPublico extends Aeropuerto {
    private double subsidio;

    public AeropuertoPublico(String nombreAeropuerto, String ciudadAeropuerto, String pais) {
        super(nombreAeropuerto, ciudadAeropuerto, pais);
    }

    public AeropuertoPublico(String nombreAeropuerto, String ciudadAeropuerto, String pais, Compania[] compania, double subsidio) {
        super(nombreAeropuerto, ciudadAeropuerto, pais, compania);
        this.subsidio = subsidio;
    }

    public AeropuertoPublico(String nombreAeropuerto, String ciudadAeropuerto, String pais, double subsidio) {
        super(nombreAeropuerto, ciudadAeropuerto, pais);
        this.subsidio = subsidio;
    }

    public double getSubsidio() {
        return subsidio;
    }
}
