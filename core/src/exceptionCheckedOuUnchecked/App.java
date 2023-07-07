package exceptionCheckedOuUnchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		
		//Esse é um exemplode de CHECKED exception que é uma EXCEPTION prevista, averiguada pelo JAVA
		System.out.println("Checked Exeption : ");
		int x = 10;
		int y = x/0;
		
		//Exemplo de UNCHECKED, pois para ultilzarmos o FileReader temos que averiguar manualmente se ouve alguma EXCEPTION
		try {
			FileReader in = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //Printando o erro
		}

		
	}

}
