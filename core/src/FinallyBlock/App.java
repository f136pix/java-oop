package FinallyBlock;

public class App {

	public static void main(String[] args) {
		int x = 2;
		try {
			System.out.println("Não sabemos qual sera o output : " + x/2);
		}catch( Exception e) {
			System.out.println("Houve um Exception");
		}finally { //Ao usar um FINALLY, o uso do CATCH se torna opcional
			System.out.println("Isso sera printado"); //O FINALLY SEMPRE é printado, não importando se ouve uma EXCEPTION ou não
		}
	}
}
