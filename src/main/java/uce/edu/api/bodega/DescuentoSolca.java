package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSolca implements Descuento {

    @Override
    public double aplicarDescuento(double valor) {
        System.out.println("Aplicando descuento SOLCA del 20%");
        double valorDescuento = valor * 0.20;
        return valor - valorDescuento;
    }

}
