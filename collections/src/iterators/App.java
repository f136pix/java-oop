package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> demo = new ArrayList<>();
	
		Collections.addAll(demo,"UM","DOIS","TRES","QUATRO");
		
		mostraItems(demo);
		
		System.out.println("************************");
		
		mostraItemsList(demo);

	}
	
	//Ultilzanso o Iterator
	public static void mostraItems(List<String> list) {
		
		//Importando/Inicializando o iterator
		Iterator<String> iterator = list.iterator();
		//Ultilizando o ITERATOR para verifiar se estamos no ultimo item, caso estejamos no ultimo, o codigo ira parar, pois sera retornado FALSE
		while(iterator.hasNext()) 	//Ultilizando o NEXT() para avançar o iterator
			System.out.println("Numero ATUAL: "+ iterator.next());
		
	}
	
	//Ultilizando o Listiterator
	public static void mostraItemsList(List<String> list) {
		//Importando/Inicializando o iterator
		Iterator<String> iterator = list.listIterator();
		//Ultilizando o ITERATOR para verifiar se estamos no ultimo item, caso estejamos no ultimo, o codigo ira parar, pois sera retornado FALSE
		while(iterator.hasNext()) 	//Ultilizando o NEXT() para avançar o iterator
		System.out.println("Numero ATUAL: "+ iterator.next());
		
		
	}
}
