package uce.edu.api.facturacion;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FacturadorService {

    @Inject
    private Notificador notificador;

    public void facturar(Cliente cliente) {
        System.out.println("Generando factura...");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total: " + cliente.getTotal());
        System.out.println("Guardando factura en la base de datos");

        notificador.enviar(
            cliente.getCorreo(),
            "Su factura ha sido generada correctamente"
        );
    }
}