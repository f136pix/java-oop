package acessModifier;

import acessModifier.parent.A;

public class App {

	public static void main(String[] args) {
		
		//Conseguimos chamar a função demo(), pois é uma PUBLIC
		new A().demo(); //O valor de X, contudo pode ser acessado por meio dessa função
		
		//Não conseguimos acessar o valor da variavel x declarada dentro de A, pois a mesma é DEFAULT, e esta em outro package
		//int x = new A().x;	//Caso A.java estivesse no mesmo package que App.java, a variavel X podeia ser acessado
	}

}
