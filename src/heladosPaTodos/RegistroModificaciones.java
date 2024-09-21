package heladosPaTodos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroModificaciones {
    private String usuario;
    private String accion;
    private String timestamp;

    public RegistroModificaciones(String usuario, String accion) {
        this.usuario = usuario;
        this.accion = accion;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public String getUsuario() {
        return usuario;
    }

    public String getAccion() {
        return accion;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + ", Acción: " + accion + ", Fecha y hora: " + timestamp;
    }
}
