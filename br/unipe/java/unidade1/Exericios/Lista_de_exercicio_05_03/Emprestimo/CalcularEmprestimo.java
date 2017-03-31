package Emprestimo;

import java.util.Scanner;

public class CalcularEmprestimo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Emprestimo emprestimo= new Emprestimo();
		
		System.out.println("Digite o nome do Usuario: ");
		emprestimo.nomeUsuario = leitor.nextLine();
		
		
		do{
			System.out.println(emprestimo.nomeUsuario + ",(sua idade deve ser maior que 17 e menor do que 34) Digite sua idade: ");
			emprestimo.idade = leitor.nextInt();
		}while(!(emprestimo.idade >= 18 & emprestimo.idade<= 33));
		
		
		
		System.out.println("Digite o Valor Percentual de Juros Por Mes: ");
		emprestimo.percentualJurosMes = leitor.nextFloat();
		
		System.out.println("Digite por Quantos meses você vai pagar: ");
		emprestimo.mesesParaPagar = leitor.nextInt();
		
		System.out.println("Digite o Valor do Seu emprestimo: ");
		emprestimo.valorEmprestimo = leitor.nextFloat();
		
		
		
		if(emprestimo.idade >=18 & emprestimo.idade < 23){
			emprestimo.valorEmprestimo +=(emprestimo.valorEmprestimo / emprestimo.mesesParaPagar)* emprestimo.percentualJurosMes;
			emprestimo.Impimir();
		}
		if(emprestimo.idade>23 & emprestimo.idade <= 33){
			emprestimo.valorEmprestimo = (emprestimo.valorEmprestimo *10 )/100;
			emprestimo.Impimir();
		}
		
		
		
	}
	
}
