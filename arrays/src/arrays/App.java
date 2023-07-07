package arrays;

public class App {

	public static void main(String[] args) {
		//Declarando ARRAYS em JAVA: 
		String[] nomes = {"Filipe","Joao","Marcos"};
		System.out.println(nomes[0]);
		
		//Adicionando ITEMS separadamente
		int[] arrlDeInteiros; //Inicializando a Arr
		arrlDeInteiros = new int[10]; //Alocamos espaço para 10 items dentro de nossa Arr
		arrlDeInteiros[5] = 10; //Dando ao ITEM 5 da ARR o valor 10
		System.out.println(arrlDeInteiros[5]); //Printando o valor do item 5 da ARR 
	
	}

}
