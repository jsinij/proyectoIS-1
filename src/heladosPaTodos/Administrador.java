import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

//Aca esta todo lo de la 10 funcionalidad 
public class Administrador extends Usuario {
    private Map<String, Usuario> usuarios;

    public Administrador(String nombre, String contraseña, String documento) {
        super(nombre, "Administrador", contraseña, documento);
        this.usuarios = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNombre(), usuario);
        this.registrarAccion("Agregado usuario: " + usuario.getNombre());
    }

    public Usuario obtenerUsuario(String nombre) {
        return usuarios.get(nombre);
    }

    public void eliminarUsuario(String nombre) {
        if (usuarios.containsKey(nombre)) {
            usuarios.remove(nombre);
            this.registrarAccion("Eliminado usuario: " + nombre);
        }
    }

    public void modificarTipoUsuario(String nombre, String nuevoTipo) {
        Usuario usuario = usuarios.get(nombre);
        if (usuario != null) {
            usuario.setTipo(nuevoTipo);
            this.registrarAccion("Modificado tipo de usuario a: " + nuevoTipo + " para usuario: " + nombre);
        }
    }

    public void agregarPermisoUsuario(String nombre, String permiso) {
        Usuario usuario = usuarios.get(nombre);
        if (usuario != null) {
            usuario.agregarPermiso(permiso);
            this.registrarAccion("Agregado permiso: " + permiso + " a usuario: " + nombre);
        }
    }

    public void removerPermisoUsuario(String nombre, String permiso) {
        Usuario usuario = usuarios.get(nombre);
        if (usuario != null) {
            usuario.removerPermiso(permiso);
            this.registrarAccion("Removido permiso: " + permiso + " de usuario: " + nombre);
        }
    }

    public List<RegistroModificaciones> obtenerRegistrosUsuario(String nombre) {
        Usuario usuario = usuarios.get(nombre);
        return usuario != null ? usuario.getRegistros() : null;
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios.values()) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Tipo: " + usuario.getTipo());
            System.out.println("Permisos: " + usuario.getPermisos());
            System.out.println("Registros:");
            for (RegistroModificaciones registro : usuario.getRegistros()) {
                System.out.println(registro);
            }
        }
    }

    public void menuAdministrador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Administrador, ingrese su clave: ");
        
        String contraseñaIngresada = scanner.nextLine();
        
        // Verifica si la contraseña ingresada es igual a la contraseña del administrador
        if (contraseñaIngresada.equals(this.getContraseña())) {
            int opcion;
            do {
                System.out.println("\n--- Menú Administrador ---");
                System.out.println("1. Mostrar usuarios");
                System.out.println("2. Agregar usuario");
                System.out.println("3. Eliminar usuario");
                System.out.println("4. Modificar tipo de usuario");
                System.out.println("5. Agregar permiso a usuario");
                System.out.println("6. Remover permiso de usuario");
                System.out.println("7. Obtener registros de usuario");
                System.out.println("0. Salir");
                
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        mostrarUsuarios();
                        break;
                    case 2:
                        // Lógica para agregar un usuario
                        System.out.print("Ingrese nombre del nuevo usuario: ");
                        String nombre = scanner.nextLine();
                        // Aquí deberías tener lógica para definir la contraseña y el documento del nuevo usuario
                        // Por simplicidad, crearemos un usuario básico
                        Usuario nuevoUsuario = new Usuario(nombre, "Usuario", "contraseña", "documento");
                        agregarUsuario(nuevoUsuario);
                        break;
                    case 3:
                        // Lógica para eliminar un usuario
                        System.out.print("Ingrese nombre del usuario a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        eliminarUsuario(nombreEliminar);
                        break;
                    case 4:
                        // Lógica para modificar tipo de usuario
                        System.out.print("Ingrese nombre del usuario: ");
                        String nombreModificar = scanner.nextLine();
                        System.out.print("Ingrese nuevo tipo: ");
                        String nuevoTipo = scanner.nextLine();
                        modificarTipoUsuario(nombreModificar, nuevoTipo);
                        break;
                    case 5:
                        // Lógica para agregar permiso a usuario
                        System.out.print("Ingrese nombre del usuario: ");
                        String nombreAgregarPermiso = scanner.nextLine();
                        System.out.print("Ingrese permiso a agregar: ");
                        String permiso = scanner.nextLine();
                        agregarPermisoUsuario(nombreAgregarPermiso, permiso);
                        break;
                    case 6:
                        // Lógica para remover permiso de usuario
                        System.out.print("Ingrese nombre del usuario: ");
                        String nombreRemoverPermiso = scanner.nextLine();
                        System.out.print("Ingrese permiso a remover: ");
                        String permisoRemover = scanner.nextLine();
                        removerPermisoUsuario(nombreRemoverPermiso, permisoRemover);
                        break;
                    case 7:
                        // Lógica para obtener registros de usuario
                        System.out.print("Ingrese nombre del usuario: ");
                        String nombreRegistros = scanner.nextLine();
                        List<RegistroModificaciones> registros = obtenerRegistrosUsuario(nombreRegistros);
                        if (registros != null) {
                            System.out.println("Registros de " + nombreRegistros + ":");
                            for (RegistroModificaciones registro : registros) {
                                System.out.println(registro);
                            }
                        } else {
                            System.out.println("Usuario no encontrado.");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del menú.");
                        break;
                    default:
                        System.out.println("Opción inválida, intente nuevamente.");
                }
            } while (opcion != 0);
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}
