package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {
    /*
     * //@Inject
     * private NotificadorMail notificadorMail;
     * 
     * //DI por constructor
     * 
     * @Inject
     * public PedidoService(NotificadorMail notificadorMail) {
     * this.notificadorMail = notificadorMail;
     * 
     * }
     */
    /*
     * //DI POR ATRIBUTO
     * 
     * @Inject
     * private NotificadorMail notificadorMail;
     */
    /*
     * // DI POR METODO setter -> menos usada
     * private NotificadorMail notificadorMail;
     * 
     * @Inject
     * 
     * public void setNotificadorMail(NotificadorMail notificadorMail) {
     * this.notificadorMail = notificadorMail;
     * }
     */

    @Inject
    private NotificadorSelector selector;

    private PagoEstrategia pago;

    public void registar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        this.pago.ejecutarPago(pedido.getTotal());

        // sin inyeccion de dependencias
        // NotificadorMail notificadorMail = new NotificadorMail();
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Pedido registrado con exito");
    }

}
