package exercicio2;

public class TestaAviao {

	public static void main(String[] args) {
     //classe //obj
		Aviao aviao = new Aviao();
		
		aviao.setPassageiros(257);
		aviao.setAeromocas(5);
		aviao.setCor("Branco");
		
		System.out.println("O avi�o tem " + aviao.getPassageiros() + " passageiros,");
		System.out.print( aviao.getAeromocas() + " aeromo�as e sua cor � " + aviao.getCor());
		
	

	}

}
