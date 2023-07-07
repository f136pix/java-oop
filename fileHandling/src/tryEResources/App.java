package tryEResources;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Lendo um input do Usuario
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um INT");
		int x = scan.nextInt();
		System.out.println(x);
		scan.close();
	}

}
