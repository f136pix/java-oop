package criandoPasta;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File pasta = new File("C:\\testeJava");
		
		//Para criar diretorios, não é necessario o CATCH
		pasta.mkdir();
		System.out.println("Pasta criada");
		
		//Criando uma file dentro do diretorio recem criado
		File file = new File("C:\\testeJava\\text.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
