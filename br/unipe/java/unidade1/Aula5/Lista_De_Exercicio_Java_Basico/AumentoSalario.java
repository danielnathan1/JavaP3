import java.util.Scanner;

public class AumentoSalario {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float salario;
		float porcentagem;
		float total;
		
		
		System.out.println("Digite o seu Salario atual: ");
		salario = leitor.nextFloat();
		
		System.out.println("Digite o aumento em porcentagem: ");
		porcentagem = leitor.nextFloat();
		
		total = salario + (salario * (porcentagem/100));
		
		System.out.println("O Salario total: " + total);		
		
	}
	
	
}
