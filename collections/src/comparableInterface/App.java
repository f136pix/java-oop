package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Ultilizando essa classe, conseguimos realizar o SORT de acordo com o LENGHT
class Nomes implements Comparable<Nomes>{
	private String nome;

	public Nomes(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Nomes obj) {
		if(nome.length() == obj.nome.length()) {
		return 0;
		}else if(nome.length() < obj.nome.length()) {
		return -1;
		}else {
		return 1;	
		}
	}

	//Criando um ToString, para que o valor dos nomes se torne acessivel
	@Override
	public String toString() {
		return nome;
	}

}

public class App {

	public static void main(String[] args) {
		List demo = new ArrayList<>();
		
		//Adicionando um novo nome ultilizando o constructor da nossa classe
		demo.add(new Nomes("Filipe"));
		demo.add(new Nomes("Luiz"));
		demo.add(new Nomes("Nicolas"));
		demo.add(new Nomes("Vitor"));
		demo.add(new Nomes("Antonio"));
		
		mostraItemsList(demo);
		
		System.out.println("**************************");
		
		Collections.sort(demo);
		mostraItemsList(demo);
		
	}
	
	//Ultilizando o Listiterator
		public static void mostraItemsList(List<Integer> list) {
			//Importando/Inicializando o iterator
			Iterator<Integer> iterator = list.listIterator();
			//Ultilizando o ITERATOR para verifiar se estamos no ultimo item, caso estejamos no ultimo, o codigo ira parar, pois sera retornado FALSE
			while(iterator.hasNext()) 	//Ultilizando o NEXT() para avançar o iterator
			System.out.println("Numero ATUAL: "+ iterator.next());	//Lmebre-se que so temos acesso ao value atual graças ao toString() na classe
			
			
		}

}
