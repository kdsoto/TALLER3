package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
    public class PagoEfectivo implements PagoEstrategia {

    @Override
    public void ejecutarPago(double valor) {
        System.out.println("Presenta una pantalla Efectivo"+"\n"+"Realizando cobro");
    }

}
