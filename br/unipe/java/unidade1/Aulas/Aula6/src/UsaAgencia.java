
import javax.swing.JOptionPane;

public class UsaAgencia {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();


		Menu menu = new Menu();
		int opcao = 0;
		String inputText;
		Float valorOpercao = 0.0f;
		String valorError = "Valor invalido!";


		while (true) {

			inputText = menu.menuPrincipal();

			opcao = Integer.parseInt(inputText);

			// SACAR
			if (opcao == 1) {
				inputText = menu.inputValor();
				
				valorOpercao = Float.parseFloat(inputText);
				//no caso de valores negativos
				if(valorOpercao > 0){

					valorOpercao = conta.getSaldo() - valorOpercao;
					conta.setSaldo(valorOpercao);
				}else{
					JOptionPane.showMessageDialog(null, valorError);
				}
				
				JOptionPane.showMessageDialog(null,conta.getSaldo());
			}
			
			//DEPOSITAR
			if(opcao == 2){
				inputText = menu.inputValor();
				
				valorOpercao = Float.parseFloat(inputText);
				
				//No caso de Valores Negativos
				if(valorOpercao > 0){
		
					valorOpercao = conta.getSaldo() + valorOpercao;
					conta.setSaldo(valorOpercao);		
				}else{
					JOptionPane.showMessageDialog(null, valorError);
				}
				
				JOptionPane.showMessageDialog(null, conta.getSaldo());
			
			}
			
			//VER SALDO
			if(opcao==3){
				JOptionPane.showMessageDialog(null, conta.getSaldo());
			}
			
			//SAIR
			if(opcao==4){
				String msg = "Obrigado Por utilizar o Sistema!!";
				JOptionPane.showMessageDialog(null, msg);
				System.exit(0);
				
			}

		}

	}

}