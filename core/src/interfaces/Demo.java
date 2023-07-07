package interfaces;

public class Demo {

	public static void main(String[] args) {
		
		//Chamando um objeto da Interface celular, no caso um Xiaomi, ultizando polimorfismo, 
		//ultilizamos a interface celular para criar um Xiaomi e um Iphone
		
		Celular xiaomi = new Xiaomi();
		System.out.println(xiaomi.toString());

		Celular iphone = new Iphone();
		System.out.println(iphone.toString());
	}

}
