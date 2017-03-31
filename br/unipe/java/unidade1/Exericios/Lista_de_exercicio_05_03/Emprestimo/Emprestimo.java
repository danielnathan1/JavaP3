package Emprestimo;

public class Emprestimo {
	String nomeUsuario;
	int idade;
	float valorEmprestimo;
	float percentualJurosMes;
	int  mesesParaPagar;
	
	
	public void Impimir(){
		System.out.println("Nome: " + nomeUsuario);
		System.out.println("Idade: " + idade);
		System.out.println("Percentual de Juros Por Mes : " + percentualJurosMes);
		System.out.println("Meses Para Pagar: " + mesesParaPagar);
		System.out.println("Valor total a ser pagodo do seu  emprestimo : " + valorEmprestimo);
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public float getValorEmprestimo() {
		return valorEmprestimo;
	}


	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}


	public Float getPercentualJurosMes() {
		return percentualJurosMes;
	}


	public void setPercentualJurosMes(Float percentualJurosMes) {
		this.percentualJurosMes = percentualJurosMes;
	}


	public int getMesesParaPagar() {
		return mesesParaPagar;
	}


	public void setMesesParaPagar(int mesesParaPagar) {
		this.mesesParaPagar = mesesParaPagar;
	}
	
	
}
