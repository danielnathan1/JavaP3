package br.unipe.java.unidade1;

public class Cachorro{
	private String ra�a;
	private String cor;
	private String sexo;
	public String nome;
	
	public void latir(){
		System.out.println(this.nome + "  latindo : au au !");
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}