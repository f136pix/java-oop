package exceptionHandling2;

public class App {

	public static void main(String[] args) {
		
		int x = 0, y = 0;
		
		//Ao ultilizar o Exception Handling, podemos ter varios CATCH, para diferentes erros, mas apenas um TRY
		try {	//Caso haja algum erro ao realizar a operação(e havera), iremos cair no CATCH
			x = (y = 10*10)/0;//O valor de Y sera atribuido, mas não o de X, pois o valor de Y é atribuido antes de ser encotnrado o Exception Error
			System.out.println("Isso não sera executado,pois um erro Exception foi encontrado antes de chegarmos nesta linha");
		}catch(Exception e){ //CATCHING um erro do tipo EXCEPTION
			System.out.println("Erro apresentado : ");
			e.printStackTrace(); //Printando o erro no console
		}
		System.out.println("Valor de y : "+ y);
		System.out.println("Valor de x : "+ x);
		
		System.out.println("**********************");
		
		//Note que devemos sempre realizar a apresentação do erro mais especifico, no caso o CATCH de ArithmeticException, pois se trata de um erro mais especifico que EXCETION
		//Entenda que EXCEPTION é PAI de ARITHMETIC EXCEPTION, por isso ARITHMETIC EXCEPTION deve ser chamado antes, pois caso não seja do tipo ARITHMETIC, então podemos lançar a EXCEPTION 
		try {	
			x = (y = 10*10)/0;
			System.out.println("Isso não sera executado,pois um erro Exception foi encontrado antes de chegarmos nesta linha");
		}catch(ArithmeticException e){ //Verificando se houve um EXCEPTION do tipo ArithmeticException
			System.out.println("Erro apresentado : Arithmetic Exception");
		}
		catch(Exception e){ //Verificando se houve um EXCEPTION de qualquer tipo
			System.out.println("Erro apresentado : Exception");
		}

	}

}
