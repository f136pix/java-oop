package arrayList;

import java.util.Collections;
import java.util.ArrayList;

public class arrayList1 {

	//Criando uma ArrayList ultilizando COLLECTIONS FRAMEWORK
	static ArrayList<String> listaDeNomes = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//Similar ao PUSH
		listaDeNomes.add("JOAO");

		//Printando uma posição especifica da Arr
		//System.out.println(listaDeNomes.get(0));
		
		//Ultilizando COLLECTIONS para adicionar multiplos ITEMS
		Collections.addAll(listaDeNomes, "LUCAS","OTAVIO","ANTONIO","RAFAEL");
		
		//Printando a ARR inteira, só conseguimos fazer desta maneira ultilizando COLLECTIONS, caso contratio seria necessario um ForEach
		//System.out.println(listaDeNomes);
		mostrarLista(listaDeNomes);
		
		//Removendo um ITEM baseado na posicao, no caso o primeiro ITEM
		removerItemPosicao(listaDeNomes, 0);
		mostrarLista(listaDeNomes);
		
		//Removendo um ITEM por String
		removerItemString(listaDeNomes, "OTAVIO");
		mostrarLista(listaDeNomes);
	
		//Modificando um ITEM
		modificarNomePorPosicao(listaDeNomes, 0, "DIEGO");
		mostrarLista(listaDeNomes);
	
		//Modificando um ITEM por nome
		modificarNomePorPosicao(listaDeNomes, encontrar(listaDeNomes, "DIEGO"), "LUCAS");
		mostrarLista(listaDeNomes);
	}
	
	//Iremos declarar todos os METHODS como STATIC para facilitar o acesso
	public static void mostrarLista(ArrayList<String> lista) {
		//Podemos ultilizar tanto o ForEach quando o sysout
		/*for(String nome : lista){
			System.out.println(nome);
		}
		System.out.println("-----------------------------");
		*/
		//Apenas podemos ultilizar o SYSOUT para arrays que ultilizam a COLLECTIONS FRAMEWORK 
		System.out.println(lista);
	}
		
	public static void removerItemPosicao(ArrayList<String> lista, int posicao) {
		//Removendo baseado na posicao
		lista.remove(posicao);
	}
	
	public static void removerItemString(ArrayList<String> lista, String nome) {
		//Removendo baseado em String
		lista.remove(nome);
	}
	
	public static void modificarNomePorPosicao(ArrayList<String> lista, int posicao, String nomeNovo) {
		lista.set(posicao, nomeNovo);
	}
	//Veja que iremos ultilizar este metodo dentro de outro, para modificar o ITEM em determinado INDEX
	public static int encontrar(ArrayList<String> lista, String nome) { //Note que como estamos retornando um INT para usar dentro da outra FUNC, estamos declarando como INT não VOID
		return lista.indexOf(nome); 
	}
	
	

}