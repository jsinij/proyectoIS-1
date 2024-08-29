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
    private String fechaApertura;
    private String fechaVenta;
    

    public Producto(String sabor, String presentacion, String marca, int sku) {
        this.sabor = sabor;
        this.presentacion = presentacion;
        this.marca = marca;
        this.fechaIngreso = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sku = sku;
        this.fechaApertura = "NO ABIERTO";
        this.fechaVenta = "NO VENDIDO";		
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
	
	


	public int getSku() {
		return sku;
	}


	public void setSku(int sku) {
		this.sku = sku;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPresentacion() {
		return presentacion;
	}


	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	


	public String getFechaApertura() {
		return fechaApertura;
	}


	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}


	public String getFechaVenta() {
		return fechaVenta;
	}


	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}


	@Override
	public String toString() {
		return 	"||||||||||||||||||||||||" + "\n" +
				"Caja de " + this.getSabor() + "\n" +
				"Presentación " + this.getPresentacion() + "litros" + "\n" +
				"Fecha de ingreso " + this.getFechaIngreso() + "\n" +
				"Fecha de venta " + this.getFechaVenta() + "\n" +
				"Fecha de apertura " + this.getFechaApertura() + "\n" +
				"||||||||||||||||||||||||" + "\n";
 	}
	
	
}
