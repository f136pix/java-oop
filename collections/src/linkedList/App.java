package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		//Criando uma LINKEDLIST
		LinkedList<String> paises = new LinkedList<>();
		
		//Ultilizando o metodo ADDALL de COLLECTIONS
		//PARAMS : lista que recebera os dados // dados passados
		Collections.addAll(paises,"Brasil","EUA","Japao","Argentina");
		
		System.out.println(paises);
		
		//Adicionando chile no INDEX 1 da LIST
		paises.add(1, "Chile");
		
		System.out.println(paises);
		

	}
	
	

}
