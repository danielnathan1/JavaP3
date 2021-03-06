import java.io.Serializable;
import java.util.Scanner;

public class Venda implements Serializable{
	
	public Produto[] produto = new Produto[10];
	public Vendedor vendedor;
	public float comissaoVenda = 0.0f;
	float desconto;
	int i;
	int quantidadeItens;
	float valor;
	float valorComissao;
	Persist persist = new Persist();
	
	
	
	public void mostrarVenda(Venda venda){
		System.out.println("\tDETALHAMENTO DA VENDA");
		System.out.println("\nPRODUTO:" + produto[i].getNome() + "  PRE�O:" + produto[i].getValorVenda() + "QUANTIDADE:"+ venda.getQuantidadeItens());
		System.out.println("\nVALOR TOTAL:" + venda.getValor());
		System.out.println("\n\n\nVENDEDOR:"+ venda.vendedor.getNome() + "\t\tCOMISSAO:" + venda.getComissaoVenda());
		
	}
	
	
	

	
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	
	
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		if(this.quantidadeItens<0){
			throw new ValorException("A quantidade de itens precisa ser Positiva!");
		}
		this.quantidadeItens = quantidadeItens;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		if(this.valor<0){
			throw new ValorException("Erro, o valor da venda est� incorreto");
		}
		this.valor = valor;
	}
	
	public float getComissaoVenda() {
		return comissaoVenda;
	}
	public void setComissaoVenda(float comissaoVenda) {
		this.comissaoVenda = comissaoVenda;
	}
	
	public void efetuarDesconto(float porcentagem){
		
		try{
		desconto = (porcentagem / 100) * this.produto[i].getValorVenda();
		
		if(desconto<0){
			throw new ValorException("Valor invalido do desconto");
		}
		
		if((produto[i].getValorVenda() - desconto) < produto[i].getValorCusto()){
			desconto = 0;
		}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro no Desconto!");
		}finally {
			System.out.println("Finally");
		}
	}
	
	
	
	
	public float calcularValor(){
		
		this.valor = (this.produto[i].getValorVenda() - this.desconto) * this.quantidadeItens;
		if (produto[i].getValorVenda()<0){
			throw new ValorException("O valor do Produto � Invalido!");
		}
		return valor;
	}
	
	
	public float calcularComissao(){
		
		
		if(this.produto[i].promocao == true){
			valorComissao = ((this.vendedor.getComissao() / 100) * getValor() / 2);
			
		}else{
			valorComissao = ((this.vendedor.getComissao() / 100) * getValor());
		}
		
		if(valorComissao<0){
			throw new ValorException("Erro, o valor da Comiss�o est� incorreto");
		}
		
		return valorComissao;
		
	}
	
	public void imprimir(){
		System.out.println("\nVendedor: "+ vendedor.getNome());
		System.out.println("\nCodigo : " + vendedor.getId());
		System.out.println("\nComissao :R$" + valorComissao);
		System.out.println("\n\nQuantidade de itens vendidos: " + quantidadeItens);
		System.out.println("\nCodigo do produto: " + produto[i].getCodigo()+ "\ndescricao: \n" + produto[i].getDescricao());
		System.out.println("\nValor do Produto:R$" + produto[i].getValorVenda());
		if(produto[i].promocao == true){
			System.out.println("\nProduto esta em promocao");
			System.out.println("\nValor do desconto:R$" + desconto);
		}
		System.out.println("\nValor total da venda:R$" + valor);
		
		
		
	}
	
}
