
public class Vendedor {
	public String nome;
	public String codigo;
	public static float comissao = 10;
	public String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getComissao() {
		return comissao;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Vendedor(String nome, String codigo, String endereco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
	}
	
	
}
