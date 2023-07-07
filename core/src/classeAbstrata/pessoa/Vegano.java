package classeAbstrata.pessoa;

public class Vegano extends Pessoa {

	//Classes que extenedem de pessoa, necessitam ter a variavel comer declarada, pois pessoa se trta de uma classe abstrata
	public void comer() {
		System.out.println("Não come carne");
	}
}
