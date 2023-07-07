package exercicio;

public class Crocodilo extends Reptil{
	//Criando o constructor do crocodilo, que recebera todos os parametros, inclusive os herdados para montar a classe
	public Crocodilo(int alturaCroc, int pesoCroc, String ovosCroc) {
		super();
		//Não é necessario o uso dos setters, pois como as props são protected, herdamos acessos as mesmas
		altura = alturaCroc;
		peso = pesoCroc;
		ovos = ovosCroc;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Crocodilo [pele=" + pele + ", ovos=" + ovos + ", colunaVertebral=" + colunaVertebral + ", altura="
				+ altura + ", peso=" + peso + ", tipoAnimal=" + tipoAnimal + ", bloodType=" + bloodType + "]";
	}
	
	
	}


