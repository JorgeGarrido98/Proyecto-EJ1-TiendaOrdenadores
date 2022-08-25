package TiendaOrdenador;

public class TarjetaGrafica {
    private double precio;
    private String marca;
    private String modelo;
    private Ram ram;
    
    public TarjetaGrafica(double precio, String marca, String modelo, Ram ram) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "- TarjetaGrafica: precio = " + precio + ", marca = " + marca + " y modelo = " + modelo;
    }
    
    
    
}
