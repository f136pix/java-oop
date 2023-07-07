package lamdaExpression;

interface Lambda {
	public void demo();
}

public class App {

	public static void main(String[] args) {
		
		//Sem o uso de Lamda expression, declarar DEMO() seria feito desta maneira
 		Lambda lambda = new Lambda() {
			
			@Override
			public void demo() {
				System.out.println("Mensagem 1");
				
			}
		};

		lambda.demo();
		
		//Ultilizando o LAMDA operator, fica muito mais simples : 
		Lambda lambda2 = ()->{
			System.out.println("Mensagem 2");
			};
		lambda2.demo();
		
	}

}
