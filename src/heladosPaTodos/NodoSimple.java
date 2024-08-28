package heladosPaTodos;

public class NodoSimple {
	
	Producto data;
	NodoSimple next;
	
	NodoSimple(){
		this.data = null;
		this.next = null;
	}
	
	NodoSimple(Producto e){
		this.data = e;
		this.next = null;
	}
	
	public Producto getData() {
		return this.data;
	}
	
	public NodoSimple getNext() {
		return this.next;
	}
	
	public void setData(Producto e) {
		this.data = e;
	}
	
	public void setNext(NodoSimple n) {
		this.next = n;
	}
	
	
	
	
	
	

}
