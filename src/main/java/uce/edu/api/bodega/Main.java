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
        private ProcesadorCompraService compraService;
        @Override
        public int run(String... args) {
            Compra compra = new Compra("Dylan", 100.0);
            this.compraService.procesar(compra);
            return 0;
        }
    }

}
