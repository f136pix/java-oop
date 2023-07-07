package polimorfismo;

import java.nio.file.FileSystemNotFoundException;

public class Demo {

	public static void main(String[] args){
	
		/*
	Telefone celular = new Telefone("iPhone");
	System.out.println(celular.getModelo());
	celular.features();
	
	//As function feature que foi herdada foi alterada no filhos, por isso o output será outro
	SamsungNote12 S12 = new SamsungNote12("Note 12");
	System.out.println(S12.getModelo());
	S12.features();
	
	//Será cahmado a function features de  SamsungNote12, pois foi ultilizado o constructor do mesmo
	Telefone S13 = new SamsungNote12("Note 13");
	S13.features();
	
	//Será chamada a function features do PAI
	Telefone nokia3100 = new Nokia3100("Nokia");
	nokia3100.features();
	
			*/
	
	//Criando um NOKIA através do metodo/function abaixo
	Telefone nokia3100 = new Demo().telefone(1);
	System.out.println(nokia3100.getModelo());
	nokia3100.features();
		
	}
	
	public Telefone telefone(int driverDiario){
		switch(driverDiario) {
		case 1: return new Nokia3100("3100");
		case 2: return new SamsungNote12("Note 12");
		}
		return null;
	}
	
	
	
	
}
