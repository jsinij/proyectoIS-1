package heladosPaTodos;

import java.util.ArrayList;

public class Inventario {

    private Usuario administrador;
    private ArrayList<Producto> aperturasProgramadas = new ArrayList<>();
    private ArrayList<Producto> abiertos = new ArrayList<>();
    private ArrayList<Producto> disponibles = new ArrayList<>();
    private ArrayList<Producto> vendidos = new ArrayList<>();

    
    public Inventario(Usuario administrador) {
        this.administrador = administrador;
    }

    public void agregarAperturaProgramada(Producto producto) {
        aperturasProgramadas.add(producto);
    }

    public void abrirProducto(Producto producto) {
        aperturasProgramadas.remove(producto);
        abiertos.add(producto);
    }

    public void hacerDisponible(Producto producto) {
        abiertos.remove(producto);
        disponibles.add(producto);
    }

    public void venderProducto(Producto producto) {
        disponibles.remove(producto);
        vendidos.add(producto);
    }

    public ArrayList<Producto> getAperturasProgramadas() {
        return aperturasProgramadas;
    }

    public ArrayList<Producto> getAbiertos() {
        return abiertos;
    }

    public ArrayList<Producto> getDisponibles() {
        return disponibles;
    }

    public ArrayList<Producto> getVendidos() {
        return vendidos;
    }

    
    public void mostrarInventario() {
        System.out.println("Aperturas Programadas: " + aperturasProgramadas.size());
        System.out.println("Abiertos: " + abiertos.size());
        System.out.println("Disponibles: " + disponibles.size());
        System.out.println("Vendidos: " + vendidos.size());
    }
}
