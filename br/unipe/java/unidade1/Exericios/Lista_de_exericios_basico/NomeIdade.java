package Exercicios;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
		
		
		System.out.println("Seu nome é:" + nome + " E sua idade é : "+ idade);
		
	}
	
}
