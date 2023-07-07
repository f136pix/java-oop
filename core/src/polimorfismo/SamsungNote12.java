package polimorfismo;

public class SamsungNote12 extends Telefone{

	//Constructor, super recebe os parametros que estão declarados no pai
	public SamsungNote12(String modelo) {
		super(modelo);
		
	}
	
	//Não há necessidade de Getter, pois o mesmo está na classe telefone

	//Funcionalidades
	public void features() {
		System.out.println("Andoid 14");
	}
}
