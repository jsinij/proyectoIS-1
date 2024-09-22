package heladosPaTodos;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
}
