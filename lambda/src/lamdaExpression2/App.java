package lamdaExpression2;

interface Lambda {
	public void demo();
	public void demo2(int x);
}

public class App {

	public static void main(String[] args) {
		
		//Criando o THREAD1
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Dentro do Thread 1");
				
			}
		});
		//Rodando o THREAD 1
		thread1.start();
	
	//Agora ultilizando LAMDA
		Thread thread2 = new Thread(()->{
			System.out.println("Dentro do Thread 2");
			});
		thread2.start();
	
	
	
	
	
	
	
	
	
	}

}
