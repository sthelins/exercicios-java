package exercicio1;

public class Cliente {

	//atributos
	private String nome;
	private int idade;
	private String sobrenome;
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//método
	void comprar() {
		System.out.println("Está comprando...");
	}
	
	
	
	
}
