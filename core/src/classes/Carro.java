package classes;

public class Carro {
	
	//Normalmente as propriedades são feitas privadas e os metodos acessam as mesmas 
	//Sem o constructor : 
	private String portas;
	private String motor;
	private String motorista;
	//Deixando velocidade publica, para que possa ser acessada diretamente
	public int velocidade;
	
	//Criando um contructor, que simplifica a criação de um novo carro
	public Carro(String portas, String motor, String motorista, int velocidade) {
		super();
		this.portas = portas;
		this.motor = motor;
		this.motorista = motorista;
		this.velocidade = velocidade;
	}
	
	//Getters e Setters gerados pelo Eclipse
	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	/////////////////////////////////////////////////
	

	
	//Criando funções que serão usadas para interagir com os objetos private.
	public void escolherMotorista(String motorista){
		this.motorista = motorista;
		//Palavra chave this se refere ao objeto/classe em que estamos dentro	
	}
	
	public String mostrarMotorista(){
		System.out.println(this.motorista);
		return this.motorista;
	}
	
	//Criando um método que "executa" o carro
	public String sendoPilotado(){
		if(portas.equals("fechadas") && motor.equals("ligado") && velocidade>0 ){
			return("Carro está sendo pilotado");
		}
		else{
			return("Carro não está sendo pilotado");
		}
	}
	
	
			
}

