package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) {
		
	Map<String, String> mapaString = new HashMap<>();
	
	mapaString.put("01", "Primeiro");
	mapaString.put("02", "Segundo");
	
	System.out.println(mapaString.keySet());
		System.out.println(mapaString.values());
		
	String nome = mapaString.get("02");
	}
}
