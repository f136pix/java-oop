package classeAbstrata;

import classeAbstrata.pessoa.*;
public class demo {

	public static void main(String[] args) {
		Pessoa joao = new Vegano();
		joao.falar();
		joao.comer();
		joao.respira();
		joao.mensagem();
		System.out.println("-------------------------");
		Pessoa maria = new Carnivoro();
		maria.falar();
		maria.comer();
		maria.respira();
		maria.comer();
	
	}

}
