package compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		List<String> lista = new ArrayList();
		
		Collections.addAll(lista, "Mar","Terra","Ar","Fogo");
		
		//Lembrando que o return de compareTo() é o seguinte : 
		//Caso os parametros passados sejam iguais : 0
		//Caso o primeiro parametro seja maio que o segundo : 1
		//Caso o segundo parametro seja maior que o primeiro : -1
		
		if(lista.get(0).compareTo("Mar") == 0) { //Verificando se os parametros são iguais
			System.out.println("Os parametros são iguais");
		}
		else {
			System.out.println("Os parametros são diferentes");
		}
		
		
		//Ultilizando compareTo em uma String de INTS
		List<Integer> lista2 = new ArrayList();
		
		Collections.addAll(lista2, 1,2,3,4);
		
		int value = lista2.get(0).compareTo(1);
		System.out.println(value);
		
	}

}