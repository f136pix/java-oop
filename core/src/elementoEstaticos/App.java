package elementoEstaticos;

public class App {
	
	//Variaveis estaticas estão alocadas juntas, e compartilham os mesmos dados, neste caos OBJ1,2,3 são todos iguais e ao alterar o valor de um, altera-se o dos demais

	public static void main(String[] args) {
		TestEstatico obj1 = new TestEstatico(); 
		System.out.println("Valor de OBJ1 :" + obj1.getVariavelEstatica());
		TestEstatico.setVariavelEstatica(1);		//Acessar metodos estaticos : nomeDaClasse.NomeDoMetodo
		System.out.println("Valor de OBJ1 :" + TestEstatico.getVariavelEstatica());
		
		TestEstatico obj2 = new TestEstatico();
		System.out.println("Valor de OBJ2 :" + obj2.getVariavelEstatica());
		obj2.setVariavelEstatica(24);
		System.out.println("Valor de OBJ2 :" +obj2.getVariavelEstatica());
	
		TestEstatico obj3 = new TestEstatico();
		System.out.println("Valor de OBJ3 :" + obj3.getVariavelEstatica());
		
		//Note que chamar OBJ1.getVariavelEstatica(), ou OBJ2.getVariavelEstatica(), ou OBJ3.getVariavelEstatica(),
		//são a mesma coisa que ultilizar TestEstatico.getVariavelEstatica(), pois por serem estaticos, são todos iguais e possuem o mesmo valor.
		
	}

}
