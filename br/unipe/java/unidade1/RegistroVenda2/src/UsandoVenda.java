import java.util.Scanner;

public class UsandoVenda {
	public static void main(String[] args) {
		//variaveis para controle
		//
		Menu menu = new Menu();
		//
		Vendedor vendedor = new Vendedor();
		//
		Produto produto = new Produto();
		//
		Venda venda = new Venda();
		//
		Scanner leitor = new Scanner(System.in);
		//
		Persist persist = new Persist();
		
		
		
		while(menu.getOpcao()!=4 ){
			menu.setOpcaoRetorno(2) ;
			menu.limpar();
			menu.menuPrincipal();
			switch (menu.getOpcao()) {
			case 1:
				//EFETUAR VENDA
				
				while(menu.getOpcaoRetorno()== 2){
					int i =0;
					int x=0;
					System.out.println("\nDIGITE O ID DO VENDEDOR: ");
					venda.setVendedor((Vendedor) persist.lerObjeto("vendedores/" + leitor.nextLine()));
					
					
					while(x==0){
						i+=1;
						
					//valor final a se pagar
						System.out.println("\nDIGITE O CODIGO DO PRODUTO: ");
						venda.produto[i] = ((Produto) persist.lerObjeto(leitor.nextLine()));
						System.out.println();
						
						//quantidade
						venda.setQuantidadeItens(0);
						System.out.println("\nQUANTIADE DE ITENS: ");
						venda.setQuantidadeItens(leitor.nextInt());
						
						System.out.println("DIGITE [0] PARA ADICIONAR MAIS UM PRODUTO, E QUALQUER NUMERO PARA FINALIZAR!");
						x = leitor.nextInt();
						i += 1;
					}
					//detalhamento
					venda.mostrarVenda(venda);
					menu.menuRetorno();
					//salvar venda
					//persist.salvar(venda, venda.vendedor.getNome());
				}
				
				break;
				
			case 2:
				
				//REGISTRO VENDEDOR
				while(menu.getOpcaoRetorno()==2){
					
					menu.limpar();
					vendedor.registrarVendedor(vendedor);
					persist.salvar(vendedor, "vendedores/"+ vendedor.getId());
					vendedor.mostrarVendedor(vendedor);
					menu.menuRetorno();
				}
			
				
				break;
			case 3:
				
				//REGISTRAR PRODUTO
				while(menu.getOpcaoRetorno()==2){
					produto.registrarProduto(produto);
					persist.salvar(produto, produto.getCodigo());
					produto.mostraProduto(produto);
					menu.menuRetorno();
					
				}
				
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("OPCAO ERRADA, DIGITE UMA OPCAO VALIDA!");
				try { Thread.sleep (2000); } catch (InterruptedException ex) {}
				break;
			}
		}
	}
	
	
	
}
