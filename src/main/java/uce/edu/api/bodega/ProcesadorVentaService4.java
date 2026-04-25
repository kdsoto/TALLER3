package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService4 {
    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    //Aqui como se inyecto TrakingVenta se crea un objeto
    @Inject
    private TrakingVenta trakingVenta;

    public void procesar(Venta venta) {
        this.trakingVenta.iniciar();
        // Iniciar la venta
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
        this.trakingVenta.finalizar();

        // Registramos las estadisticas globales
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }
}
