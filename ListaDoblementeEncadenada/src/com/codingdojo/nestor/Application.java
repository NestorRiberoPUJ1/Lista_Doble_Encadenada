package com.codingdojo.nestor;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nodo n1 = new Nodo(1);
		Nodo n2 = new Nodo(2);
		Nodo n3 = new Nodo(3);
		Nodo n4 = new Nodo(4);

		DLL lista = new DLL();

		lista.push(n1);
		lista.push(n2);
		lista.push(n3);
		lista.push(n4);
		lista.printValuesForward();
		lista.printValuesReverse();

		lista.pop();
		lista.printValuesForward();
		lista.printValuesReverse();
		
		System.out.println(lista.contains(3));
		System.out.println(lista.size());
	}

}
