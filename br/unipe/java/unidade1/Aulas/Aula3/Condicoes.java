package aula3;

import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int z = 0;

		System.out.println("Digite um Valor para Z: ");
		z = leitor.nextInt();
		
		if(z == 10){
			System.out.println("z e igual a 10 :) \n");
		
		} else {
			System.out.println("z nao e igual a 10 :( \n");
		}
		
		System.out.println("e isso enrola��o");
		
		leitor.close();
	}

}
