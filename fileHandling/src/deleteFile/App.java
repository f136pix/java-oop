package deleteFile;

import java.io.File;

public class App {

	public static void main(String[] args) {
		File file = new File("testeAcesso\\teste.txt");
		
		//Retornara TRUE caso o DELETE de certo
		if(file.delete()) {
			System.out.println("Deletado com sucesso");
		}else {
			System.out.println("Erro ao deletar");
		}

	}

}
