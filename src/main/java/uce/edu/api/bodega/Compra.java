package uce.edu.api.bodega;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Compra {

    private String cliente;
    private Double subTotal;
    private Double total;

    public Compra(String cliente, Double subTotal) {
        this.cliente = cliente;
        this.subTotal = subTotal;
    }
}
