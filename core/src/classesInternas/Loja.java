package classesInternas;

public class Loja {

	public static void main(String[] args) {
		//Criando uma nova porta, baseada na classe Porta, de maneira comum
		Porta porta = new Porta();
		
		//Realizando um IF com o que nos é retornado no metodo portaTrancada
		/*if(porta.portaTrancada("Chave B") == true){
			System.out.println("Loja esta aberta, pode entrar");
		}
		else {
			System.out.println("Estamos fechados, desculpe");
		}
		
		//Desta vez, passando a chave correta como parametro
		if(porta.portaTrancada("Chave A") == true) {
			System.out.println("Loja esta aberta, pode entrar");
		}
		else {
			System.out.println("Estamos fechados, desculpe");
		}*/
		
		//Mesmo codigo, porem ultilizando objetos anonimos:
		if(new Porta().portaTrancada("Chave B") == true){
			System.out.println("Loja esta aberta, pode entrar");
		}
		else {
			System.out.println("Estamos fechados, desculpe");
		}
		
		//Desta vez, passando a chave correta como parametro
		if(new Porta().portaTrancada("Chave A") == true) {
			System.out.println("Loja esta aberta, pode entrar");
		}
		else {
			System.out.println("Estamos fechados, desculpe");
		}
		
		
		
	}
}

