package exercicio;

public class Animal {
	//Declarando as variaveis como protected para que possam ser acessadas pelos filhos da classe
	protected int altura;
	protected int peso;
	protected String tipoAnimal;
	protected String bloodType;

	public Animal() {
		this.altura = 0;
		this.peso = 0;
		this.tipoAnimal = "Indefinido";
		this.bloodType = "Indefinido";
	}

	//Getter
	public int getAltura() {
		return altura;
	}

	public int getPeso() {
		return peso;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public String getBloodType() {
		return bloodType;
	}
	

	@Override
	public String toString() {
		return "Animal [getAltura()=" + getAltura() + ", getPeso()=" + getPeso() + ", getTipoAnimal()="
				+ getTipoAnimal() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	
	
	
}
