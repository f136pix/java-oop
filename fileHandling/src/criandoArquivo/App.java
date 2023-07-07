package criandoArquivo;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
      
		File file = new File("ArquivoTeste.txt");
		//Criando uma File com os metodos nativos do JAVA, note que é necessario realizar o CATCH manual no metodo
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Dessa vez, selecionando o onde sera salvo o file
		File file2 = new File("C:\\testeJava");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
