package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    @Inject
    private NotificadorMail notificadorMail;

    public void registar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        // sin inyeccion de dependencias
        // NotificadorMail notificadorMail = new NotificadorMail();
        notificadorMail.enviarMail(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");
    }

}
