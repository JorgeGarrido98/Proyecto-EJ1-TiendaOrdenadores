package TiendaOrdenador;

public class Ram {
    private double precio;
    private double gb;
    private String generacion;

    public Ram(double precio, double gb, String generacion) {
        super();
        this.precio = precio;
        this.gb = gb;
        this.generacion = generacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getGb() {
        return gb;
    }

    public void setGb(double gb) {
        this.gb = gb;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

}
