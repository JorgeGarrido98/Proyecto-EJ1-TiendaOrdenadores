package TiendaOrdenador;

import java.util.List;

/**
 * @author Jorge Garrido
 * @version 1.1
 * @since 07/10/2021
 */
public class Main {

    public static void main(String[] args) {

        // Creo los periféricos
        Periferico p1 = new Periferico("Pantalla", 300, "Asus");
        Periferico p2 = new Periferico("Teclado", 30, "NewSkill");
        Periferico p3 = new Periferico("Ratón", 24, "Razer");
        List <Periferico> listaPeriferico = List.of(p1,p2,p3);

        // Creo las Ram
        Ram r1 = new Ram(80, 16, "DDR4 3200 MHz");
        Ram rIntT = new Ram(50, 8, "DDR4 2600 MHz");
        Ram rIntP = new Ram(70, 8, "DDR6 3000 MHz");
        List <Ram> listaRam = List.of(r1,rIntT,rIntP);

        // Creo la Placa Base
        PlacaBase placaBase = new PlacaBase(80, "MSI", "X470 Gaming Plus Max");

        // Creo la Tarjeta Gráfica
        TarjetaGrafica t1 = new TarjetaGrafica(430, "Gigabyte", "GeForce GTX 1660", rIntT);
        TarjetaGrafica tIntP = new TarjetaGrafica(316, "Asus", "GeForce GTX 1050Ti", rIntP);
        List <TarjetaGrafica> listaTarjetaGrafica = List.of(t1,tIntP);

        // Creo el procesador
        Procesador procesador = new Procesador(700, 8, "AMD", tIntP);

        // Creo el ordenador
        Ordenador o1 = new Ordenador("MSI", listaRam, procesador, listaTarjetaGrafica, listaPeriferico, placaBase);
        
        // Muestro el ordenador creado
        System.out.println(o1);
        System.out.println(o1.calcularPrecio());
    }
}
