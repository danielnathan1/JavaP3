package Exercicios;

import java.util.Scanner;

public class DetermineIdade {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		int anoNascimento;
		int anoAtual;
		
		
		System.out.println("Digite o ano que voc� nasceu:  ");
		anoNascimento = leitor.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = leitor.nextInt();
		
		
		System.out.println("Voc� tem : " + (anoAtual - anoNascimento) );
		
		
	}
}
