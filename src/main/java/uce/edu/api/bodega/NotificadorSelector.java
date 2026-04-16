package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail mail;
    @Inject
    private NotificadorSMS sms;
    @Inject
    private NotificadorWhatsApp whatsapp;

    public Notificador seleccionar(double monto) {
        if (monto <= 120 && monto >= 50) {
            return sms;
        } if(monto < 50) {
            return whatsapp;
        }
        else {
            return mail;
        }
    }
}
