package interfaces;

//Celular sera a interface desta classe
public class Xiaomi implements Celular {

	//Declarando as propriedades da classe, que são recebidas do Interface
	@Override
	public String processador() {
		
		return "SD835";
	}

	@Override
	public String OS() {
		
		return "Android";
	}

	@Override
	public int armazenamentoGB() {
		// TODO Auto-generated method stub
		return 64;
	}

	//ToString
	@Override
	public String toString() {
		return "Xiaomi [processador()=" + processador() + ", OS()=" + OS() + ", armazenamentoGB()=" + armazenamentoGB()
				+ "]";
	}

	
}
