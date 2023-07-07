package abstracao;

public class Demo {
	
	public static void main(String[] args) {
	//Chamando CARRO com o constructor default
	Carro carroDefault = new Carro();
	System.out.println(carroDefault);
	
	//Chamando CARRO com o constructor que recebe parametros
	Carro carro = new Carro("gasolina",4,5,40,"LCD","hidraulica","mp4","ligado","tablet","branca");
	System.out.println(carro.toString());
	
	//Chamando o método Ligar em MOTO, onde ele foi modificado
	Moto moto = new Moto("diesel",4,2,40,"led","curto");
	moto.ligar();
	
	//Chamando o metodo Ligar em CARRO, onde ele não foi modificado e está como na clase pai VEICULO
	carro.ligar();
	
	}
}