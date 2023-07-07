package userDefinedException;

import java.io.FileNotFoundException;

//Criando uma Throwable 
class ExceptionCustomizada extends Throwable{
	
}

public class App {

	public static void main(String[] args) {
		try {
			method();	
		} catch (FileNotFoundException e){ //Dependendo do valor de X, iremos cair em um CATCH diferente
			e.printStackTrace();
		}catch (ExceptionCustomizada e) {
			e.printStackTrace();  //Estamos fazendo o CATCH e enviando o erro definido por nós onde criamos o THROWABLE
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	
	//Ultilizando THROWS               Tipos de exception que podem ser feitos o THROW
	public static void method() throws Exception, FileNotFoundException, ExceptionCustomizada { 
		int x = 4;
		
		switch(x) {
		case 1: throw new FileNotFoundException();
			//Note que não há necessidade de BREAK, pois ao fazer o THROW, o codigo é interrompido é retornado THROW
		case 2: throw new Exception();
			//Iremos fazer o throw de EXCEPTIONCUSTOMIZADA, que é definido no inicio do código, por nós mesmo
		default : throw new ExceptionCustomizada();
		}
	}
}
