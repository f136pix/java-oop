package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		//Reptil, com apenas o constructor default da classe animal, ultilizando os parametrs default da classe reptil
		Reptil reptil = new Reptil();
		System.out.println(reptil.toString());
		
		//Crocodilo com parametro duros adicionados aos ovos.
		Animal crocodilo = new Crocodilo(1,52,"duros");
		//Podemos declarar crocodilo como um Animal, pois a superclasse é pai da classe Crocodilo
		System.out.println(crocodilo.toString());
		
		//Peixe, com os parametros default da classe Animal 
		Animal peixe = new Peixe();
		System.out.println(peixe.toString());
		
		Raia raia = new Raia();
		System.out.println(raia.toString());
	
		//Criando uma ARRAY
		List<Animal> animais = new ArrayList<>();
	
		//Adicionando os animais na Arr
		animais.add(reptil);
		animais.add(crocodilo);		//Todos os items são considerados animais,por ser a superclasse PAI
		animais.add(peixe);
		animais.add(raia);
		
		//Chamando a a function que irá listar os animais
		listaAnimais(animais);
	
	}
	
	public static void listaAnimais(List<Animal> animais){
		System.out.println("Todos os animais");
		
		//Fazendo um foreach na array animais
		for(Animal animal: animais) {
			System.out.println(animal.toString());
		}
	}

}
