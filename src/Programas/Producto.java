package Programas;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;
    private String tipo;

    public Producto(int codigo, String nombre, double precio, int cantidadStock, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public String getTipo() {
        return tipo;
    }

    public void disminuirStock(int cantidad) {
        this.cantidadStock -= cantidad;
    }

    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Tipo: " + tipo +
                ", Precio: S/ " + precio + ", Stock: " + cantidadStock;
    }
}
