package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements Comprobante {

    @Override
    public String generarComprobante(Pedido pedido) {
        return "Comprobante físico generado para el pedido de " + pedido.getCliente() + " por el producto " + pedido.getProducto() + " con un total de " + pedido.getTotal();
    }

}
