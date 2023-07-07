package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
			//Criando uma LINKEDLIST
			List<String> paises = new LinkedList<>();
			//Note que podemos ultilizar apenas LIST ao criar a ARR, posi LIST é PAI/SUPER de LINKEDLIST
			//ArrayList<String> paises = new LinkedList<>();
			
			//Ultilizando o metodo ADDALL de COLLECTIONS
			//PARAMS : lista que recebera os dados // dados passados
			Collections.addAll(paises,"Brasil","EUA","Japao","Argentina");
			
			//Ultilizando o metodo criado por nós
			mostrarItems(paises);
			
			//Adicionando chile no INDEX 1 da LIST
			paises.add(1, "Chile");
			
			//Ultilizando o metodo criado por nós
			mostrarItems(paises);
			
			//Criando uma ARRAYLIST
			List<String> demo = new ArrayList<>();
			//Note que podemos ultilizar apenas LIST, posi LIST é PAI/SUPER de ARRAYLIST
			//List<String> demo = new ArrayList<>();

			//Ultilizando o metodo ADDALL de COLLECTIONS
			//PARAMS : lista que recebera os dados // dados passados
			Collections.addAll(demo,"UM","DOIS","TRES","QUATRO");
			
			mostrarItems(demo);
			
	}
	
	//Criando um metodo mostrarItems
	public static void mostrarItems(List<String> list) { //Ultilizando LIST, conseguimos mostrar qualquer lista de STRINGS, seja LINKEDLIST ou ARRAYLIST
		System.out.println("*****************************************");              
		for(String atual : list) {
			System.out.println("Elemeto Atual : " + atual);
		}
	}
	
	//O codigo abaixo funcionaria com PAISES, mas não com DEMO
	public static void mostrarLinkedList(LinkedList<String> list) { //Ultilizando LIST, conseguimos mostrar qualquer lista de STRINGS, seja LINKEDLIST ou ARRAYLIST
		System.out.println("*****************************************");              
		for(String atual : list) {
			System.out.println("Elemeto Atual : " + atual);
		}
	}
	
	

}
