package uce.edu.api.facturacion;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("📧 Enviando factura por EMAIL a: " + destino);
        System.out.println("Mensaje: " + mensaje);
    }
}