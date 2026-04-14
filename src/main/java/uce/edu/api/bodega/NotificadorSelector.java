package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    @Mail
    private Notificador mail;
    @Inject
    @SMS
    private Notificador sms;

    public Notificador seleccionar(double monto) {
        if (monto > 100) {
            return mail;
        } else {
            return sms;
        }
    }
}
