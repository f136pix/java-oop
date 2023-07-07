package interfaces;

public class Iphone implements Celular {

	//Declarando as propriedades da classe, que são recebidas do Interface
	@Override
	public String processador() {
		// TODO Auto-generated method stub
		return "A11";
	}

	@Override
	public String OS() {
		// TODO Auto-generated method stub
		return "IOS";
	}

	@Override
	public int armazenamentoGB() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public String toString() {
		return "Iphone [processador()=" + processador() + ", OS()=" + OS() + ", armazenamentoGB()=" + armazenamentoGB()
				+ "]";
	}
	
	

}
