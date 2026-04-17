package uce.edu.api.facturacion;

public class Cliente {

    private String nombre;
    private String producto;
    private double total;
    private String correo;

    public Cliente() {}

    public Cliente(String nombre, String producto, double total, String correo) {
        this.nombre = nombre;
        this.producto = producto;
        this.total = total;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}