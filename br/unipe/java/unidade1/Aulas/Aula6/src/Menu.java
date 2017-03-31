import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class Menu {

	public String menuPrincipal() {
		
		String menu = "1 - Sacar \n";
		menu += "2 - Depositar\n";
		menu +="3 - Exibir Saldo\n";
		menu +="4 - Sair\n";
		
		String retorno = JOptionPane.showInputDialog(menu);
		
		return retorno;

	}
	
	public String inputValor(){
		
		String texto = "informe o valor: ";
		String valor = JOptionPane.showInputDialog(texto);
		
		
		return valor;
	}

}
