package exerciciosDeAula;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		
		Agencia agencia = new Agencia();
		ContaCorrente conta = null;
		conta = new ContaCorrente();
		conta.setSaldo(-500);
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o CPf do usuario;");
		String cpf= leitor.nextLine();
		
		System.out.println("Intorme o nome do Usuario: ");
		String nome = leitor.nextLine();
		
		Usuario u= new Usuario();
		u.setNome(nome);
		u.setCpf(cpf);
		
		try{
		FileOutputStream foo = new FileOutputStream(cpf+ ".ser");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(u);
		foo.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		agencia.cadastrarConta(conta);
		
		try {
			agencia.consultarConta(conta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Opa estou rico");
	}
}