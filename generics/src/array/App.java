package array;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Criando uma classe que recebe um tipo indefinido <T>
class Data<T>{
	private T variavel;

	//Constructor	
	public Data(T variavel) {
		this.variavel = variavel;
	}

	//GETTER
	public T getVariavel() {
		return variavel;
	}

	//ToString
	@Override
	public String toString() {
		return "Data [variavel=" + variavel + "]";
	}
}
	
	

public class App {

	public static void main(String[] args) {
		
		//Criando uma lista de objetos da nossa classe Data
		List<Data<Object>> elementos = new LinkedList<>();
		elementos.add(new Data<Object>("String"));
		elementos.add(new Data<Object>(1.0));
		elementos.add(new Data<Object>("&"));
		
		printarLista(elementos);
	}
	
	public static void printarLista(List<Data<Object>> arr) {
		ListIterator<Data<Object>> iterator = arr.listIterator();
		while (iterator.hasNext()) {
			//Ultilizando o GETTER para printar o valor do item atual
			System.out.println("Elemento: " + iterator.next().getVariavel());
		}
	}
	
	
}


