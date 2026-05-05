package uce.edu.api.bodega;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos;

    public void procesar(Compra compra){

        double total= compra.getSubTotal();
        for(Descuento des: descuentos){
            total =des.aplicarDescuento(total);
            
        }
        compra.setTotal(total);

        System.out.println("Su valor a pagar es: " + compra.getTotal());

    }
}
