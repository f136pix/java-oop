package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(new File("testeAcesso\\teste.txt"));
		
		while(sc.hasNext()) { //Iterando no arquivo para passarmos por todas as linhas
			System.out.println(sc.nextLine()); //Printando a linha do arquivo, o metodo NEXTLINE() retorna a linha que esta sendo lida atualemnte
		}
		//Fechando o SCANNER
		sc.close();
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		}
		

	}

}
