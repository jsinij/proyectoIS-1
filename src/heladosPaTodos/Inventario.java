package heladosPaTodos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * La clase inventario representa el sistema de almacenamiento de
 * información de la heladería Helados Pa'todos.
 */

public class Inventario {

    private ArrayList<Producto> usuario = new ArrayList<>();
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
        this.chocolate_10 = new Queue();
        this.chocolate_5 = new Queue();
        this.vainilla_10 = new Queue();
        this.vainilla_5 = new Queue();
        this.fresa_10 = new Queue();
        this.fresa_5 = new Queue();
    }

    
    public void abrirProducto(Producto producto) {
        aperturaProgramada.remove(producto);
        producto.setFechaApertura(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        abierto.add(producto);
    }

    public void hacerDisponible(Producto producto) {
        abierto.remove(producto); 
    }

    public void venderProducto(Producto producto) {
       vendido.add(producto);
       producto.setFechaVenta(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
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
    
    

    
    public ArrayList<Producto> getUsuario() {
		return usuario;
	}


	public void setUsuario(ArrayList<Producto> usuario) {
		this.usuario = usuario;
	}


	public ArrayList<Producto> getAperturaProgramada() {
		return aperturaProgramada;
	}


	public void setAperturaProgramada(ArrayList<Producto> aperturaProgramada) {
		this.aperturaProgramada = aperturaProgramada;
	}


	public ArrayList<Producto> getAbierto() {
		return abierto;
	}


	public void setAbierto(ArrayList<Producto> abierto) {
		this.abierto = abierto;
	}


	public ArrayList<Producto> getVendido() {
		return vendido;
	}


	public void setVendido(ArrayList<Producto> vendido) {
		this.vendido = vendido;
	}


	public Queue getChocolate_10() {
		return chocolate_10;
	}


	public void setChocolate_10(Queue chocolate_10) {
		this.chocolate_10 = chocolate_10;
	}


	public Queue getChocolate_5() {
		return chocolate_5;
	}


	public void setChocolate_5(Queue chocolate_5) {
		this.chocolate_5 = chocolate_5;
	}


	public Queue getVainilla_10() {
		return vainilla_10;
	}


	public void setVainilla_10(Queue vainilla_10) {
		this.vainilla_10 = vainilla_10;
	}


	public Queue getVainilla_5() {
		return vainilla_5;
	}


	public void setVainilla_5(Queue vainilla_5) {
		this.vainilla_5 = vainilla_5;
	}


	public Queue getFresa_10() {
		return fresa_10;
	}


	public void setFresa_10(Queue fresa_10) {
		this.fresa_10 = fresa_10;
	}


	public Queue getFresa_5() {
		return fresa_5;
	}


	public void setFresa_5(Queue fresa_5) {
		this.fresa_5 = fresa_5;
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
    
    public void venderProducto(String sabor, String presentacion) {
    	String s = sabor.toLowerCase();
    	if (s.equals("chocolate")) {
    		if (presentacion.equals("10")) {
    			this.vendido.add(this.chocolate_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.vendido.add(this.chocolate_5.dequeue());
    		}
    	} else if (s.equals("fresa")) {
    		if (presentacion.equals("10")) {
    			this.vendido.add(this.fresa_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.vendido.add(this.fresa_5.dequeue());
    		}
    	} else if(s.equals("vainilla")) {
    		if (presentacion.equals("10")) {
    			this.vendido.add(this.vainilla_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.vendido.add(this.vainilla_5.dequeue());
    		}
    	}
    }
    
    public void abrirProducto(String sabor, String presentacion) {
    	String s = sabor.toLowerCase();
    	if (s.equals("chocolate")) {
    		if (presentacion.equals("10")) {
    			this.abierto.add(this.chocolate_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.abierto.add(this.chocolate_5.dequeue());
    		}
    	} else if (s.equals("fresa")) {
    		if (presentacion.equals("10")) {
    			this.abierto.add(this.fresa_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.abierto.add(this.fresa_5.dequeue());
    		}
    	} else if(s.equals("vainilla")) {
    		if (presentacion.equals("10")) {
    			this.abierto.add(this.vainilla_10.dequeue());
    		} else if (presentacion.equals("5")) {
    			this.abierto.add(this.vainilla_5.dequeue());
    		}
    	}
    }
    
    public void realizarApertura() {
    	
    	Iterator<Producto> iterador = this.aperturaProgramada.iterator();
    	while(iterador.hasNext()) {
    		Producto producto = iterador.next();
    		iterador.remove();
    		this.abierto.add(producto);
    	}
    }
    
    public void mostrarDisponible(String sabor, int presentacion) {
    	String s = sabor.toLowerCase();
    	switch(s) {
    	case "chocolate":
    		switch(presentacion) {
    		case 10:
    			if (!this.getChocolate_10().isEmpty()) {
    				this.getChocolate_10().getData().mostrarObjeto();
    			}
    			else {
    				System.out.println("Producto agotado");
    			}
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    }
    
    
}
