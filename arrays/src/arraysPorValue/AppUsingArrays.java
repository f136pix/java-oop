package arraysPorValue;

public class AppUsingArrays {

	public static void main(String[] args) {
		String[] nomes = {"Filipe","Joao","Marcos"};
		//Criando um novo App para termos acesso a todos os METHODS e CLASSES
		AppUsingArrays app = new AppUsingArrays();
		app.mostrarNomes(nomes);
		
		System.out.println("------------------");
		System.out.println(nomes[0]); //Neste caso, conseguimos modificar a ARR mesmo ela possuindo o mesmo nome do INPUT, pois a forma como a memoria é alocada é diferente de uma INT
		}
	
	void mostrarNomes(String[] nomes) {
		for(String nomeAtual : nomes) {
			System.out.println(nomeAtual);
		}
		
		nomes[0] = "Lucas";
	}

}
