package lambdaPredicates;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		
		//Criando uma Interface sem o LAMDA : 
		IntPredicate menorDe18 = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				if(value < 18) {
					return true;
				} else {
				return false;
				}
			}
		};
		
		System.out.println(menorDe18.test(12));
		
		//Agora, ultilizando o LAMNDA operator
		IntPredicate menorDe18Dois = i -> i< 18;  //Estamos simplesmente retornando True caso i seja menor que 18, e false caso seja maior
		//Note que estamos alterando o metod TEST de IntPredicate
		System.out.println(menorDe18Dois.test(5));
	
	
	//Ultilizando DOIS predicades juntos : 
	IntPredicate maisQue10 = i->i>10 ;
	IntPredicate menosQue20 = i->i<20 ;

	//O metodo AND pode ser usado entre Predicates
	System.out.println(maisQue10.and(menosQue20).test(15));
	}
}
