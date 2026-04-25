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
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Inject
        private ProcesadorVentaLinea procesadorVentaLinea;
        @Override
        public int run(String... args) {
            Venta venta1 = new Venta("Dylan", 70.0);
            this.procesadorVentaService.procesar(venta1);

            Venta venta2 = new Venta("Maria", 40.0);
            this.procesadorVentaService.procesar(venta2);

            Venta venta3 = new Venta("Carlos", 20.0);
            this.procesadorVentaService.procesar(venta3);

            Venta venta4 = new Venta("Ana", 100.0);
            this.procesadorVentaService1.procesar(venta4);

            Venta venta5 = new Venta("Luis", 50.0);
            this.procesadorVentaService1.procesar(venta5);

            Venta venta6 = new Venta("Elena", 80.0);
            this.procesadorVentaLinea.procesar(venta6);

            Venta venta7 = new Venta("Jorge", 60.0);
            this.procesadorVentaLinea.procesar(venta7);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;
        }
    }

}
