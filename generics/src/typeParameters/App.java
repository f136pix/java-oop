package typeParameters;

/*PADRÃO DE NOMENCLATURA para Tipos de parametros personalizado: 
 * T - TYPE
 * E - ELEMENT
 * K - KEY
 * N - NUMBER
 * V - VALUE
 */

//Criando uma classe que possue um VALUE e uma KEY
class Data<K,V>{
	private K key;
	private V value;
	
	//Constructor
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	//GETTERS
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}

	//ToString
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	//Criando uma função que recebe dois tipos customizados
	public <E, N> void mostrar(E elemento, N numero) {
		System.out.println("Elemento : " + elemento + " // Numero : " + numero);
	}
	
}

public class App {

	public static void main(String[] args) {
		//Note que aqui, estamos definindo os tipos dos parametros customizados, ultilizando o operador <>
		Data<Integer, String> data = new Data<Integer, String>(1, "Filipe");  //Estamos definindo que o primeiro parametro sera um Integer e o Segundo uma String
		
		System.out.println("Key : " + data.getKey() + " // Value : " + data.getValue());
		data.mostrar("Maria", 1);

	}

}
