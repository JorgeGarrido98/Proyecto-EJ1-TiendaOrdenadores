package TiendaOrdenador;

public class Procesador {
    private double precio;
    private double gb;
    private String marca;
    private TarjetaGrafica tarjetaGraficaIntegrada;

    public Procesador(double precio, double gb, String marca, TarjetaGrafica tarjetaGraficaIntegrada) {
        this.precio = precio;
        this.gb = gb;
        this.marca = marca;
        this.tarjetaGraficaIntegrada = tarjetaGraficaIntegrada;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TarjetaGrafica getTarjetaGraficaIntegrada() {
        return tarjetaGraficaIntegrada;
    }

    public void setTarjetaGraficaIntegrada(TarjetaGrafica tarjetaGraficaIntegrada) {
        this.tarjetaGraficaIntegrada = tarjetaGraficaIntegrada;
    }
    
}
