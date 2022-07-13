package exercicio3;

public class ProdutoEletronico {
	//atributos
	 private String cor;
	 private int modelo;
	 private String tamanho;
	 
	//getters e setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	//metodo
	void faz() {
		System.out.println("Ele liga...");
	
	}
	
	 
	 
}
