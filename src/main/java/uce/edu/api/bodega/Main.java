package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        // Modelos de IoC
        // 1.DI

        @Inject
        private PedidoService service;

        // 2. Service locator

        // private PedidoService pedidoService =
        // CDI.current().select(PedidoService.class).get();

        @Inject
        private PagoTC pagoTc;

        @Inject
        private PagoEfectivo pagoEfectivo;

        @Override
        public int run(String... args) throws Exception {

            Pedido pedido = new Pedido(
                    "Dylan Soto", "Laptop",

                    1200.00, "dylan@gmail.com");
            service.registar(pedido, pagoEfectivo);
            System.out.println("--------------------------------------------------");

            Pedido pedido1 = new Pedido(
                    "Dylan Soto", "Laptop",
                    89.00,null);
            service.registar(pedido1, pagoTc);
            System.out.println("--------------------------------------------------");

            Pedido pedido2 = new Pedido(
                    "Dylan Soto", "Laptop",
                    49.99, "dylan@gmail.com");
            service.registar(pedido2, pagoEfectivo);
            System.out.println("--------------------------------------------------");
            return 0;
        }
    }

    public void tipoComprobante(){

    }

}
