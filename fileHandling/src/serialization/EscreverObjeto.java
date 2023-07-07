package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscreverObjeto {

	public static void main(String[] args) {
		
		Veiculo bicicleta = new Veiculo("bicicleta", 1994);
		Veiculo carro = new Veiculo("carro", 39);
		
		//Enviando os objetos para nossa file
		try(FileOutputStream fos = new FileOutputStream("veiculos\\veiculos.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bicicleta);
				obj.writeObject(carro);
				System.out.println("Objetos retornados com sucesso");
			}
		//Os catchs abaixo estao lidando com ambos os TRYS
		} catch (FileNotFoundException e) {
			System.out.println("FILE NAO LOCALIZADO : " + e);
		} catch (IOException e) {
			System.out.println("IO EXCEPTION : " + e);
		}
	
	
	}

}
