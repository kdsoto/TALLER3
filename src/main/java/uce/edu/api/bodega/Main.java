package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
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

        private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) throws Exception {

            Pedido pedido = new Pedido(
                    "Dylan Soto", "Laptop",

                    1200.00, "dylan@gmail.com");
            pedidoService.registar(pedido);

            Pedido pedido1 = new Pedido(
                    "Dylan Soto", "Laptop",
                    89.00, "dylan@gmail.com");
            pedidoService.registar(pedido1);

            Pedido pedido2 = new Pedido(
                    "Dylan Soto", "Laptop",
                    49.99, "dylan@gmail.com");
            pedidoService.registar(pedido2);

            return 0;
        }
    }

}
