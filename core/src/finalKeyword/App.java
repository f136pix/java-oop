package finalKeyword;

public class App {

	public static void main(String[] args) {
		B obj1 = new B(1);
		//Note que o valor foi enviado ao Y, pois X é variavel com valor FINAL definido, e nao pode possuir um PARAMETIZED CONSTRUCTOR
		System.out.println("valor de Y : " + obj1.getY());
		System.out.println("valor de X : " + obj1.getX());
		
		
		obj1.ola();
		obj1.thcau();
	}

}
