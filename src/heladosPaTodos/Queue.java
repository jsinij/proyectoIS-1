package heladosPaTodos;

/* Esta clase es la cola en la que se almacenarán los productos
 * asegurando así que siempre al vender, abrir o programar un producto
 * siempre sea el más viejo.
 */

public class Queue {
	
	ListaSimple data;
	
	Queue(){
		this.data = new ListaSimple();
	}
	
	public int size() {
		return data.size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void enqueue(Producto e) {
		this.data.addLast(e);
	}
	
	public Producto dequeue() {
		return this.data.removeFirst();
	}
	
	public Object first() {
		return data.first().getData();
	}

}
