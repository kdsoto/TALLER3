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
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String... args) {
            Venta venta1 = new Venta("Dylan", 70.0);
            this.procesadorVentaService.procesar(venta1);

            Venta venta2 = new Venta("Maria", 40.0);
            this.procesadorVentaService.procesar(venta2);

            Venta venta3 = new Venta("Carlos", 20.0);
            this.procesadorVentaService.procesar(venta3);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;
        }
    }

}
