package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class App {

		public static void main(String[] args) {
			List<String> demo = new ArrayList<>();
			
			Collections.addAll(demo,"D","E","B","C","A");
			
			//Realizando o SORT da ARRAY
			demo.sort(null);//O parametro NULL ira organizar em ordem crescente, no caso alfatabetica
			System.out.println(demo);	
			
			//Para realizar o SORT em ordem decrescente, ou contrario da alfabetica, podemos reverter uma ARRAY que já foi SORTED
			//Ulitilizando o metodo reverse do COLLECTIONS FRAMEWORK
			Collections.reverse(demo);
			System.out.println(demo);
				
				
				
				
			}

	}

