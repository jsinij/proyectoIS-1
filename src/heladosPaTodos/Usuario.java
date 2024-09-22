package heladosPaTodos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	protected String nombre;
	protected String tipo;
	protected String contraseña;
	protected String documento;
	protected List<String> permisos;
	protected List<RegistroModificaciones> registros;

    public Usuario(String nombre, String tipo, String contraseña, String documento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.contraseña = contraseña;
        this.documento = documento;
        this.permisos = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void agregarPermiso(String permiso) {
        this.permisos.add(permiso);
    }

    public void removerPermiso(String permiso) {
        this.permisos.remove(permiso);
    }

    public List<RegistroModificaciones> getRegistros() {
        return registros;
    }

    public void registrarAccion(String accion) {
        RegistroModificaciones registro = new RegistroModificaciones(this.nombre, accion);
        this.registros.add(registro);
    }
}
