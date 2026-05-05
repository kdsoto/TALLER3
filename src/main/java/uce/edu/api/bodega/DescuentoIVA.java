package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoIVA implements Descuento {

    @Override
    public double aplicarDescuento(double valor) {
        double valorDescontar = valor * 0.15;
        System.out.println("Aplicando descuento IVA del 15%");
        return valor - valorDescontar;
        // return valor * 1.15;
    }

}
