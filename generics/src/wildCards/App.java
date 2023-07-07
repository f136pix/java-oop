package wildCards;

import java.util.ArrayList;
import java.util.List;

class Veiculo{
	private int ID;

	public Veiculo(int iD) {
		ID = iD;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Veiculo [ID=" + ID + "]";
	}
	void info() {
		System.out.println("O id é : "+ getID());
	} 
	
	
}


class Carro extends Veiculo{
	private String modeloDoCarro;

	public Carro(int iD, String modeloDoCarro) {
		super(iD);
		this.modeloDoCarro = modeloDoCarro;
	}

	public String getModeloDoCarro() {
		return modeloDoCarro;
	}

	public void setModeloDoCarro(String modeloDoCarro) {
		this.modeloDoCarro = modeloDoCarro;
	}

	@Override
	public String toString() {
		return "Carro [modeloDoCarro=" + modeloDoCarro + "ID =" + getID() +"]";
	}
	@Override
	void info() {
		System.out.println("O modelo do carro é : "+ getModeloDoCarro());
	} 
	

}

public class App {

	public static void main(String[] args) {
		List<Veiculo> listaDeVeiculos = new ArrayList<>();
		listaDeVeiculos.add(new Veiculo(14));
		listaDeVeiculos.add(new Veiculo(21));
		listaDeVeiculos.add(new Veiculo(51));
		listaDeVeiculos.add(new Veiculo(24));
		//Como CARRO é SubClass de VEICULO, podemos adicionar sem proeblemas
		listaDeVeiculos.add(new Carro(17, "SEDAN"));
		
		display(listaDeVeiculos);
		
	}
								  //? É ultilizado quando não sabemos qual sera o tipo de objeto recebido
	public static void display(List<? extends Veiculo> Arr) { //extends Veiculo para que possamos adicionar apenas classes que sejam ou VEICULO ou SUB de VEICULO, como CARRO
		//Iremos iterar OBJECTS, pois como não sabemos qual sera o tipo, object acaba sendo a aescolha, por ser o SUPER de todos os tipos
		for(Object elemento : Arr) {
			//Usaremos o toString pois esta presente em ambas as classe que temos disponiveis
			System.out.println(elemento.toString());
		}
	}
	
	public static void display2(List<? extends Veiculo> Arr) { 
		//Iremos iterar OBJECTS, pois como não sabemos qual sera o tipo, object acaba sendo a aescolha, por ser o SUPER de todos os tipos
		for(Veiculo elemento : Arr) { //Ao iterar sobre um tipo especifico, podemos ultilizar mais funcções exclusivas do mesmo, como estamos fazendo ao ultilizar o method INFO
			//Usaremos o method INFO porque esta presente em CARRO, e veiculo por ser uma SUB de carro, obrigatoriamente tera tambem
			 elemento.info();
		}
	}

}
