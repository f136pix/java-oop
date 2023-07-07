package method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Data{
	//Criando um METHOD generico dentro da classe
	//Por usarmos o generico <E>, podemos passar como parametros qualquer tipo, STRING,INT,FLOAT, ETC...
	public <E> void printListData(List<E> list) {
		//Fazendo um FOR IN
		for(E elemento: list) {
			//Printando todos os elementos 
			System.out.println(elemento);
		}
	}
	public <E> void printArrayData(E[] array){
		for(E elemento: array) {
			System.out.println(elemento);
		}
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//Incilializando a classe para usarmos o metodos
		Data data = new Data();
		
		
		List<Integer> listaInt = new ArrayList<>();
		Collections.addAll(listaInt, 1,2,3,4,5,6,7,8);
		
		List<String> listaString = new ArrayList<>();
		Collections.addAll(listaString,"Filipe","Pedro","Raul");
		
		//Note que, graças ao uso de Generic, podemos ultilizar qualquer tipo de LISTA dentrod esse METHOD
		data.printListData(listaInt);
		
		//Note que o metodo se aplica para Strings e INTS, graças ao uso do GENERIC <E>
		data.printListData(listaString);
		
		//Agora, o metodo printArrayData
		
		String[] stringArr = {"Um","Dois","Tres","Quatro"};
		Integer[] integerArray = {1,2,3,4,5,6,7,8};
		
		//Novamente, note que, graças ao GENERIC, podemos ultilizar qualquer um dos tipos
		data.printArrayData(stringArr);

		data.printArrayData(integerArray);
		
	}

}
