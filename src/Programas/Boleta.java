package Programas;

import java.util.ArrayList;

public class Boleta {
    private ArrayList<Producto> productosComprados = new ArrayList<>();
    private ArrayList<Integer> cantidades = new ArrayList<>();

    public void agregarProducto(Producto producto, int cantidad) {
        productosComprados.add(producto);
        cantidades.add(cantidad);
        producto.disminuirStock(cantidad);
    }

    public void imprimirBoleta() {
        System.out.println("*** BOLETA DE COMPRA ***");
        double total = 0;
        for (int i = 0; i < productosComprados.size(); i++) {
            Producto producto = productosComprados.get(i);
            int cantidad = cantidades.get(i);
            double subtotal = producto.getPrecio() * cantidad;
            System.out.println(producto.getNombre() + " (" + producto.getTipo() + ") x" + cantidad +
                    " - Subtotal: S/ " + subtotal);
            total += subtotal;
        }
        System.out.println("Total a pagar: S/ " + total);
        System.out.println("Gracias por su compra.");
    }
}
