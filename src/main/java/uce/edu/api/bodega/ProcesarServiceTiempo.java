package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesarServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void procesar(Venta venta) {

        System.out.println("Procesando venta...");
        // Consultando el stock de cada item
        // Consultando en la base de datos
        // Finaliza la venta
        // voy a simular un proceso que tarda 2 segundos
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registramos las estadisticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }

    @MedirTiempo
    public void reProcesando(Venta venta) {
        System.out.println("Reprocesar venta...");
        // Consultando el stock de cada item
        // Consultando en la base de datos
        // Finaliza la venta
        // voy a simular un proceso que tarda 2 segundos
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registramos las estadisticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }
}
