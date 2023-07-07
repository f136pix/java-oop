package lambdaComVars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	
	
	
}

public class App {

	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>();
		Collections.addAll(list, new Data("Furlan"),new Data("Diego"),new Data("Joao"),new Data("Marcos"));
		
		//Enhanced forLoop
		/*for(Integer i:list) {
			if(i > 10) {
			System.out.println(i);
			}*/
		
		//Ultilizando LAMDA com o METHOD list.Foreach
		list.forEach(data->{  //Recebendo o parametro, da mesma maneira que uma ARROW FUNCTION
		
			System.out.println(data.getName());
		});
		
		List<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2, 1,2,3,4,5,6,7);

		list2.forEach(n ->{
			if(n < 5) {
				System.out.println(n);
			}else {
				System.out.println("maior que 5");
			}
		});

		}

	}


