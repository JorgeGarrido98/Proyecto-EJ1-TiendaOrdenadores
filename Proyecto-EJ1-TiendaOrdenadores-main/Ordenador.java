package TiendaOrdenador;

import java.util.List;

public class Ordenador {
    private String marca;
    private List <Ram> listaRam;
    private Procesador procesador;
    private List <TarjetaGrafica> listaTarjetaGrafica;
    private List <Periferico> listaPeriferico;
    private PlacaBase placaBase;
    private double precio;

    public Ordenador(String marca, List <Ram> listaRam, Procesador procesador, List <TarjetaGrafica> listaTarjetaGrafica, 
                    List <Periferico> listaPerifericos, PlacaBase placaBase) {
        super();
        this.marca = marca;
        this.listaRam = listaRam;
        this.procesador = procesador;
        this.listaTarjetaGrafica = listaTarjetaGrafica;
        this.listaPeriferico = listaPerifericos;
        this.placaBase = placaBase;
        precio = calcularPrecio();
    }
    
    public double calcularPrecio() {
        double precioTotal;
        double precioPeriferico = 0;
        double precioRam = 0;
        double precioTarjetaGrafica = 0;
        
        for(Periferico periferico : listaPeriferico) {
            precioPeriferico += periferico.getPrecio();
        }
        
        for(Ram ram : listaRam) {
            precioRam += ram.getPrecio();
        }
        
        for(TarjetaGrafica tarjetaGrafica : listaTarjetaGrafica) {
            precioTarjetaGrafica += tarjetaGrafica.getPrecio();
        }
        
        precioTotal = precioPeriferico + precioRam + precioTarjetaGrafica + procesador.getPrecio() + placaBase.getPrecio();
        
        return precioTotal;
    }

    String salida = "Ordenador: " + 
            "/n-Precio: " + precio + 
            "/n-Marca: " + marca + 
            "/n-Ram: " + listaRam + 
            "/n-Procesador: " + procesador + 
            "/n-Tarjeta Gráfica: " + listaTarjetaGrafica + 
            "/n-Periférico: " + listaPeriferico + 
            "/n-Placa Base: " + placaBase;

    @Override
    public String toString() {
        return salida;
    }
    
      
}
