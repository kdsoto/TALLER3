package uce.edu.api.bodega;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class AmbitoRequest {
    //solo aplicacion web
    private int contador = 0;

    public int incrementarContador() {
        return contador++;
    }
}
