package encapsulamento;

public class Pessoa {
	private String nome ;
	private int idade ;
	private String genero ;

	//Default Constructor
	public Pessoa() {
		
		this.nome = "Joao";
		this.idade = 25;
		this.genero = "Homem";
	}
	
	//Constructor Parametizado
	
	public Pessoa(String nome, int idade, String genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}
	//Getters
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getGenero() {
		return genero;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Criando restrições para valores que podem ser inputados
	public boolean setIdade(int idade) {
		if(idade>=0 && idade<=100) {
		this.idade = idade;
		return true;
		}
		else {
		return false;
	
		}
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero=" + genero + "]";
	}
	
}
