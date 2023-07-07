package lambdaPredicates2;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		 
		IntPredicate maisQue10 = i->i>10 ;
		IntPredicate menosQue20 = i->i<20 ;

		//Passando os PREDICATES criados como parametros
		demo(13, maisQue10,menosQue20 );
		
	}
	
	public static void demo (int x, IntPredicate menosQue20, IntPredicate maisQue10) {
		if(maisQue10.and(menosQue20).test(x)){
			System.out.println("O input esta entre 10 e 20");
		} else {
			System.out.println("O valor é menor que 10 ou maior que 20");
		}
	}


}
