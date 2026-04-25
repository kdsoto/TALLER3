package uce.edu.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@ApplicationScoped
public class TrakingVenta {

    private long tiempoInicio = 0;
    private long tiempoFin = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public void reiniciar() {
        this.tiempoInicio = 0;
        this.tiempoFin = 0;
        this.tiempoTotalAcumulado = 0;
        this.numeroOperaciones = 0;
    }
    public void finalizar() {
        this.tiempoFin = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFin - tiempoInicio;
        this.tiempoTotalAcumulado += tiempoEjecucion;
        this.numeroOperaciones++;
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");
        System.out.println("Tiempo total acumulado: " + this.tiempoTotalAcumulado + " ms");
        System.out.println("Número de operaciones: " + this.numeroOperaciones);
    }

}
