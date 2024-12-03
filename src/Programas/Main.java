package Programas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Boleta boleta = new Boleta();
        int opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Comprar producto");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    inventario.registrarProducto(lectura);
                    break;
                case 2:
                    inventario.mostrarProductos();
                    break;
                case 3:
                    System.out.print("Ingrese el código del producto a comprar: ");
                    int codigo = lectura.nextInt();
                    Producto producto = inventario.buscarProductoPorCodigo(codigo);
                    if (producto != null) {
                        System.out.print("Ingrese la cantidad a comprar: ");
                        int cantidad = lectura.nextInt();
                        if (cantidad <= producto.getCantidadStock()) {
                            boleta.agregarProducto(producto, cantidad);
                            System.out.println("Producto añadido a la boleta.");
                        } else {
                            System.out.println("Stock insuficiente.");
                        }
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Generando boleta...");
                    boleta.imprimirBoleta();
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        lectura.close();
    }
}
