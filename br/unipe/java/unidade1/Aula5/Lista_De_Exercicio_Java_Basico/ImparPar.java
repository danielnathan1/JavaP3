import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		int i=0;
		
		while(i<10){
			
			System.out.println("Digite o numero : ");
			numero = leitor.nextInt();
			
			if((numero % 2) == 0){
				System.out.println(numero + " é par\n");
				
			}else{
				
				System.out.println(numero + " é impar\n");
				
			}
			
			i+=1;
		}
		
	}
}
