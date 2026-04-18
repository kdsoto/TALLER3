package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprabanteSelector {

    @Inject
    private ComprabantePDF pdf;
    @Inject 
    private ComprobanteFisico factura;

    public Comprobante seleccionar(String destino) {
        if (destino == null) {
            return factura;
        }
        return pdf;
    }

}
