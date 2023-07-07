package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	//SETS são exteremamente MEMORY EFFICIENT, porem menos previsiveis e manipualaveis que outras COLLECTIONS
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Joao");
		set.add("Pedro");
		set.add("Luiz");
		set.add("Luiz");
		set.add("Antonio");
		set.add("Joao");
	
		//Note que em HASH, os itens repetidos são retirados, neste caso Luiz e Joao, e que eles não são salvos na mesma ordem que sao adicionados
		for(String nome : set) {
			System.out.println(nome);
		}
		
		//SETS NÃO POSSUEM GETTERS, porem podemos ultilizar CONTAINS para verificar se certo atributo esta no SET
		System.out.println(set.contains("Joao"));
		
		System.out.println("//////////////////////////");
		
		//Ulitilizando um for para prencher um SET
		Set<Integer> set2 = new HashSet<>() ;
			
			for(int i = 30; i>0; i--){
				set2.add(i);
				}
			
			for(int i: set2) {
				System.out.println(i);
			}
		
		
		System.out.println("//////////////////////////");
		
		//Linked HASH são o contrario de listas normais, pois informações adicionadas posteriormente são adicionadas antes no HASH
		Set<Integer> set3 = new LinkedHashSet<>() ;
			
			for(int i = 30; i>0; i--){
				set3.add(i);
				}
			
			for(int i: set3) {
				System.out.println(i);
			}
			
			System.out.println("//////////////////////////");
			
			//TREEHASH adiciona de maneira semelhante á alfabetica, com preferiencia pleo primeiro numero, não pelo valor como um todo
			Set<String> set4 = new TreeSet<>() ;
				
				for(int i = 30; i>0; i--){
					set4.add("A" +i);
					}
				
				for(String i: set4) {
					System.out.println(i);
				}
	}
}
