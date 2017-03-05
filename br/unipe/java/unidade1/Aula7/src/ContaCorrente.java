
public class ContaCorrente {
	
	
	private int numeroConta;
	private Cliente cliente;
	private double saldo;

	
	
	
	
	public ContaCorrente(int numeroConta, Cliente cliente, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
}
