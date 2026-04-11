package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

//esta clase va a gestionar el envio de mails, es decir, va a ser la encargada de enviar los mails a los clientes cuando se realice un pedido
@ApplicationScoped
public class NotificadorMail {
 public void enviarMail(String correo, String mensaje) {
        System.out.println("Se envia el mail al correo: " + correo);
        System.out.println("Con el mensaje: " + mensaje);
    }
}
