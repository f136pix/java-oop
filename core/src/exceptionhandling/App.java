package exceptionhandling;

public class App {

	public static void main(String[] args) {
		//Testando caso1
		App obj = new App();
		obj.caso1(4, 0);
		//Testando o caso 2, onde ultilizamos EXCEPTION HANDLING
		obj.caso2(4, 0);
		
	}

	public void caso1(int x,int y) {
		//Verificando manualmente se Y, não é igual a zero, para não termos um problema, pos caso tentamos dividir por 0, o JAVA gera um erro
		if(y!=0) {
		System.out.println(x/y);
		}else {
		System.out.println("Valor de y é 0");
		}
	}
	
	public void caso2(int x,int y) {
		//Sera executado o bloco TRY, e caso haja algum erro do tipo EXCEPTION, sera executado o bloco CATCH
		try {
		System.out.println(x/y);	//Desta maneira podemos tratar dos erros de maneira mais generica
		}catch(Exception e) {
			System.out.println("Valor de y é 0");
		}
	}
}
