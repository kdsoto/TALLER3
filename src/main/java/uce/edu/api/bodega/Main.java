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
        private AmbitoAplicacion ambitoAplicacion;

        @Override
        public int run(String... args){
            this.ambitoAplicacion.incrementarContador();
            this.ambitoAplicacion.incrementarContador();
            this.ambitoAplicacion.incrementarContador();
            int valor=this.ambitoAplicacion.incrementarContador();
            System.out.println("este valor: "+valor);
            System.out.println("---------------");
            return 0;
        }
    }

   

}
