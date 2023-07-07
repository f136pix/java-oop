package serialization;

import java.io.Serializable;
							  //Precisamos ultilizar Seriazable para que possamos ler e enviar esses dados para o file
public class Veiculo implements Serializable {

		private String type;
		private int number;
		
		public Veiculo(String type, int number) {
			super();
			this.type = type;
			this.number = number;
		}

		public String getType() {
			return type;
		}
		
		public int getNumber() {
			return number;
		}
		
		public String toString() {
			return "veiculo [type=" + type + ", number=" + number + "]";
		}


}
