package br.unipe.java.unidade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Cachorro bob= new Cachorro();
		
		System.out.println("qual o nome do cachorro?: \n");
		bob.nome = leitor.nextLine();
		
		bob.latir();
		
		/*Carro katiau = new Carro();
		katiau.retroceder();
		katiau.avancar();
		
		Carro fusca = new Carro();
		fusca.abastecer();
		fusca.parar();
		*/
		
		
		
		
	}
		
		

}

