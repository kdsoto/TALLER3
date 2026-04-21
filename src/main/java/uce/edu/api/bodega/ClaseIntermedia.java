package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {
    @Inject
    private AmbitoAplicacion ambitoAplicacion;

    @Inject
    private AmbitoInject ambitoInject;

    @Inject
    private AmbitoSingleton ambitoSingleton;

    public void imprimirObjetoValor(){
        System.out.println(this.ambitoAplicacion);
        System.out.println(this.ambitoAplicacion.incrementarContador());
        System.out.println("---------------");

    }

     public void imprimirObjetoValorInject(){
        System.out.println(this.ambitoInject);
        System.out.println(this.ambitoInject.incrementarContador());
        System.out.println("---------------");
    }

        public void imprimirObjetoValorSingleton(){
            System.out.println(this.ambitoSingleton);
            System.out.println(this.ambitoSingleton.incrementarContador());
            System.out.println("---------------");
        }

}
