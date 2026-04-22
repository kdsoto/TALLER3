package uce.edu.api.facturacion;

import jakarta.enterprise.context.Dependent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Dependent
public class Cliente {
    private String nombre;
    private String producto;
    private double total;
    private String correo;
}