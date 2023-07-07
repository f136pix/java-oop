package classesInternasEstaticas;

public class App {

	public static void main(String[] args) {
		//X pode ser acessado sem problemas, por ser ESTATICO e estar dentro de uma classe estatica
		//System.out.println("VAR x estatica : " + Externo.Interno.x);
		
		//Note que com metodos STATIC, não há necessidade de criar uma nova variavel pertencente a classe
		Externo.Interno.testandoMetodoInterno();
		
	}

}
