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

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Inject
        private AmbitoRequest ambitoRequest;

        @Inject
        private AmbitoInject ambitoInject;

        @Inject
        private AmbitoSingleton ambitoSingleton;

        @Override
        public int run(String... args) {

            System.out.println(this.ambitoAplicacion.incrementarContador());
            System.out.println("este valor: " + this.ambitoAplicacion.incrementarContador());
            System.out.println("este valor: " + this.ambitoAplicacion.incrementarContador());
            System.out.println("este valor: " + this.ambitoAplicacion.incrementarContador());
            System.out.println("---------------");

            this.claseIntermedia.imprimirObjetoValor();

            //Request es solo para ambito web
            /*System.out.println("-----------------");
            System.out.println("AMBITO REQUEST");
            System.out.println(this.ambitoRequest.incrementarContador());
            System.out.println(this.ambitoRequest.incrementarContador());
            System.out.println(this.ambitoRequest.incrementarContador());*/

            //AMBITO DEPENDENT
            System.out.println("*******AMBITO DEPENDENT************");
            System.out.println(this.ambitoInject.incrementarContador());
            System.out.println(this.ambitoInject.incrementarContador());
            System.out.println(this.ambitoInject.incrementarContador());

            this.claseIntermedia.imprimirObjetoValorInject();

            //AMBITO SINGLETON
            System.out.println("*******AMBITO SINGLETON************");
            System.out.println(this.ambitoSingleton.incrementarContador());
            System.out.println(this.ambitoSingleton.incrementarContador());
            System.out.println(this.ambitoSingleton.incrementarContador());

            this.claseIntermedia.imprimirObjetoValorSingleton();
            return 0;
        }
    }

}
