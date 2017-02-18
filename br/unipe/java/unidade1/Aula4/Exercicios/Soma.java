package Exercicios;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int x;
		int y;
		//int soma;
		
		System.out.println("digite o primeiro numero a ser somado:");
		x = leitor.nextInt();
		
		System.out.println("digite o segundo numero a ser somado:");
		
		y = leitor.nextInt();
		
		System.out.println("O resultado é : " + (x+y));
		
		
		
		
	}
}
