package uce.edu.api.facturacion;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class NotificadorSelector {

    @Inject
    private NotificadorEmail email;

    @Inject
    private NotificadorSMS sms;

    public Notificador seleccionar(String tipo) {
        if ("sms".equalsIgnoreCase(tipo)) {
            return sms;
        }
        return email;
    }
}