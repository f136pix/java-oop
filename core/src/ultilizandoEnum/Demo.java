package ultilizandoEnum;

public class Demo {

	public static void main(String[] args) {
		
		//Escolhendo qual das props de APRENDENDO IREMOS ULTILIZAR
		Aprendendo aprender = Aprendendo.COREJAVA;
		
		switch(aprender) {
		case COLLECTIONS:
			break;
		case COREJAVA:
			System.out.println("COREJAVA");
			break;
		case GENERICS:
			System.out.println("GENERICS");
			break;
		case JSPANDSERVLETS:
			System.out.println("JSPANDSERVLETS");
			break;
		case MULTITHREADING:
			System.out.println("MULTITHREADING");
			break;
		default:
			break;
		
		}

	}

}
