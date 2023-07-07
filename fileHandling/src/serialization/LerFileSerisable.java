package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LerFileSerisable {
	
		//Criando a func que lera objetos
		public static void main(String[] args) {
			//LENDO OS OBJETOS COM O FILEINPUTSTREAM
			try(FileInputStream FIO = new FileInputStream("veiculos\\veiculos.dat")){
				try(ObjectInputStream obj = new ObjectInputStream(FIO)){
					Veiculo v1 = (Veiculo)obj.readObject();
					Veiculo v2 = (Veiculo)obj.readObject();
					
					System.out.println("Objeto1 : "+v1);
					System.out.println("Objeto2 : "+v2);
					
					} catch (ClassNotFoundException e) {
						System.out.println("CLASSE VEICULO NÃO EXISTE");
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					System.out.println("FILE NAO ENCONTRADO");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("IO EXCEPTION");
					e.printStackTrace();
				}
			}
		
		
		
	
}
