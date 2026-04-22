package uce.edu.api.facturacion;

import jakarta.enterprise.context.Dependent;

@Dependent
public class NotificadorSMS implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("📱 Enviando factura por SMS a: " + destino);
        System.out.println("Mensaje: " + mensaje);
    }
}