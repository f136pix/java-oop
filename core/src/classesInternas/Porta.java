package classesInternas;

public class Porta {
	
	//Criando metodo estaTrancada, que recebe uma chave
	public boolean portaTrancada(String chaveRecebida){
		
		//Classe tranca, que esta dentro do metodo portaTrancada, se comportando de maneira similar a uma classe abstrata
		class Tranca{
			
			//Metodo estraTrancado, que é uma prop da classe Tranca e recebe uma String como parametro
			                                  //Note que, independente do nome atribuido ao parametro, o mesmo sera herdado de portaTrancada
			public boolean estaTrancado(String chave){
				if(chave.equals("Chave A")){
					return true;
				}
				else {
					return false;
				}
			}
		}
	//Classe Porta ira retornar uma nova Tranca, com o valor do metodo Boolean estaTrancado
	return new Tranca().estaTrancado(chaveRecebida);
	} 
}
