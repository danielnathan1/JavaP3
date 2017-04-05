
public class UsandoVenda {
	public static void main(String[] args) {
		
		produtoSemPromocao();
		System.out.println("\n\n-----------------------------------------------------------------------------\n");
		produtoPromocao();
		System.out.println("\n\n-----------------------------------------------------------------------------\n");
		produtoPromocao2();

	}
	
	
	
	public static void produtoSemPromocao(){
		Produto produto = new Produto("001", "arroz", 3, 2, false);
		Vendedor vendedor = new Vendedor("Dudu", "1", "Rua dos alfeneiros");
		Venda venda = new Venda();
		
		venda.setProduto(produto);
		venda.setVendedor(vendedor);
		venda.setQuantidadeItens(2);
		venda.calcularValor();
		venda.calcularComissao();
		venda.imprimir();
		
	}
	
	public static void produtoPromocao(){
		Produto produto2 = new Produto("002", "feijao", 5, 3, true );
		Vendedor vendedor2 = new Vendedor("Thomis", "2", "Condado");
		Venda venda2 = new Venda();
		
		venda2.setProduto(produto2);
		venda2.setVendedor(vendedor2);
		venda2.setQuantidadeItens(2);
		venda2.efetuarDesconto(20);
		venda2.calcularValor();
		venda2.calcularComissao();
		venda2.imprimir();
		
		
		
	}
	
	public static void produtoPromocao2(){
		Produto produto3 = new Produto("003", "milho", 5, 3 , true);
		Vendedor vendedor3 = new Vendedor("Daniel", "3", "springfield");
		Venda venda3 = new Venda();
		
		venda3.setProduto(produto3);		
		venda3.setVendedor(vendedor3);
		venda3.setQuantidadeItens(2);
		venda3.efetuarDesconto(20);
		venda3.calcularValor();
		venda3.calcularComissao();
		venda3.imprimir();
		
		
	}
}



