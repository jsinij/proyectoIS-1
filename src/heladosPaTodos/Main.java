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
        byte opcion;
        
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Consultar disponibilidad de productos");
            System.out.println("2. Registrar productos vendidos");
            System.out.println("3. Registrar productos abiertos");
            System.out.println("4. Programar apertura de productos");
            System.out.println("5. Registrar producto");
            System.out.println("6. Mostrar SKU");
            System.out.println("7. Mostrar apertura programada");
            System.out.println("8. Mostrar productos abiertos");
            System.out.println("9. Mostrar productos vendidos");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
           
            opcion = scanner.nextByte();
            //scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    inventario.mostrarDisponible();
                    break;
                case 2:
                    inventario.venderProducto();
                    break;
                case 3:
                    inventario.abrirProducto();
                    break;
                case 4:
                    inventario.programarApertura();
                    break;
                case 5:
                    inventario.agregarProducto();
                    break;
                case 6:
                	 inventario.mostrarSku();
                	 break;
                case 7:
                	 inventario.mostrarApertura();
                	 break;
                case 8:
                	inventario.mostrarAbierto();
                	break;
                case 9:
                	inventario.mostrarVendido();
                	break;
                case 10:
                    opcion = 0;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while (opcion != 0);
    }
    
    
        
    
   


   
}