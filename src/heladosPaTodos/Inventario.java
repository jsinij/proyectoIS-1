package heladosPaTodos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
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
    
    public void mostrarApertura() {
    	for (int i = 0; i < this.getAperturaProgramada().size(); i++) {
    		System.out.println(this.getAperturaProgramada().get(i));
    	}
    }
    
    public void mostrarAbierto() {
    	for (int i = 0; i < this.getAbierto().size(); i++) {
    		System.out.println(this.getAbierto().get(i));
    	}
    }
    
    public void mostrarVendido() {
    	for (int i = 0; i < this.getVendido().size(); i++) {
    		System.out.println(this.getVendido().get(i));
    	}
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
    public void agregarProducto() {
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingrese el sku del producto a registrar (101 a 111");
    	int sku = scanner.nextInt();
    	
    	if ( 101 == sku) {
    		Producto producto = new Producto("chocolate", "10", "CremHelado", sku);
    		this.chocolate_10.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if (102 == sku) {
    		Producto producto = new Producto("chocolate", "5", "CremHelado", sku);
    		this.chocolate_5.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(103 == sku) {
    		Producto producto = new Producto("chocolate", "10", "Colombina", sku);
    		this.chocolate_10.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(104 == sku) {
    		Producto producto = new Producto("chocolate", "5", "Colombina", sku);
    		this.chocolate_5.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(105 == sku) {
    		Producto producto = new Producto("vainilla", "10", "CremHelado", sku);
    		this.vainilla_10.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(106 == sku) {
    		Producto producto = new Producto("vainilla", "5", "CremHelado", sku);
    		this.vainilla_5.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(107 == sku) {
    		Producto producto = new Producto("vainilla", "10", "Colombina", sku);
    		this.vainilla_10.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(108 == sku) {
    		Producto producto = new Producto("vainilla", "5", "Colombina", sku);
    		this.vainilla_5.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(109 == sku) {
    		Producto producto = new Producto("fresa", "10", "CremHelado", sku);
    		this.fresa_10.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(110 == sku) {
    		Producto producto = new Producto("fresa", "5", "CremHelado", sku);
    		this.fresa_5.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(111 == sku) {
    		Producto producto = new Producto("fresa", "10", "Colombina", sku);
    		this.fresa_10.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else if(112 == sku) {
    		Producto producto = new Producto("fresa", "5", "Colombina", sku);
    		this.fresa_5.enqueue(producto);
    		System.out.println("Producto registrado");
    		System.out.println("Identificador: " + producto.getIdentificador());
    	} else {
    		System.out.println("Codigo sku ingresado no existente");
    	}

  
    	
    }
    
    public void programarApertura() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingrese el sku del producto a programar para el día siguiente");
    	System.out.println("(101 a 112");
    	int sku = scanner.nextInt();
    	if (sku == 101 || sku == 103 || sku == 102 || sku == 104) {
    		if (sku == 101 || sku == 103) {
    			this.aperturaProgramada.add(this.chocolate_10.dequeue());
    		} else if (sku == 102 || sku == 104) {
    			this.aperturaProgramada.add(this.chocolate_5.dequeue());
    		}
    	} else if (sku == 109 || sku == 110 || sku == 111 || sku == 112 ) {
    		if (sku == 109 || sku == 111) {
    			this.aperturaProgramada.add(this.fresa_10.dequeue());
    		} else if (sku == 110 || sku == 112) {
    			this.aperturaProgramada.add(this.fresa_5.dequeue());
    		}
    	} else if(sku == 105 || sku == 106 || sku == 107 || sku == 108) {
    		if (sku == 105 || sku == 107) {
    			this.aperturaProgramada.add(this.vainilla_10.dequeue());
    		} else if (sku == 106 || sku == 108) {
    			this.aperturaProgramada.add(this.vainilla_5.dequeue());
    		}
    	}
    	
    }
    
    public void venderProducto() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingre el sku del producto a vender");
    	System.out.println("101 a 112");
    	int sku = scanner.nextInt();
    	if (sku == 101 || sku == 102 || sku == 103 || sku == 104) {
    		if (sku == 101 || sku == 103) {
    			Producto temp = this.chocolate_10.dequeue();
    			temp.vender();
    			this.vendido.add(temp);
    			System.out.println("Producto vendido:");
    			System.out.println(temp);
    		} else if (sku == 102 || sku == 104) {
    			Producto temp = this.chocolate_5.dequeue();
    			temp.vender();
    			this.vendido.add(temp);
    			System.out.println("Producto vendido:");
    			System.out.println(temp);
    		} else {
    			System.out.println("Presentación no existente");
    		}
    	} else if (sku == 105 || sku == 106 || sku == 107 || sku == 108) {
    		if (sku == 105 || sku == 107) {
    			Producto temp = this.fresa_10.dequeue();
    			temp.vender();
    			this.vendido.add(temp);
    			System.out.println("Producto vendido:");
    			System.out.println(temp);
    		} else if (sku == 106 || sku == 108) {
    			Producto temp = this.fresa_5.dequeue();
    			temp.vender();
    			this.vendido.add(temp);
    			System.out.println("Producto vendido:");
    			System.out.println(temp);
    		} else {
    			System.out.println("Presentación no existente");
    		}
    	} else if(sku == 109 || sku == 110 || sku == 111 || sku == 112) {
    		if (sku == 109 || sku == 111) {
    			Producto temp = this.vainilla_10.dequeue();
    			temp.vender();
    			this.vendido.add(temp);
    			System.out.println("Producto vendido:");
    			System.out.println(temp);
    		} else if (sku == 110 || sku == 112) {
    			Producto temp = this.vainilla_5.dequeue();
    			temp.vender();
    			this.vendido.add(temp);
    			System.out.println("Producto vendido:");
    			System.out.println(temp);
    		} else {
    			System.out.println("Presentación no existente");
    		}
    	} else {
    		System.out.println("Sabor no existente");
    	}
    	
    
    	}
    
    public void abrirProducto() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingrese el sku del producto a abrir");
    	System.out.println("101 a 112");
    	int sku = scanner.nextInt();
    	if (sku == 101 || sku == 102 || sku == 103 || sku == 104) {
    		if (sku == 101 || sku == 103) {
    			Producto temp = this.chocolate_10.dequeue();
    			temp.abrir();
    			this.abierto.add(temp);
    			System.out.println("Producto abierto:");
    			System.out.println(temp);
    		} else if (sku == 102 || sku == 104) {
    			Producto temp = this.chocolate_5.dequeue();
    			temp.abrir();
    			this.abierto.add(temp);
    			System.out.println("Producto abierto:");
    			System.out.println(temp);
    		}
    	} else if (sku == 105 || sku == 106 || sku == 107 || sku == 108) {
    		if (sku == 105 || sku == 107) {
    			Producto temp = this.fresa_10.dequeue();
    			temp.abrir();
    			this.abierto.add(temp);
    			System.out.println("Producto abierto:");
    			System.out.println(temp);
    		} else if (sku == 106 || sku == 108) {
    			Producto temp = this.fresa_5.dequeue();
    			temp.abrir();
    			this.abierto.add(temp);
    			System.out.println("Producto abierto:");
    			System.out.println(temp);
    		}
    	} else if(sku == 109 || sku == 110 || sku == 111 || sku == 112) {
    		if (sku == 109 || sku == 111) {
    			Producto temp = this.vainilla_10.dequeue();
    			temp.abrir();
    			this.abierto.add(temp);
    			System.out.println("Producto abierto:");
    			System.out.println(temp);
    		} else if (sku == 110 || sku == 112) {
    			Producto temp = this.vainilla_5.dequeue();
    			temp.abrir();
    			this.abierto.add(temp);
    			System.out.println("Producto abierto:");
    			System.out.println(temp);
    		}
    	}
    	
    	
    }
    
    public void realizarApertura() {
    	
    	Iterator<Producto> iterador = this.aperturaProgramada.iterator();
    	while(iterador.hasNext()) {
    		Producto producto = iterador.next();
    		iterador.remove();
    		producto.abrir();
    		this.abierto.add(producto);
    		System.out.println("Producto a abrir: ");
    		System.out.println(producto);
    	}
    }
    
    public void mostrarDisponible() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingrese sabor");
    	String s = scanner.nextLine().toLowerCase();
    	System.out.println("Ingrese presentación");
    	String presentacion = scanner.nextLine().toLowerCase();
    	
    	System.out.println("1. Ver cantidad");
    	System.out.println("2. Ver detalle");
    	int op = scanner.nextInt();
    	switch(op) {
    	case 1:
    		switch(s) {
        	case "chocolate":
        		switch(presentacion) {
        		case "10":
        			if (!this.getChocolate_10().isEmpty()) {
        				System.out.println("Cajas de chocolate 10 lts: " + this.getChocolate_10().size());
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "5":
        			if (!this.getChocolate_5().isEmpty()) {
        				System.out.println("Cajas de chocolate 5 lts: " + this.getChocolate_5().size());
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "todos":
        			if (!this.getChocolate_10().isEmpty() && !this.getChocolate_5().isEmpty()) {
        				System.out.println("Presentación de 10 lts");
        				System.out.println("Cantidad: " + this.getChocolate_10().size());
        				System.out.println("Presentación de 5 lts");
        				System.out.println("Cantidad: " + this.getChocolate_5().size());
        			}
        			else {
        				if(!this.getChocolate_10().isEmpty()) {
        					System.out.println("Solo presentación de 10 lts disponible");
        					System.out.println("Cantidad: " + this.getChocolate_10().size());
        				}
        				else if(!this.getChocolate_5().isEmpty()) {
        					System.out.println("Solo presentación de 5 lts disponible");
        					System.out.println("Cantidad: " + this.getChocolate_5().size());
        				}
        				else {
        					System.out.println("Ninguna presentación disponible");
        				}
        				
        			}
        			break;
        			
        		default:
        			System.out.println("Presentación no existente");
        			
        		}
        		break;
        	case "fresa":
        		
        		switch(presentacion) {
        		case "10":
        			if (!this.getFresa_10().isEmpty()) {
        				System.out.println("Cajas de fresa 10 lts: " + this.getFresa_10().size());
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "5":
        			if (!this.getFresa_5().isEmpty()) {
        				System.out.println("Cajas de fresa 5 lts: " + this.getFresa_5().size());
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "todos":
        			if (!this.getFresa_10().isEmpty() && !this.getFresa_5().isEmpty()) {
        				System.out.println("Presentación de 10 lts");
        				System.out.println("Cantidad: " + this.getFresa_10().size());
        				System.out.println("Presentación de 5 lts");
        				System.out.println("Cantidad: " + this.getFresa_5().size());
        			}
        			else {
        				if(!this.getFresa_10().isEmpty()) {
        					System.out.println("Solo presentación de 10 lts disponible");
        					System.out.println("Cantidad: " + this.getFresa_10().size());
        				}
        				else if(!this.getFresa_5().isEmpty()) {
        					System.out.println("Solo presentación de 5 lts disponible");
        					System.out.println("Cantidad: " + this.getFresa_5().size());
        				}
        				else {
        					System.out.println("Ninguna presentación disponible");
        				}
        				
        			}
        			break;
        		default:
        			System.out.println("Presentación no existente");
        			
        		
        		}
        		break;
        	case "vainilla":
        		switch(presentacion) {
        		case "10":
        			if (!this.getVainilla_10().isEmpty()) {
        				System.out.println("Cajas de vainilla 10 lts: "  + this.getVainilla_10().size());
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "5":
        			if (!this.getVainilla_5().isEmpty()) {
        				System.out.println("Cajas de vainilla 5 lts: " + this.getVainilla_5().size());
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "todos":
        			if (!this.getVainilla_10().isEmpty() && !this.getVainilla_5().isEmpty()) {
        				System.out.println("Presentación de 10 lts");
        				System.out.println("Cantidad: " + this.getVainilla_10().size());
        				System.out.println("Presentación de 5 lts");
        				System.out.println("Cantidad: " + this.getVainilla_5().size());
        			}
        			else {
        				if(!this.getVainilla_10().isEmpty()) {
        					System.out.println("Solo presentación de 10 lts disponible");
        					System.out.println("Cantidad: " + this.getVainilla_10().size());
        				}
        				else if(!this.getVainilla_5().isEmpty()) {
        					System.out.println("Solo presentación de 5 lts disponible");
        					System.out.println("Cantidad: " + this.getVainilla_5().size());
        				}
        				else {
        					System.out.println("Ninguna presentación disponible");
        				}
        				
        			}
        			break;
        		default:
        			System.out.println("Presentación no existente");
        			
        		}
        		break;
        		
        	default:
        		System.out.println("Sabor no existente");
        	}
    	break;
    	case 2:
    		switch(s) {
        	case "chocolate":
        		switch(presentacion) {
        		case "10":
        			if (!this.getChocolate_10().isEmpty()) {
        				this.getChocolate_10().getData().mostrarObjeto();
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "5":
        			if (!this.getChocolate_5().isEmpty()) {
        				this.getChocolate_5().getData().mostrarObjeto();
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "todos":
        			if (!this.getChocolate_10().isEmpty() && !this.getChocolate_5().isEmpty()) {
        				System.out.println("Presentación de 10 lts");
        				this.getChocolate_10().getData().mostrarObjeto();
        				System.out.println("Presentación de 5 lts");
        				this.getChocolate_5().getData().mostrarObjeto();
        			}
        			else {
        				if(!this.getChocolate_10().isEmpty()) {
        					System.out.println("Solo presentación de 10 lts disponible");
        					this.getChocolate_10().getData().mostrarObjeto();
        				}
        				else if(!this.getChocolate_5().isEmpty()) {
        					System.out.println("Solo presentación de 5 lts disponible");
        					this.getChocolate_5().getData().mostrarObjeto();
        				}
        				else {
        					System.out.println("Ninguna presentación disponible");
        				}
        				
        			}
        			break;
        			
        		default:
        			System.out.println("Presentación no existente");
        			
        		}
        		break;
        	case "fresa":
        		
        		switch(presentacion) {
        		case "10":
        			if (!this.getFresa_10().isEmpty()) {
        				this.getFresa_10().getData().mostrarObjeto();
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "5":
        			if (!this.getFresa_5().isEmpty()) {
        				this.getFresa_5().getData().mostrarObjeto();
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "todos":
        			if (!this.getFresa_10().isEmpty() && !this.getFresa_5().isEmpty()) {
        				System.out.println("Presentación de 10 lts");
        				this.getFresa_10().getData().mostrarObjeto();
        				System.out.println("Presentación de 5 lts");
        				this.getFresa_5().getData().mostrarObjeto();
        			}
        			else {
        				if(!this.getFresa_10().isEmpty()) {
        					System.out.println("Solo presentación de 10 lts disponible");
        					this.getFresa_10().getData().mostrarObjeto();
        				}
        				else if(!this.getFresa_5().isEmpty()) {
        					System.out.println("Solo presentación de 5 lts disponible");
        					this.getFresa_5().getData().mostrarObjeto();
        				}
        				else {
        					System.out.println("Ninguna presentación disponible");
        				}
        				
        			}
        			break;
        		default:
        			System.out.println("Presentación no existente");
        			
        		
        		}
        		break;
        	case "vainilla":
        		switch(presentacion) {
        		case "10":
        			if (!this.getVainilla_10().isEmpty()) {
        				this.getVainilla_10().getData().mostrarObjeto();
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "5":
        			if (!this.getVainilla_5().isEmpty()) {
        				this.getVainilla_5().getData().mostrarObjeto();
        			}
        			else {
        				System.out.println("Producto agotado");
        			}
        			break;
        		case "todos":
        			if (!this.getVainilla_10().isEmpty() && !this.getVainilla_5().isEmpty()) {
        				System.out.println("Presentación de 10 lts");
        				this.getVainilla_10().getData().mostrarObjeto();
        				System.out.println("Presentación de 5 lts");
        				this.getVainilla_5().getData().mostrarObjeto();
        			}
        			else {
        				if(!this.getVainilla_10().isEmpty()) {
        					System.out.println("Solo presentación de 10 lts disponible");
        					this.getVainilla_10().getData().mostrarObjeto();
        				}
        				else if(!this.getVainilla_5().isEmpty()) {
        					System.out.println("Solo presentación de 5 lts disponible");
        					this.getVainilla_5().getData().mostrarObjeto();
        				}
        				else {
        					System.out.println("Ninguna presentación disponible");
        				}
        				
        			}
        			break;
        		default:
        			System.out.println("Presentación no existente");
        			
        		}
        		break;
        	default:
        		System.out.println("Sabor no existente");
        	
        	}
    		break;
    		
    	}
    	
    	
    	
    	
    	
    	
    }
    
    public void mostrarSku() {
        System.out.println("SKU Disponibles:");
        System.out.println("101: Sabor Chocolate, CremHelado, 10 Litros");
        System.out.println("102: Sabor Chocolate, CremHelado, 5 Litros");
        System.out.println("103: Sabor Chocolate, Colombina, 10 Litros");
        System.out.println("104: Sabor Chocolate, Colombina, 5 Litros");
        System.out.println("105: Sabor Vainilla, CremHelado, 10 Litros");
        System.out.println("106: Sabor Vainilla, CremHelado, 5 Litros");
        System.out.println("107: Sabor Vainilla, Colombina, 10 Litros");
        System.out.println("108: Sabor Vainilla, Colombina, 5 Litros");
        System.out.println("109: Sabor Fresa, CremHelado, 10 Litros");
        System.out.println("110: Sabor Fresa, CremHelado, 5 Litros");
        System.out.println("111: Sabor Fresa, Colombina, 10 Litros");
        System.out.println("112: Sabor Fresa, Colombina, 5 Litros");
    }
    
    
}
