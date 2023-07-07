package throwEThrows;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args)  {
		try {
			method2();	//method2() possui um throw, para que caiamos no catch abaixo
		} catch (FileNotFoundException e){ //Ultilizando o THROW estamos forçando um erro do tipo FileNotFoundException, e por isso entramos neste CATCH
			System.out.println("Dentro do bloco catch");
		}
	}
	
	
	//Ultilizando THROWS
	public static void method2() throws FileNotFoundException { //Throws executam um erro, dessa maneira conseguimos forçar um CATCH
		System.out.println("Dentro o metodo");  // O metodo será executado até aqui, pois logo depois é feito um THROW
		throw new FileNotFoundException(); //Asim que é realizado um THROW, as linhas que vem depois se tornam unreacheable
		//System.out.println("Method2");
	}

		
}
	

	