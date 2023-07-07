package exercicio;

public class Raia extends Peixe  {
	private String especial;

	public Raia() {
		super();
		this.especial = "Solta choque eletrico";
	}

	@Override
	public String toString() {
		return "Raia [ossoDagua=" + ossoDagua + ", escamas=" + escamas + ", altura=" + altura
				+ ", peso=" + peso + ", tipoAnimal=" + tipoAnimal + ", bloodType=" + bloodType + ", especial= "+ especial + "]"; 
	}
	
	
}
