package abstracao;

public class Moto extends Veiculo  {
	
	//Classe moto herda/extends de veiculo mais:
	private String guidao;
	
	//Constructor default gerado pelo Eclipse
	public Moto() {
		//Super traz as props default do pai: Veiculo
		super();
		this.guidao = "curto";
	}

	//Constructor que recebe parametros
	public Moto(String motor, int rodas, int acentos, int tanqueCombustivel, String farol,String guidao ) {
		//Super tera seus parametros puxados do constructor acima
		super(motor,rodas,acentos,tanqueCombustivel,farol);
		this.guidao = guidao;
	}

	//Getters
	public String getGuidao() {
		return guidao;
	}

	//Metodo ToString, que gerá uma string com todas as propriedades da classe
	public String toString() {
		return "Moto [getGuidao()=" + getGuidao() + ", getMotor()=" + getMotor() + ", getRodas()=" + getRodas()
				+ ", getAcentos()=" + getAcentos() + ", getTanqueCombustivel()=" + getTanqueCombustivel()
				+ ", getFarol()=" + getFarol() + "]";
		}
	//Modificando um metodo herdado da classe Veiculo
	public void ligar() {
		System.out.println("moto andando");
	}

	}	
	
