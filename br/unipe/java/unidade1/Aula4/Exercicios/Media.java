package Exercicios;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leitor.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leitor.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leitor.nextInt();
		
		media =(nota1 + nota2 + nota3)/3;
		
		
		System.out.println("A media da suas notas é: " + media);
		
		
		if(media>=7.0){
			System.out.println(" e você foi aprovado");
		}
		if(media<7.0 && media>5.0){
			System.out.println(" e você está na prova final");
		
		}
		if(media<5.0){
			System.out.println(" e você foi REPROVADO");
		}
		
		
		
	}
}
