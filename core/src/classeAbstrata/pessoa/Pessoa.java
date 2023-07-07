package classeAbstrata.pessoa;

//Pessoa é uma Abstract Class, que ira herdar as props da interface EstaVivo e ViveVida
public abstract class Pessoa implements EstaVivo,ViveVida{
	public void falar() {
		System.out.println("Falar algo");
	}
	
	
	//Os voids abaixo serão passado para ambos os filhos : Carnvivoros e vegetarianos
	@Override
	public void respira(){
		System.out.println("Está respirando");
	}
	
	@Override
	public void mensagem(){
		System.out.println("Esta vivendo a vida");
	}
	
	public abstract void comer();
}
