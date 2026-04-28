package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesarServiceTiempo procesarServiceTiempo;

        @Inject
        private InventarioService inventarioService;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String... args) {
            Venta venta1 = new Venta("Dylan", 70.0);
            this.procesarServiceTiempo.procesar(venta1);
            this.procesarServiceTiempo.reProcesando(venta1);

            Producto producto1 = new Producto("Coca Cola", 2.5);
            this.inventarioService.RegistarInventario(producto1);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;
        }
    }

}
