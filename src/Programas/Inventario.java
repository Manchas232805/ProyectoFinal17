package Programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    private final ArrayList<String> tiposValidos = new ArrayList<>(
            Arrays.asList("Snack", "Bebida", "Dulce", "Lácteo", "Otro")
    );

    public void registrarProducto(Scanner lectura) {
        System.out.print("Ingrese el código del producto: ");
        int codigo = lectura.nextInt();
        lectura.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = lectura.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = lectura.nextDouble();

        System.out.print("Ingrese la cantidad en stock: ");
        int cantidadStock = lectura.nextInt();
        lectura.nextLine();

        String tipo;
        do {
            System.out.println("Seleccione el tipo de producto:");
            System.out.println("1. Snack");
            System.out.println("2. Bebida");
            System.out.println("3. Dulce");
            System.out.println("4. Lácteo");
            System.out.println("5. Otro");
            System.out.print("Ingrese el número correspondiente al tipo: ");
            int opcionTipo = lectura.nextInt();
            lectura.nextLine();

            switch (opcionTipo) {
                case 1:
                    tipo = "Snack";
                    break;
                case 2:
                    tipo = "Bebida";
                    break;
                case 3:
                    tipo = "Dulce";
                    break;
                case 4:
                    tipo = "Lácteo";
                    break;
                case 5:
                    tipo = "Otro";
                    break;
                default:
                    tipo = null;
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (tipo == null);

        Producto producto = new Producto(codigo, nombre, precio, cantidadStock, tipo);
        productos.add(producto);
        System.out.println("Producto registrado con éxito.");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("Lista de productos:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }
}
