package com.codingdojo.nestor;

//Double Linked List
public class DLL {
	public Nodo head;
	public Nodo tail;

	public DLL() {
		this.head = null;
		this.tail = null;
	}

	// el método push agregará un nuevo nodo al final de la lista
	public void push(Nodo newNode) {
		// si no hay head en la lista, es decir, una lista vacía, establecemos el
		// newNode para que sea head y el tail de la lista
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}

		// primero encuentra el lastNode en la lista
		// luego, establece next al lastNode para ser el newNode
		// después, tenemos que establecer el previous del lastNode al lastNode que
		// encontramos antes
		// finalmente, establecemos el tail de la lista para que sea el nodo que hemos
		// agregado
		Nodo lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}

	public void printValuesForward() {
		System.out.println();
		// encuentra el primer nodo, también conocido como head.
		Nodo current = this.head;

		// mientras exista el nodo actual...
		while (current != null) {
			// imprime su valor
			System.out.println(current.value);
			// y pasa al siguiente nodo.
			current = current.next;
		}
	}

	public void printValuesReverse() {
		System.out.println();
		// encuentra el primer nodo, también conocido como head.
		Nodo current = this.tail;

		// mientras exista el nodo actual...
		while (current != null) {
			// imprime su valor
			System.out.println(current.value);
			// y pasa al siguiente nodo.
			current = current.previous;
		}
	}

	public Nodo pop() {

		Nodo lastNode = this.tail;
		lastNode.previous.next = null;
		this.tail = this.tail.previous;

		return lastNode;
	}

	public boolean contains(Integer value) {

		Nodo current = this.head;

		// mientras exista el nodo actual...
		while (current != null) {
			// imprime su valor
			if (current.value == value) {
				return true;
			}
			// y pasa al siguiente nodo.
			current = current.next;
		}

		return false;
	}

	public int size() {

		Nodo current = this.head;
		int size = 0;
		// mientras exista el nodo actual...
		while (current != null) {
			// imprime su valor

			current = current.next;
			size++;
		}

		return size;
	}

}