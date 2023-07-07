package finalKeyword;

public class B extends A {
	private final int x = 5;
	private final int y;
	//CONSTRUCTOR / GETTER 
	
	//Constructors parametizados não podem ser ultilizados em variaveis com valor declarado FINAL
	/*
	public B(int x) {
		super();
		this.x = x;
	}*/
	
	//Constructors parametizados podem ser ultilizados em variaveis FINAL sem valor definido
	public B(int y) {
		super();
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	//CHAMANDO OS METODOS PRESENTES NO PAI
	
	@Override
	public void ola() {
		//Alterando o metodo que é herdado, que não é FINAL e pode ser modificado
		System.out.println("ola, como vai");
	}

	
	//Para chamarmos o metodo tchau(), temos que renomea-lo como tchau2(), pois tchau() já existe e é FINAL, logo não conseguimos cria-lo no filho com o mesmo nome 
	public void thcau2() {		//Podemos também invocar o metodo tchau() ao declarar a variavel, pois o mesmo é herdado
		super.thcau();
	}
	
	
	//Variaveis FINAL com valor definido não podem ter um SETTER
	/*public void setX(int x) {
		this.x = x;
	}*/
	
	
	
}
