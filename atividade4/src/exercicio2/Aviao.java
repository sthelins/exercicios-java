package exercicio2;

public class Aviao {
	//atributos 
	
			private int passageiros;
			private int aeromocas;
			private String cor;
		
    //getters e setters
	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getAeromocas() {
		return aeromocas;
	}

	public void setAeromocas(int aeromocas) {
		this.aeromocas = aeromocas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//método
		void voar() {
			System.out.println("O avião está voando...");
		}

}
