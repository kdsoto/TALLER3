package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

//esta clase va a gestionar el envio de mails, es decir, va a ser la encargada de enviar los mails a los clientes cuando se realice un pedido
@ApplicationScoped
@Mail
public class NotificadorMail implements Notificador {
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia el mail al correo: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }
}
