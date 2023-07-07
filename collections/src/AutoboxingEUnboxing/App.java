package AutoboxingEUnboxing;

import java.util.ArrayList;

//Ultilizaremos esta classe para o entendimento de UNBOX/AUTOBOX
	class intWrapper{
		public int valor;
	
	public intWrapper(int valor) {
		this.valor = valor;
		}
	}

public class App {

	public static void main(String[] args) {
		//Note que não podemos iniciar uma ARR DE INT, pois int é um tipo primitivo, e não são aceitos em ARR
		//ArrayList<Int> numeroEstudantes = new ArrayList<>();
		//Podemos porem, ultilizar Integer, que servem como INTS, porém são classes compostas, e por isso podem ser ulsados em ARR
		ArrayList<Integer> numero = new ArrayList<>();
		
		//Note que manipulamos uma ARR de INTEGER de maneira extremamente semelhante a uma ARR de INT
		numero.add(40);
	
		//Isso tudo funciona por causa de UNBOX e AUTOBOX:
		ArrayList<intWrapper> numero2 = new ArrayList<>();
		numero2.add(new intWrapper(2)); //Boxing -> Estamos fazendo automaticamente o WRAP que o JAVA faz para nos ao ultilizarmos por exemplo a classe Integer
		System.out.println(numero2.get(0).valor); //Unboxing -> Precisamos entrar dentro das props do valor para saber qual é o mesmo
	
		//Não temos problemas em ultilizar DOUBLE, pois se trata de uma classe, o proprio JAVA realiza o AUTOBOXING para nós
		ArrayList<Double> listaDouble = new ArrayList<>();
		listaDouble.add(1.0);
		//Como DOUBLE é uma classe, podemos adicionar ITEMS destas maneiras:
		listaDouble.add(new Double(2.5));
		listaDouble.add(Double.valueOf(3.0));
		//Podemos mostrar o valor desta maneira, poiso JAVA realiza o UNBOXING automaticamente para nós
		System.out.println(listaDouble);
		System.out.println(listaDouble.get(0)); //AUTOBOXING
		//Porém, por baixo dos panos, o JAVA faz isso, e podemos fazer tamém
		System.out.println(listaDouble.get(0).doubleValue()); //UNBOXING
	
	
	}
	
	

}
