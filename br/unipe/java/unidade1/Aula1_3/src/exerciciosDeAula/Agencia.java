package exerciciosDeAula;

public class Agencia {
	
	public void cadastrarConta(ContaCorrente conta){
		
		try{
		
		if(conta.getSaldo()<0){
			
			throw new LisoException("N�o abrimos conta");
			
		}else{
			System.out.println("Conta cadastrada");

		}
		
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Conta nula");
		}catch(ArithmeticException oe){
			System.out.println("Outro erro");
		}finally{
			System.out.println("finaly- sempre executado");
		}
		
		
		
	}
	
	public void consultarConta(ContaCorrente conta)throws Exception{
		if(conta.getSaldo()<0){
			System.out.println("Esta Liso");
			
		}
		System.out.println("Cliente");
	}
	
	
}
