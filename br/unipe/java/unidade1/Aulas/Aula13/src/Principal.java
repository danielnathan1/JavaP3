
public class Principal {
	public static void main(String[] args) {
		
			Compressor compressor = new WinRar();
			compressor.comprimir();
			compressor.descomprimir();
			
			compressor = new WinZip();
			compressor.comprimir();
			compressor.descomprimir();
			
	}
}
