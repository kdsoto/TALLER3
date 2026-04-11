package uce.edu.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private PedidoService service;
 
        @Override
        public int run(String... args) throws Exception {

            Pedido pedido = new Pedido(
                    "Dylan Soto", "Laptop", 
                    1200.00, "dylan@gmail.com");
            this.service.registar(pedido);

            return 0;
        }
    }

}
