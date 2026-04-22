package uce.edu.api.facturacion;

public interface Notificador {

    void enviar(String destino, String mensaje);
}