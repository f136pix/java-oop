package polimorfismo;

public class Telefone {
	private String modelo;

	//Constructor
	public Telefone(String modelo) {
		this.modelo = modelo;
	}
		
	public String getModelo() {
		return modelo;
	}

	//Funcionalidades
	public void features() {
		System.out.println("Celular com features");
	}
}


