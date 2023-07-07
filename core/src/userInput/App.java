package userInput;

//Importando a classe SCANNER
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Qual o seu nome");
		
		//Inicializando a classe SCANNER
		Scanner sc = new Scanner(System.in);
		//Scaneando o input do user, ultilizando o metodo NEXT da classe SCANNER
		String nome = sc.next();
		//Exibindo o nome ultilizando a variavel na qual ele foi salvo
		System.out.println("Ola, " + nome);
		
		//Dessa vez recebendo INT
		System.out.println("Qual é sua idade");
		int idade = sc.nextInt();
		System.out.println("Sua idade é "+idade);

	}

}
