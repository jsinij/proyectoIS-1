package heladosPaTodos;
import java.util.ArrayList;

/**
 * La clase inventario representa el sistema de almacenamiento de
 * información de la heladería Helados Pa'todos.
 */

public class Inventario {

    private Usuario administrador;
    private ArrayList<Producto> aperturaProgramada = new ArrayList<>();
    private ArrayList<Producto> abierto = new ArrayList<>();
    private ArrayList<Producto> vendido = new ArrayList<>();
    private Queue chocolate_10;
    private Queue chocolate_5;
    private Queue vainilla_10;
    private Queue vainilla_5;
    private Queue fresa_10;
    private Queue fresa_5;

    
    public Inventario(Usuario administrador) {
        this.administrador = administrador;
        this.chocolate_10 = new Queue();
        this.chocolate_5 = new Queue();
        this.vainilla_10 = new Queue();
        this.vainilla_5 = new Queue();
        this.fresa_10 = new Queue();
        this.fresa_5 = new Queue();
    }

    
    public void abrirProducto(Producto producto) {
        aperturaProgramada.remove(producto);
        abierto.add(producto);
    }

    public void hacerDisponible(Producto producto) {
        abierto.remove(producto); 
    }

    public void venderProducto(Producto producto) {
       vendido.add(producto);
    }

    public ArrayList<Producto> getAperturasProgramadas() {
        return aperturaProgramada;
    }

    public ArrayList<Producto> getAbiertos() {
        return abierto;
    }

   

    public ArrayList<Producto> getVendidos() {
        return vendido;
    }

    
    public void mostrarInventario() {
        System.out.println("Productos por abrir: " + aperturaProgramada.size());
        System.out.println("Abiertos: " + abierto.size());
        System.out.println("Vendidos: " + vendido.size());
    }
    
    /**
     * Agrega un producto en la cola indicada
     * 
     * @param codigo sku del producto
     * 
     * Se manejan los sku como enteros para a futuro mejorar tiempos de ejecución
     * 
     * Para el prototipo solo se manejan 3 sabores, 2 presentaciones y 2 marcas
     */
    public void agregarProducto(int sku) {
    	
    	if ( 101 == sku) {
    		Producto producto = new Producto("chocolate", "10", "CremHelado", sku);
    		this.chocolate_10.enqueue(producto);	
    	} else if (102 == sku) {
    		Producto producto = new Producto("chocolate", "5", "CremHelado", sku);
    		this.chocolate_5.enqueue(producto);
    	} else if(103 == sku) {
    		Producto producto = new Producto("chocolate", "10", "Colombina", sku);
    		this.chocolate_10.enqueue(producto);
    	} else if(104 == sku) {
    		Producto producto = new Producto("chocolate", "5", "Colombina", sku);
    		this.chocolate_5.enqueue(producto);
    	} else if(105 == sku) {
    		Producto producto = new Producto("vainilla", "10", "CremHelado", sku);
    		this.vainilla_10.enqueue(producto);
    	} else if(106 == sku) {
    		Producto producto = new Producto("vainilla", "5", "CremHelado", sku);
    		this.vainilla_5.enqueue(producto);
    	} else if(107 == sku) {
    		Producto producto = new Producto("vainilla", "10", "Colombina", sku);
    		this.vainilla_10.enqueue(producto);
    	} else if(108 == sku) {
    		Producto producto = new Producto("vainilla", "5", "Colombina", sku);
    		this.vainilla_5.enqueue(producto);
    	} else if(109 == sku) {
    		Producto producto = new Producto("fresa", "10", "CremHelado", sku);
    		this.fresa_10.enqueue(producto);
    	} else if(109 == sku) {
    		Producto producto = new Producto("fresa", "5", "CremHelado", sku);
    		this.fresa_5.enqueue(producto);
    	} else if(109 == sku) {
    		Producto producto = new Producto("fresa", "10", "Colombina", sku);
    		this.fresa_10.enqueue(producto);
    	} else if(109 == sku) {
    		Producto producto = new Producto("fresa", "5", "Colombina", sku);
    		this.fresa_5.enqueue(producto);
    	} else {
    		System.out.println("Codigo sku ingresado no existente");
    	}

  
    	
    }
    
    public void programarApertura(String sabor, String presentacion) {
    	String s = sabor.toLowerCase();
    	if (s.equals("chocolate")) {
    		if (presentacion.equals("10")) {
    			this.aperturaProgramada.add(this.chocolate_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.aperturaProgramada.add(this.chocolate_5.dequeue());
    		}
    	} else if (s.equals("fresa")) {
    		if (presentacion.equals("10")) {
    			this.aperturaProgramada.add(this.fresa_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.aperturaProgramada.add(this.fresa_5.dequeue());
    		}
    	} else if(s.equals("vainilla")) {
    		if (presentacion.equals("10")) {
    			this.aperturaProgramada.add(this.vainilla_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.aperturaProgramada.add(this.vainilla_5.dequeue());
    		}
    	}
    }
}
