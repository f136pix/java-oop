package arraysPorValue;

public class App {

	public static void main(String[] args) {
		int value = 10;
		System.out.println("Valor de value : " + value);
		//Criando uma classe com tudo dentro de App para podermos ultilziar mostrarValor
		App app = new App();
		app.mostrarValor(value);
		System.out.println("Valor de value : " + value); //O valor de VALUE não é alterado, pois a função altera o valor apenas o valor do INPUT, durante sua execução e em seu escopo
		
	}
	
	void mostrarValor(int valor) {
		System.out.println(valor);
		valor = 20;
		System.out.println(valor);
	}

}
