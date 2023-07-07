package exercicio;

public class Peixe extends Animal {
	
	protected boolean ossoDagua = true;
	protected boolean escamas = true;
	
	//Fazendo o constructor default, qualquer prop que deva ser alterada será feita através de setters no filho
	public Peixe(){
		tipoAnimal = "peixe";
		this.ossoDagua = true;
		this.escamas = true;
	}

	@Override
	public String toString() {
		return "Peixe [ossoDagua=" + ossoDagua + ", escamas=" + escamas + ", altura=" + altura + ", peso=" + peso
				+ ", tipoAnimal=" + tipoAnimal + ", bloodType=" + bloodType + "]";
	}
	
	
	//ToString
	
	
}
	
	
	
	


