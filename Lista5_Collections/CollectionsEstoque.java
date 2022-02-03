package Lista5_Collections;

public class CollectionsEstoque {
	
	private String tipo;
	private String modelo;
	private int tamanho;
	
	
	//construtor
	public CollectionsEstoque(String tipo, String modelo, int tamanho) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.tamanho = tamanho;
        }


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}	
	
	public String toString() { //para pegar os metodos direto e nao usar da memoria: toString
		return this.tipo + this.modelo + this.tamanho;
    }
}