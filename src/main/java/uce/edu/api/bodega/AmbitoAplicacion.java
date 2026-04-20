package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AmbitoAplicacion {
    private int contador = 0;

    public int incrementarContador() {
        return contador++;
    }

}
