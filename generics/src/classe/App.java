package classe;

class Data {
	private Object obj;

	//Constructor de DATA
	public Data(Object obj) {
		this.obj = obj;	
	}

	//Getter
	public Object getObj() {
		return obj;	
	}	
}
					
				  //<T> simboliza TYPE, uma vez que não sabemos qual sera o tipo recebido 
class classeGenerica<T>{
	
	private T data;

	//Constructor de classeGenerica
	public classeGenerica(T data) {
		this.data = data;
	}

	//Getter
	public T getData() {
		return data;
	}

	//toString
	@Override
	public String toString() {
		return "classeGenerica [data=" + data + "]";
	} 
	
	
	
}


public class App {

	public static void main(String[] args) {
		
		//DATA, por possuir uma PROP que é um obj, pode receber qualquer tipo de dado : String, Boolean, INT, etc...
		Data data = new Data("Uma String");
		//Precisamos transformar o objeto que pegamos no GETTER em String para armazena-lo em uma variavel do tipo String
		String check = (String)data.getObj();
		//Conseguimos pegar a STRING mesmo com a propriedade de DATA sendo do tipo OBJETOS porque OBJETOS são super de todos os tipos, incluindo Strings
		System.out.println(check);
		
		//Estamos especificando que os dados <T> da classe serão Strings
		classeGenerica<String> classeGenerica = new classeGenerica<String>("Uma String");
		//Note que, como ja especificamos que DATA será uma String, não há mais necessodade do metodo (String)
		String data2 = classeGenerica.getData();
		System.out.println(data2);
		
		
	}

}
