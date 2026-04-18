package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoTC implements PagoEstrategia {

    @Override
    public void ejecutarPago(double valor) {
        System.out.println("Presenta una pantalla TC" + "\n" + "Realizando cobro");
    }

}
