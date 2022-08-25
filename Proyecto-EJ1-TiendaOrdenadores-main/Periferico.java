package TiendaOrdenador;

public class Periferico {
    private String tipo;
    private double precio;
    private String marca;

    public Periferico(String tipo, double precio, String marca) {
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

}
