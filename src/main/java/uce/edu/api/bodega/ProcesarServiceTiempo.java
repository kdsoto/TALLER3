package uce.edu.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesarServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    @Log
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
        System.out.println("Finalizando venta...");
        //this.reProcesando(venta);
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
        System.out.println("Finalizando venta...");
    }
}
