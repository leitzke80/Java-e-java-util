package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.Cliente;

public class TesteObject {
	
	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println("3");
//		System.out.println("false");
		
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupança(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cliente);
	}
}
