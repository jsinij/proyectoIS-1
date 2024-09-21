package heladosPaTodos;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Map<Producto, Integer> productosSolicitados;
    
    public Pedido() {
        this.productosSolicitados = new HashMap<>();
    }
    
    public void agregarProducto(Producto producto, int cantidad) {
        productosSolicitados.put(producto, cantidad);
    }

    public Map<Producto, Integer> getProductosSolicitados() {
        return productosSolicitados;
    }
}