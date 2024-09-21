package heladosPaTodos;

public class ListaSimple {
	
	NodoSimple head;
	NodoSimple tail;
	int size;
	
	ListaSimple(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	ListaSimple(NodoSimple cabeza){
		this.head = cabeza;
	}
	
	public int size() {
		return this.size;
		
	}
	
	public Boolean isEmpty() {
		
		return this.size == 0;
	}
	
	public void setSize(int s) {
		this.size = s;
	}
	
	public NodoSimple first() {
		return this.head;
	}
	
	public NodoSimple last() {
		return this.tail;
	}
	
	public void addFirst(Producto e){
		
		NodoSimple nodo = new NodoSimple(e);
		
		if (this.isEmpty()) {
			this.head = nodo;
			this.head = nodo;
		}
		else {
			nodo.setNext(this.head);
			this.head = nodo;
		}
		this.size++;
	}
	
	public void addLast(Producto e) {
		NodoSimple nodo = new NodoSimple(e);
		if (this.isEmpty()) {
			this.head = nodo;
			this.tail = nodo;
		}
		else {
			this.tail.setNext(nodo);
			this.tail = nodo;
		}
		this.size++;
	}
	
	public Producto removeFirst() {
		
		if (!this.isEmpty()) {
			NodoSimple temp = head;
			head = temp.getNext();
			temp.setNext(null);
			this.size--;
			return temp.getData();
		}
		else {
			return null;
		}
	}
	
	public Producto removeLast() {
		if (size == 1) {
			return removeFirst();
			
		}
		else {
			NodoSimple temp = tail;
			NodoSimple anterior = head;
			while(anterior.getNext() != tail) {
				anterior = anterior.getNext();
			}
			anterior.setNext(null);
			tail = anterior;
			this.size--;
		    return temp.getData();
		}
	}
	
	
	public void setHead(NodoSimple head) {
		this.head = head;
	}
	
	public NodoSimple[] separarLista(NodoSimple cabeza){
		
		if ( cabeza == null || cabeza.getNext() == null) {
			return new NodoSimple[] {cabeza,null};
		}
		
		NodoSimple lento = cabeza;
		NodoSimple rapido = cabeza;
		NodoSimple anterior = null;
		
		while (rapido != null && rapido.next != null) {
			
			rapido = rapido.getNext().getNext();
			anterior = lento;
			lento = lento.getNext();
		}
		
		anterior.setNext(null);
		
		return new NodoSimple[] {cabeza, lento};
		
	}
	
	public void mostrarObjeto() {
		
		NodoSimple temp = this.head;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}	
}
