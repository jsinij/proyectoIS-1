package heladosPaTodos;
//Los array son para representar los deque XD//
import java.util.ArrayList;

public class Producto {
    private String sabor;
    private double precio;
    private String fechaIngreso;
    private String sku;
    private String estado; //disponible, abierto, vendido
    
    private static ArrayList<Producto> chocolate = new ArrayList<>();
    private static ArrayList<Producto> vainilla = new ArrayList<>();
    private static ArrayList<Producto> fresa = new ArrayList<>();

    public Producto(String sabor, double precio, String fechaIngreso) {
        this.sabor = sabor;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
        this.sku = asignarSKU(sabor);
        this.setEstado("disponible");
        agregarAListaCorrespondiente();
    }

    private String asignarSKU(String sabor) {
        switch (sabor.toLowerCase()) {
            case "chocolate":
                return "CHO123";
            case "fresa":
                return "FRE54";
            case "vainilla":
                return "VAI999";
            default:
                return "SKU_DESCONOCIDO";
        }
    }

    private void agregarAListaCorrespondiente() {
        switch (sabor.toLowerCase()) {
            case "chocolate":
                chocolate.add(this);
                break;
            case "fresa":
                fresa.add(this);
                break;
            case "vainilla":
                vainilla.add(this);
                break;
        }
    }

    public String getSabor() {
        return sabor;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getSKU() {
        return sku;
    }

    public static ArrayList<Producto> getChocolate() {
        return chocolate;
    }

    public static ArrayList<Producto> getVainilla() {
        return vainilla;
    }

    public static ArrayList<Producto> getFresa() {
        return fresa;
    }

    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("SKU: " + sku);
    }

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
