package exerciciosDeAula;

public class ContaCorrente {
	
	private double saldo = 0.0;
	
	public void depositar(double valorDeposito){
		System.out.println("Valor Depositado" + valorDeposito);
		this.saldo += valorDeposito;
		
	}
	
	public void sacar(double valorSaque){
		System.out.println("Sacar" + valorSaque);
		this.saldo -= valorSaque;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
