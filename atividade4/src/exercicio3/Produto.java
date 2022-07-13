package exercicio3;

public class Produto {
	//atributos
	private String cor;
	private String duracao;
	
	//getters e setters 
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	//metodo
	void faz() {
		System.out.println("Faz ligações");
	}
	
	
	
}
