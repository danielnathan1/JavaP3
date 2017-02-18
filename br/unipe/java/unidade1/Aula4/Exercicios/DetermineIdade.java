package Exercicios;

import java.util.Scanner;

public class DetermineIdade {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		int anoNascimento;
		int anoAtual;
		
		
		System.out.println("Digite o ano que você nasceu:  ");
		anoNascimento = leitor.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = leitor.nextInt();
		
		
		System.out.println("Você tem : " + (anoAtual - anoNascimento) );
		
		
	}
}
