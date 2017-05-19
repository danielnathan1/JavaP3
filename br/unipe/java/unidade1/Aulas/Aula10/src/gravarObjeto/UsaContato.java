package gravarObjeto;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UsaContato {
	public static void main(String[] args) {
		GravarObjeto gravar = new GravarObjeto();
		LerObjeto ler = new LerObjeto();
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.println("Digite o ID: ");
		String id= leitor.nextLine();
		System.out.println("Digite o Nome: ");
		String nome = leitor.nextLine();
		
		try{
			FileOutputStream fos = new FileOutputStream("arquivo.txt");
			byte[] contentINBytes = id.getBytes();
			fos.write(contentINBytes);
			byte[] contetINBytes2 = nome.getBytes();
			fos.write(contetINBytes2);
			fos.close();
			FileReader fr = new FileReader("arquivo.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			br.close();
			System.out.println(s);
			
			
		}catch (Exception e) {
			System.out.println("erro");
		}
		
		
		
		
	}

}
