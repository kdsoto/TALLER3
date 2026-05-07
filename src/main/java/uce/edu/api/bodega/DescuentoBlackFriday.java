package uce.edu.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class DescuentoBlackFriday implements Descuento {

    @Override
    public double aplicarDescuento(double valor) {
        System.out.println("Aplicando descuento Black Friday del 35%");
        double valorDescuento = valor * 0.35;
        return valor - valorDescuento;
    }

}
