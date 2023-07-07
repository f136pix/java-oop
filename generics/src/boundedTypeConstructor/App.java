package boundedTypeConstructor;

//Fazendo com que K deva ser do tipo Integer, note que integer é um FINAL TYPE, ou seja, não ha CHILDS e o unico TYPE aceitado sera INT
class Data <K extends Integer ,V extends App>{  //Estamos também setando que V, deve ser da classe APP, por isso estamos passando como parametro no CONSTRUCOTR um new APP
	private K key;
	private V value;
		
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	//Estamos restrigindo N a classe numero, ou sejam, N deve ser da classe Number ou um child da mesma, como Byte, Float, Integer, Decimal...
	public <E,N extends Number> void display(E elemento,N numero) {
		System.out.println("Elemento : "+ elemento + " // Numero: "+ numero);
	}
	
}

public class App {
	
	public static void main(String[] args) {
		Data data = new Data(1, new App());
		//Ao ultilizar o codigo abaixo, nos sera apontado um erro, pois N deveria ser Number, não String
		//data.display("elemento", "numero");
		
		//Porem, passando um INT como prametro, não teremos problemas : 
		data.display("elemento", 0);
		
		//Ultilizando um methodo ne APP, que foi passado no contructor de Data
		data.getValue().teste();

	}

	//Classe que sera passada no CONSTRUCTOR
	public void teste(){
		System.out.println("Sou CHILD da classe app");
	}

}
