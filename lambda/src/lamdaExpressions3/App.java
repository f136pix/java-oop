package lamdaExpressions3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
		private String nome;

		public Data(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "Data [nome=" + nome + "]";
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}		
		
		
	}


public class App {

	
	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>();
		
		
		Collections.addAll(list, new Data("Joao"), new Data("Mario"), new Data("Pedro"));
		
		/*
		//Ultilizando o SORTING para ordenar a lista sem o LAMBDA
		Collections.sort(list, new Comparator<Data>() {

			@Override
			public int compare(Data o1, Data o2) {
				if(o1.getNome().length() < o2.getNome().length()) {
					return -1;
				}else if(o1.getNome().length() > o2.getNome().length()) {
					return -1;
				}else {
					return 0;
				}
			}
			
		}); */
		
		//Ultilizando LAMDA
			Collections.sort(list,(Data o1, Data o2)-> {
				if(o1.getNome().length() < o2.getNome().length()) {
					return -1;
				}else if(o1.getNome().length() > o2.getNome().length()) {
					return 1;
				}else {
					return 0;
				}
			});
			
			System.out.println(list);
		
		
	
	}

}
