package encapsulamento;

public class Demo {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		System.out.println(joao);
		
		Pessoa maria = new Pessoa("Maria",19,"Mulher");
		System.out.println(maria);
		maria.setIdade(20);
		System.out.println(maria);
	}
}
