package calculoimpuesto.modelo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int cilindraje;
    private double avaluoComercial;
    private String tipoUso; // Si es Particular o Público

    public Vehiculo(String marca, String modelo, int anioFabricacion, int cilindraje, double avaluoComercial, String tipoUso) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.cilindraje = cilindraje;
        this.avaluoComercial = avaluoComercial;
        this.tipoUso = tipoUso;
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnioFabricacion() { return anioFabricacion; }
    public void setAnioFabricacion(int anioFabricacion) { this.anioFabricacion = anioFabricacion; }

    public int getCilindraje() { return cilindraje; }
    public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje; }

    public double getAvaluoComercial() { return avaluoComercial; }
    public void setAvaluoComercial(double avaluoComercial) { this.avaluoComercial = avaluoComercial; }

    public String getTipoUso() { return tipoUso; }
    public void setTipoUso(String tipoUso) { this.tipoUso = tipoUso; }
}
