import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsaAgencia {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		// Scanner leitor = new Scanner(System.in);

		Menu menu = new Menu();
		int opcao = 0;
		String inputText;
		Float valorOpercao = 0.0f;

		while (true) {

			inputText = menu.menuPrincipal();

			opcao = Integer.parseInt(inputText);

			// sacar
			if (opcao == 1) {
				inputText = menu.inputValor();

				valorOpercao = Float.parseFloat(inputText);
				valorOpercao = conta.getSaldo() - valorOpercao;
				conta.setSaldo(valorOpercao);
				
				JOptionPane.showMessageDialog(null,conta.getSaldo());
				
			}
			if(opcao==4){
				String msg = "Obrigado por usar FujiSystem";
				JOptionPane.showMessageDialog(null, msg);
				System.exit(0);
				
			}

		}

	}

}