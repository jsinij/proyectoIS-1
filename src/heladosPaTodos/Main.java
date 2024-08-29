package heladosPaTodos;

import java.util.Scanner;

public class Main {

    private static Inventario inventario;
    private static Usuario usuarioAdmin;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear usuario administrador por defecto
        usuarioAdmin = new Usuario();
        usuarioAdmin.setNombre("admin");
        usuarioAdmin.setContraseña("admin123");
        usuarioAdmin.setTipo("admin");
        
        // Inicializar inventario
        inventario = new Inventario(usuarioAdmin);

        // Interfaz de login
        if (login(scanner)) {
            mostrarMenu(scanner);
        } else {
            System.out.println("Credenciales incorrectas. Saliendo del sistema.");
        }
        
        scanner.close();
    }
    
    private static boolean login(Scanner scanner) {
        System.out.println("Iniciar sesión:");
        System.out.print("Nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();
        
        // Verificar credenciales
        return nombre.equals(usuarioAdmin.getNombre()) && contraseña.equals(usuarioAdmin.getContraseña());
    }

    private static void mostrarMenu(Scanner scanner) {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar disponibilidad de productos");
            System.out.println("2. Registrar productos vendidos");
            System.out.println("3. Registrar productos abiertos");
            System.out.println("4. Programar apertura de productos");
            System.out.println("5. Registrar producto");
            System.out.println("6. Mostrar SKU disponibles");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    consultarDisponibilidad();
                    break;
                case 2:
                    registrarProductoVendido(scanner);
                    break;
                case 3:
                    registrarProductoAbierto(scanner);
                    break;
                case 4:
                    programarApertura(scanner);
                    break;
                case 5:
                    registrarProducto(scanner);
                    break;
                case 6:
                	 mostrarSkuDispobible();
                	 break;
                case 7:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
    
    private static void consultarDisponibilidad() {
        System.out.println("Consultando disponibilidad...");
        inventario.mostrarInventario();
    }
    
    private static void registrarProductoVendido(Scanner scanner) {
        System.out.print("Ingrese el sabor del producto (chocolate, vainilla, fresa): ");
        String sabor = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese la presentación del producto (5, 10): ");
        String presentacion = scanner.nextLine();
        
        inventario.venderProducto(sabor, presentacion);
        System.out.println("Producto registrado como vendido.");
    }
    
    private static void registrarProductoAbierto(Scanner scanner) {
        System.out.print("Ingrese el sabor del producto (chocolate, vainilla, fresa): ");
        String sabor = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese la presentación del producto (5, 10): ");
        String presentacion = scanner.nextLine();
        
        inventario.abrirProducto(sabor, presentacion);
        System.out.println("Producto registrado como abierto.");
    }
    
    private static void programarApertura(Scanner scanner) {
        System.out.print("Ingrese el sabor del producto (chocolate, vainilla, fresa): ");
        String sabor = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese la presentación del producto (5, 10): ");
        String presentacion = scanner.nextLine();
        
        inventario.programarApertura(sabor, presentacion);
        System.out.println("Producto programado para apertura.");
    }

    private static void registrarProducto(Scanner scanner) {
        System.out.print("Ingrese el código SKU del producto (101 a 109): ");
        int sku = scanner.nextInt();
        scanner.nextLine();
        
        inventario.agregarProducto(sku);
        System.out.println("Producto registrado.");
    }
    private static void mostrarSkuDispobible() {
        System.out.println("SKU Disponibles:");
        System.out.println("101: Sabor Chocolate, CremHelado, 10 Litros");
        System.out.println("102: Sabor Chocolate, CremHelado, 5 Litros");
        System.out.println("103: Sabor Chocolate, Colombina, 10 Litros");
        System.out.println("104: Sabor Chocolate, Colombina, 5 Litros");
        System.out.println("105: Sabor Vainilla, CremHelado, 10 Litros");
        System.out.println("106: Sabor Vainilla, CremHelado, 5 Litros");
        System.out.println("107: Sabor Vainilla, Colombina, 10 Litros");
        System.out.println("108: Sabor Vainilla, Colombina, 5 Litros");
        System.out.println("109: Sabor Fresa, CremHelado, 10 Litros");
        System.out.println("110: Sabor Fresa, CremHelado, 5 Litros");
        System.out.println("111: Sabor Fresa, Colombina, 10 Litros");
        System.out.println("112: Sabor Fresa, Colombina, 5 Litros");
    }
}