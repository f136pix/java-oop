package comparableInterface;

	
	//No caso, para conseguirmos ultilizar os metodos de comparação, T sera subClass de Comparable 
	class Data<T extends Comparable<T>> implements Comparable<T>{
		private T minhaVariavel;
		
		
		//Constructor
		public Data(T key) {
			this.minhaVariavel = key;
			
		}

		//GETTERS
		public T getMinhaVariavel() {
			return minhaVariavel;
		}
		
		//ToString
		@Override
		public String toString() {
			return "Data [key=" + minhaVariavel + "]";
		}

		@Override
		public int compareTo(T o) {
			
			return getMinhaVariavel().compareTo(o);
		}
	}
		
public class App {

	public static void main(String[] args) {
		// O comparable T sera do tipo Integer
		Data<Integer> data = new Data<Integer>(1);
		System.out.println(data.compareTo(1)); //O output sera 0 pois estamos comparaando 1 com 1, logo, como são oguais, o valor devera ser 0
		
	}
}
	
