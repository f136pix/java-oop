package composicao;

public class PlacaDeVideo {
	private String marca;
	private int series;
	private String memory;
	
	//Constructor Default
	public PlacaDeVideo() {
		this.marca = "Nvidia";
		this.series = 940;
		this.memory = "2 GB";
	}
	
	//Constructer que recebe parametros
	public PlacaDeVideo(String marca, int series, String memory) {
		this.marca = marca;
		this.series = series;
		this.memory = memory;
		}

	@Override
	public String toString() {
		return "PlacaDeVideo [marca=" + marca + ", series=" + series + ", memory=" + memory + "]";
	}
	
}
