package gravarObjeto;

import java.io.FileOutputStream;
import java.io.IOException;

public class GravarObjeto extends Contato{{
	
	try{
	FileOutputStream fos = new FileOutputStream("Arquivo.ser");
	
	}catch (IOException e){
		e.printStackTrace();
	}finally{
		System.out.println("..");
	}
	}


}
