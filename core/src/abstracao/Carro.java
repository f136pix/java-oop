package abstracao;

public class Carro extends Veiculo {

	//Classe carro extends/herda itens da classe veiculo mais:
	private String direcao;
	private String sistemaDeMusica;
	private String arCondicionado;
	private String geladeira;
	private String sistemaDeEntretenimento;

	//Setando os valores do constructo default
	public Carro() {
		super();
		this.direcao = "automatica";
		this.sistemaDeMusica = "mp3";
		this.arCondicionado = "coll";
		this.sistemaDeEntretenimento = "TV";
		this.geladeira = "funcionando";
	}
	
	//Constructor que recebe parametros
	public Carro(String motor, int rodas, int acentos, int tanqueCombustivel, String farol,
			String direcao, String sistemaDeMusica, String arCondicionado, String sistemaDeEntretenimento, String geladeira) {
		//Passando os parametros para as props herdadas
		super(motor, rodas, acentos, tanqueCombustivel,farol);
		//Passando os parametros para os props das classes
		this.direcao = direcao;
		this.sistemaDeMusica = sistemaDeMusica;
		this.arCondicionado = arCondicionado;
		this.sistemaDeEntretenimento = sistemaDeEntretenimento;
		this.geladeira = geladeira;	
	}

	//Getters
	public String getDirecao() {
		return direcao;
	}

	public String getSistemaDeMusica() {
		return sistemaDeMusica;
	}

	public String getArCondicionado() {
		return arCondicionado;
	}

	public String getGeladeira() {
		return geladeira;
	}

	public String getSistemaDeEntretenimento() {
		return sistemaDeEntretenimento;
	}

	//ToString
	public String toString() {
		return "Carro [getDirecao()=" + getDirecao() + ", getSistemaDeMusica()=" + getSistemaDeMusica()
				+ ", getArCondicionado()=" + getArCondicionado() + ", getGeladeira()=" + getGeladeira()
				+ ", getSistemaDeEntretenimento()=" + getSistemaDeEntretenimento() + ", getMotor()=" + getMotor()
				+ ", getRodas()=" + getRodas() + ", getAcentos()=" + getAcentos() + ", getTanqueCombustivel()="
				+ getTanqueCombustivel() + ", getFarol()=" + getFarol() + "]";
	}	

}
