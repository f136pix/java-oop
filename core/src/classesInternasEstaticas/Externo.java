package classesInternasEstaticas;

import elementoEstaticos.TestEstatico;

public class Externo {
	private int teste = 5;
	private static int testeStatic = 10;
	
	private static void TesteMetodoExterno(){
		System.out.println("Testando metodo externo");
		//Acessando o valor do CHILD
		System.out.println("Valor de x : "+ Interno.x);
	}
	
	//Dentro de classes ESTATICAS, todos os seus elementos internos, devem tambem ser estaticos: METODOS, VARIAVEIS, CLASSES, ETC...
	public static class Interno{
		
		
		public static int x = 1;
		public static void testandoMetodoInterno(){
			System.out.println("Testando");
			//Para acessar a VAR que não é STATIC, precesaremos criar um novo objeto com a classe da mesma
			System.out.println("INT teste : " + new Externo().teste);
			//Para acessar uma STATIC, isto não é necessario, é uma boa pratica que OBJETOS STATIC apenas interajam com OBJETOS STATIC
			System.out.println("INT teste estatico : " + testeStatic);
			//O metodo pode ser chamado sem problemas, pois é STATIC
			TesteMetodoExterno();
			
		}
	}
}
