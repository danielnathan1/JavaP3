
public class Venda {
	public Produto produto;
	public Vendedor vendedor;
	float desconto;
	int quantidadeItens;
	float valor;
	float valorComissao;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
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
		this.quantidadeItens = quantidadeItens;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void efetuarDesconto(float porcentagem){
		
		desconto = (porcentagem / 100) * this.produto.getValorVenda();
		
		if((produto.getValorVenda() - desconto) < produto.getValorCusto()){
			
			desconto = 0;
		}
		
		
	}
	
	
	public void calcularValor(){
		this.valor = (this.produto.getValorVenda() - this.desconto) * this.quantidadeItens;
	}
	
	
	public float calcularComissao(){
		
		if(this.produto.promocao == true){
			valorComissao = ((this.vendedor.getComissao() / 100) * getValor() / 2);
			
		}else{
			valorComissao = ((this.vendedor.getComissao() / 100) * getValor());
		}
		
		return valorComissao;
		
	}
	
	public void imprimir(){
		System.out.println("\nVendedor: "+ vendedor.getNome());
		System.out.println("\nCodigo : " + vendedor.getCodigo());
		System.out.println("\nComissao :R$" + valorComissao);
		System.out.println("\n\nQuantidade de itens vendidos: " + quantidadeItens);
		System.out.println("\nCodigo do produto: " + produto.getCodigo()+ "\ndescricao: \n" + produto.getDescricao());
		System.out.println("\nValor do Produto:R$" + produto.getValorVenda());
		if(produto.promocao == true){
			System.out.println("\nProduto esta em promocao");
			System.out.println("\nValor do desconto:R$" + desconto);
		}
		System.out.println("\nValor total da venda:R$" + valor);
		
		
		
	}
	
}
