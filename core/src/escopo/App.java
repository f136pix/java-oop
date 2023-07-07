package escopo;

public class App {
	
	static int i = 100;
	static int j = 200;
	public static void main(String[] args) {
		
		{
		//Dentro deste tescopo, I foi redeclarado como 5, J que por sua vez não teve o valor redeclarado, continua tendo o mesmo
		System.out.println("I : "+ i);
		System.out.println("J : "+ j);
		}
		
		System.out.println("I : "+ i);
		System.out.println("J : "+ j);
	}

}
