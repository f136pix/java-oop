package classesInternasAnonimas;

//Criando uma classe abstrata Tranca
abstract class  Tranca{
	//Metodo abstrato
	public abstract boolean estaTrancada(String chave);
	public void teste() {
		System.out.println("teste");
	}
}

//Classe Porta, que possui uma Tranca dentro da mesma
public class Porta {
	
	//Criando uma Tranca
	Tranca tranca = new Tranca() {
		//Como estaTrancada e uma abstract, a mesma precisa ser declarada para ser usada:
		public boolean estaTrancada(String chave) {
			if(chave.equals("Chave A")){
				return true;
			}
			else {
				return false;
			}
		};
	};
	//Getter
	public Tranca getTranca() {
		return tranca;
	}
};
