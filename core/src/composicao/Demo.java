package composicao;

public class Demo {

	public static void main(String[] args) {
		/*
		//Criando um laptop default com um processor e uma placa de video default
		Laptop laptop = new Laptop();
		System.out.println(laptop.toString());
		
		//Ultilizando o Getter para entrar em processador, e ultilizando o getter dentro de processador para pegar a geração
		System.out.println(laptop.getProcessador().getGeracao());
		*/
		
		//Criando um laptop parametizado com processador e placa de video parametizada
		
		//Processador - Posso declara-los antes como variaveis iu no corpo constructor
		//Processador processadorGamer = new Processador("intel","7200U",7,4,4,"6MB","2.5GHZ","2.5GHZ","3.1GHZ");
		
		//Placa de Video - - Posso declara-los antes como variaveis iu no corpo constructor
		//PlacaDeVideo placaDeVideoGamer = new PlacaDeVideo("NVIDIA", 1050, "4gb");
		
		Laptop laptopGamer = new Laptop(17f,new Processador("intel","7200U",7,4,4,"6MB","2.5GHZ","2.5GHZ","3.0GHZ"),
				"DDR4","2TB",new PlacaDeVideo("NVIDIA", 1050, "4gb"),null,"BlueSwitch");
		
		System.out.println("Frequencia antes : "+ laptopGamer.getProcessador().getFrequencia());
		//Chamando a função modo de jogo, que aumenta a frequencia no laptop para sua frequencia maxima
		laptopGamer.modoDeJogo();
		System.out.println("Frequencia depois: "+ laptopGamer.getProcessador().getFrequencia());
	}

}
