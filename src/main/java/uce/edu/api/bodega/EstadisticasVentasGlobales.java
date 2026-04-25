package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@ApplicationScoped
public class EstadisticasVentasGlobales {
    private int totalVenta = 0;
    private double montoTotalVendido = 0.0;

    public void registrarVenta(double totalVentaIndividual) {
        totalVenta++;
        montoTotalVendido += totalVentaIndividual;
    }

    public void mostrarEstadisticasGlobales() {
        System.out.println("ESTADISTICAS GLOBALES:");
        System.out.println("Total de ventas: " + totalVenta);
        System.out.println("Monto total vendido: " + montoTotalVendido);
    }
}
