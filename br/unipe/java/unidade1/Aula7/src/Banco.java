
public class Banco {
	private ContaCorrente[] contas;
	
	public void cadastraConta(String nome, String endereco, double valor){
		
		Cliente cliente = new Cliente(nome, endereco);
		
		ContaCorrente contaCorrente = new ContaCorrente(1, cliente, valor);
		//Criar um imprimir para Imprimir as contas correntes.
		//Criar um metodo para consultar o cliente e exibir o saldo dele.
		
	}
	
	
}
