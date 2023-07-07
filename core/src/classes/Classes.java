package classes;

public class Classes {

	public static void main(String[] args) {
		
		//Criando umCarro baseado na classe Carro
		//Carro umCarro = new Carro();
		
		
		//Rodando a função da classe com seus valores originais
		//System.out.println(umCarro.sendoPilotado());
		
		//Atribuindo um valor á propriedade velocidade, que é Public
		//umCarro.velocidade = 20;
		
		//System.out.println("Velocidadedo carro : "+ umCarro.velocidade);
		
		//Usando as funções privadas da classe Carro
		//umCarro.escolherMotorista("Airton Senna");
		
		//umCarro.mostrarMotorista();

		//Ultilizando as funções geradas pelo Eclipse
		//umCarro.setPortas("fechadas");
		//System.out.println(umCarro.getPortas());
		
		//umCarro.setMotor("ligado");
		//System.out.println(umCarro.getMotor());
		
		//System.out.println(umCarro.sendoPilotado());
		
		//Ultilizando o constructor para criar mais rapidamente
		Carro umCarro = new Carro("fechadas","ligado","Ayrton Senna",40);
		
		//Ultilizando setter para alterar o constructor
		umCarro.setMotor("desligado");
		
		System.out.println(umCarro.sendoPilotado());
	}

}
