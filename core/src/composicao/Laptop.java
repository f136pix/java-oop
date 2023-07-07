package composicao;

public class Laptop {
	
	private float tela;
	private Processador processador;
	private String ram;
	private String HD;
	private PlacaDeVideo PlacaDeVideo;
	private String sensorOptico;
	private String teclado;
	
	//Default Constructor
	public Laptop() {
		this.tela = 15.6f;
		this.processador =  new Processador();
		this.ram = "DDR4";
		this.HD = "2TB";
		this.PlacaDeVideo = new PlacaDeVideo();
		this.sensorOptico = "MLT layer";
		this.teclado = "mecanico";
	}
	
	
	//Constructor Parametizado
	public Laptop(float tela, Processador processador, String ram, String HD, composicao.PlacaDeVideo placaDeVideo,
			String sensorOptico, String teclado) {
		super();
		this.tela = tela;
		this.processador = processador;
		this.ram = ram;
		this.HD = HD;
		PlacaDeVideo = placaDeVideo;
		this.sensorOptico = sensorOptico;
		this.teclado = teclado;
	}


	//caso os filhos tenham um método toString, ele será chamado quando esse metodo for usado no Sysout
	@Override
	public String toString() {
		return "Laptop [tela=" + tela + ", processador=" + processador + ", ram=" + ram + ", HD=" + HD
				+ ", PlacaDeVideo=" + PlacaDeVideo + ", sensorOptico=" + sensorOptico + ", teclado=" + teclado + "]";
	}


	//Getters
	public float getTela() {
		return tela;
	}


	public Processador getProcessador() {
		return processador;
	}


	public String getRam() {
		return ram;
	}


	public String getHD() {
		return HD;
	}


	public PlacaDeVideo getPlacaDeVideo() {
		return PlacaDeVideo;
	}


	public String getSensorOptico() {
		return sensorOptico;
	}


	public String getTeclado() {
		return teclado;
	}
	
	//Criando uma funcionalidade
	public String modoDeJogo() {
		processador.setFrequencia(processador.getMaxFrequencia());
		return "Frequencia aumentada";
	}
	
}
