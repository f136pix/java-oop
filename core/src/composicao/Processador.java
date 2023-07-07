package composicao;

public class Processador {
	private String marca;
	private String series;
	private int geracao;
	private int cores;
	private int threads;
	private String memoriaCache;
	private String frequencia;
	private String minFrequencia;
	private String maxFrequencia;
	
	//Constructor Default
	public Processador() {
		this.marca = "Ryzen";
		this.series = "5500G";
		this.geracao = 5;
		this.cores = 2;
		this.threads = 4;
		this.memoriaCache = "3MB";
		this.frequencia = "2.5Ghz";
		this.minFrequencia = "2.5Ghz";
		this.maxFrequencia = "5Ghz";
	}

	public Processador(String marca, String series, int geracao, int cores, int threads, String memoriaCache,
			String frequencia, String minFrequencia, String maxFrequencia) {
		this.marca = marca;
		this.series = series;
		this.geracao = geracao;
		this.cores = cores;
		this.threads = threads;
		this.memoriaCache = memoriaCache;
		this.frequencia = frequencia;
		this.minFrequencia = minFrequencia;
		this.maxFrequencia = maxFrequencia;
	}

	@Override
	public String toString() {
		return "Processador [marca=" + marca + ", series=" + series + ", geracao=" + geracao + ", cores=" + cores
				+ ", threads=" + threads + ", memoriaCache=" + memoriaCache + ", frequencia=" + frequencia
				+ ", minFrequencia=" + minFrequencia + ", maxFrequencia=" + maxFrequencia + "]";
	}

	//Getters
	public String getMarca() {
		return marca;
	}

	public String getSeries() {
		return series;
	}

	public int getGeracao() {
		return geracao;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getMemoriaCache() {
		return memoriaCache;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public String getMinFrequencia() {
		return minFrequencia;
	}

	public String getMaxFrequencia() {
		return maxFrequencia;
	}

	//Setters
	
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
	
	
	
	
}


