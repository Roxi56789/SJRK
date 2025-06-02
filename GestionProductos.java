import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


 public class GestionProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();
        String continuar;

        do {
            // Pedir los datos del producto
            System.out.print("Ingrese el ID del producto: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consumir la línea pendiente

            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la marca del producto: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // consumir la línea pendiente

            // Crear nuevo producto y agregar a la lista
            Producto producto = new Producto(id, nombre, marca, precio);
            listaProductos.add(producto);

            // Preguntar si desea agregar otro producto
            System.out.print("¿Desea agregar otro producto? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar productos usando un iterator
        System.out.println("\nLista de productos:");
        Iterator<Producto> it = listaProductos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        scanner.close();
    }
}


