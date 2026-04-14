package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@SMS
public class NotificadorSMS implements Notificador {
    
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia un SMS al numero: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }
}
