package uce.edu.api.facturacion;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaRepository {

    public void guardar(Cliente cliente) {
        System.out.println("Factura guardada en la base de datos para: " + cliente.getNombre());
    }
}