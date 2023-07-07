package bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		//	A maneira de manter acessibilidade entre diferentes sistemas, é ultilizando o RELATIVE PATH
		
		File file = new File("testeAcesso");

		file.mkdir();
		
		//Criando uma file dentro do diretorio
		file = new File("testeAcesso\\teste.txt"); //Renomeando a VAR File
		//Criando a file
		try {
			file.createNewFile();
			System.out.println("Arquivo de texto criado");
		} catch (IOException e) {
			System.out.println("Houve um erro :" );
			e.printStackTrace();
		}
		
		//Inserindo TEXT dentro da FILE com BUFFEREDWRITER
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));  //Lembrando que com o BUFFEREDWRITER, não precisamos entrar em uma file que ja exista, podemos simplesmente setar o diretorio para onde queremos criar a file ao final
			bw.write("Esse é o texto de texto");
			bw.newLine(); // Pulando a linha no BufferedWriter
			bw.write("Podem haver varios deles dentro de um .txt");
			
			System.out.println("Escrito na file");
			//Finalizando o BUFFEREDWRITER, não é necessario porem é uma boa pratica
			bw.close();
			
		} catch (IOException e) {
			System.out.println("Nada foi escrito no arquivo");
			e.printStackTrace();
		}
		
		//Ultilizando o BUFERREDREADER para ler a file que criamos
		try {
			BufferedReader br = new BufferedReader(new FileReader("testeAcesso\\teste.txt"));
			//Enquanto estiver linhas diponiveis, estaremos lendo
			String linha;
			while((linha = br.readLine()) != null) {
				//Exibindo a linha atual do texto
				System.out.println(linha);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Houve um erro");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Houve um erro");
			e.printStackTrace();
		} 
		
		
		
	}

}
