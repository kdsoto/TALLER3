package uce.edu.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class DescuentoISD implements Descuento{
    @Override
    public double aplicarDescuento(double valor) {
        System.out.println("Aplicando descuento ISD del 10%");
        double valorDescuento = valor * 0.10;
        return valor - valorDescuento;
    }

}
