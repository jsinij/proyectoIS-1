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
    private static int id;
    private int identificador = 1;
    
    // Este atributo solo se usará con los productos base
    // (Los que están en la tabla de sku)
    private Queue cola;
    

    public Producto(String sabor, String presentacion, String marca, int sku) {
        this.sabor = sabor;
        this.presentacion = presentacion;
        this.marca = marca;
        this.fechaIngreso = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sku = sku;
        this.fechaApertura = "NO ABIERTO";
        this.fechaVenta = "NO VENDIDO";	
        this.identificador = id;
        asignarId();
        //this.setEstado("disponible");
       
    }
    
    public Producto(String sabor, String presentacion, String marca, int sku, Queue cola) {
        this.sabor = sabor;
        this.presentacion = presentacion;
        this.marca = marca;
        this.fechaIngreso = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sku = sku;
        this.fechaApertura = "NO ABIERTO";
        this.fechaVenta = "NO VENDIDO";	
        this.cola = cola;
        //this.setEstado("disponible");
       
    }
    
    public static void asignarId() {
    	if (id == 100){
    		id = 1;
    	}
    	else {
    		id += 1;
    	}
    }
    
    

    public Queue getCola() {
		return cola;
	}

	public void setCola(Queue cola) {
		this.cola = cola;
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
	
	public void abrir() { 
		this.fechaApertura = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	public void vender() {
		this.fechaVenta = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
	
	


	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Producto.id = id;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return 	"||||||||||||||||||||||||" + "\n" +
				"Caja de " + this.getSabor() + "\n" +
				"Marca: " + this.getMarca() + "\n" +
				"Presentación: " + this.getPresentacion() + " litros" + "\n" +
				"Fecha de ingreso: " + this.getFechaIngreso() + "\n" +
				"Fecha de venta: " + this.getFechaVenta() + "\n" +
				"Fecha de apertura: " + this.getFechaApertura() + "\n" +
				"IDENTIFICADOR: " + this.getIdentificador() + "\n" +
				"||||||||||||||||||||||||" + "\n";
 	}
	
	
}
