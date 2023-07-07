package classesInternasAnonimas;

public class Loja {

	public static void main(String[] args) {
		
		Porta porta = new Porta();
		
		//Salvando o resultado da função em uma variavel
		boolean estaAberta = porta.getTranca().estaTrancada("Chave A");
								 //Ultilizamos getTranca() para entrar na classe abstrata Tranca
		if(estaAberta == true) {
			System.out.println("A porta esta aberta");
		}
		else{
			System.out.println("A porta esta fechada");
		};
		
	};

};
