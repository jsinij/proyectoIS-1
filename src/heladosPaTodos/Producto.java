package heladosPaTodos;
//Los array son para representar los deque XD//
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto {
    private String sabor;
    private String fechaIngreso;
    private int sku;
    private String estado; //disponible, abierto, vendido
    private String marca;
    private String presentacion;
    

    public Producto(String sabor, String presentacion, String marca, int sku) {
        this.sabor = sabor;
        this.presentacion = presentacion;
        this.marca = marca;
        this.fechaIngreso = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sku = sku;
        //this.setEstado("disponible");
       
    }


    public String getSabor() {
        return sabor;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public int getSKU() {
        return sku;
    }


    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        
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
