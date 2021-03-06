package projetoTeste;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ManipulaObjeto manipulaobjeto = new ManipulaObjeto();
		int opcao = 0;
		Contato contato;
		Menu menu = new Menu();
		
		while(true){
			
			menu.exibeMenuPrincipal();
			
			opcao = new Integer(leitor.nextLine());
			
			switch(opcao){
				case 1:
					System.out.println("Informe o nome do Contato: ");
					String nome = leitor.nextLine();
					
					System.out.println("Informe o CPF: ");
					String cpf = leitor.nextLine();
					
					System.out.println("Informe um C�digo para o usu�rio: ");
					int codigo = new Integer(leitor.nextLine());
					
					contato = new Contato(codigo, nome, cpf);
					manipulaobjeto.salvar(contato, contato.getCpf());
					System.out.println("Objeto Salvo com Sucesso!");
					break;
					
				case 2:
					System.out.println("Infome o cpf do Contato: ");
					nome = leitor.nextLine();
					contato = (Contato)manipulaobjeto.lerObjeto(nome);
					System.out.println("Nome:" + contato.getNome());
					System.out.println("Cpf: "+ contato.getCpf());
					break;
			
				case 3:
					System.exit(0);
					System.out.println("O progama vai ser encerrado");
					leitor.nextLine();
			}	
		}
	}
}
