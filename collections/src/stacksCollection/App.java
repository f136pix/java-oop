package stacksCollection;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		//Criando um STACK
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		
		//Note que podemos ultilizar INT ao itnerar com INTEGER
		for(int atual: demo) {
			System.out.println(atual);
		}
		
		System.out.println("------------------------------");
		
		//Tirando o ultimo elemento
		demo.pop();
		
		for(int atual: demo) {
			System.out.println(atual);
		}
		
		System.out.println("------------------------------");
		
		//Pegando o ultimo elemento
		System.out.println(demo.peek());
		
		//Lipando a Arr
		demo.clear();
		
		System.out.println("------------------------------");
		
		//Descobrindo se esta vazio
		if(demo.empty()){
			System.out.println("A array esta vazia");
		}
		else {
			System.out.println("Há items na Array");
		}
		
	}

}
