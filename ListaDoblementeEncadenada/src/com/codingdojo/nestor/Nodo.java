package com.codingdojo.nestor;

public class Nodo {

	public Integer value;
	public Nodo previous;
	public Nodo next;

	public Nodo(Integer value) {
		
		this.value = value;
		this.previous = null;
		this.next = null;
	}

}
