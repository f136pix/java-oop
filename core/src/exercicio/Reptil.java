package exercicio;

public class Reptil extends Animal {
	//Props que são somadas a classe Animal
	protected String pele, ovos;
	protected Boolean colunaVertebral;
	
			//Criando o constructor da classe réptil, que recebera os parametros default da classe animal
	public Reptil() {
		super();
		//Criando um constructor default para a classe Reptil
		this.pele = "seca";
		this.colunaVertebral = true;
		this.ovos = "moles";
		tipoAnimal = "reptil";
		bloodType ="frio";
		altura = 5;
		peso = 20;
	}

	//Como as props são acessadas pelo filho, não é necessario que hajam setters
	@Override
	public String toString() {
		return "Reptil [pele=" + pele + ", ovos=" + ovos + ", colunaVertebral=" + colunaVertebral + ", altura=" + altura
				+ ", peso=" + peso + ", tipoAnimal=" + tipoAnimal + ", bloodType=" + bloodType + "]";
	}
	
	
	
	
}

	


