package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {

    @MedirTiempo
    public void RegistarInventario(Producto producto) {
        System.out.println("Registrando inventario...");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
