package uce.edu.api.facturacion;

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
        FacturadorService service;

        @Override
        public int run(String... args) {

            Cliente cliente = Cliente.builder()
                    .nombre("Dylan Soto")
                    .producto("Laptop")
                    .total(1200.00)
                    .correo("dylan@gmail.com")
                    .build();

            service.facturar(cliente);

            return 0;
        }
    }
}