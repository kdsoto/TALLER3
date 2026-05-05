package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoBlackFriday implements Descuento {

    @Override
    public double aplicarDescuento(double valor) {
        System.out.println("Aplicando descuento Black Friday del 35%");
        double valorDescuento = valor * 0.35;
        return valor - valorDescuento;
    }

}
