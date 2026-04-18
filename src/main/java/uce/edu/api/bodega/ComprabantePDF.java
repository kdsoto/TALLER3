package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprabantePDF implements Comprobante {

    public String generarComprobante(Pedido pedido) {
        return "Comprobante PDF generado para el pedido de " + pedido.getCliente() + " por el producto " + pedido.getProducto() + " con un total de " + pedido.getTotal();
    }

}
