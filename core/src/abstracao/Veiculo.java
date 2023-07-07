package abstracao;

	//Classe veiculo abstrai todas as caracteristicas que qualquer veiculo tenha, todas as outras classes ultilizarão a herança dessa classe.
public class Veiculo {
		private String motor;
		private int rodas;
		private int acentos;
		private int tanqueCombustivel;
		private String farol;
		
		
		//Constructor default da classe Veiculo
		public Veiculo() {
			this.motor = "gasolina";
			this.rodas = 4;
			this.acentos = 4;
			this.tanqueCombustivel = 35;
			this.farol = "LED";
		}
		//Constructor com parametros gerado pelo eclipse, selecionados pelo ususario: 
		public Veiculo(String motor, int rodas, int acentos, int tanqueCombustivel, String farol) {
			this.motor = motor;
			this.rodas = rodas;
			this.acentos = acentos;
			this.tanqueCombustivel = tanqueCombustivel;
			this.farol = farol;
		}
		
		//Getters
		public String getMotor() {
			return motor;
		}
		public int getRodas() {
			return rodas;
		}
		public int getAcentos() {
			return acentos;
		}
		public int getTanqueCombustivel() {
			return tanqueCombustivel;
		}
		public String getFarol() {
			return farol;
		}	
		
		//Função/ método. Também será passado aos child
		public void ligar() {
			System.out.println("veiculo andando");
		}
}

