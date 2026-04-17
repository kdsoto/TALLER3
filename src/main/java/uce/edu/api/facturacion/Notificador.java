package uce.edu.api.facturacion;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Notificador {

    public void enviar(String correo, String mensaje) {
        System.out.println("Enviando factura al correo: " + correo);
        System.out.println("Mensaje: " + mensaje);
    }
}