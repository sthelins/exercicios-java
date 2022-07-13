package exercicio2;

public class TestaAviao {

	public static void main(String[] args) {
     //classe //obj
		Aviao aviao = new Aviao();
		
		aviao.setPassageiros(257);
		aviao.setAeromocas(5);
		aviao.setCor("Branco");
		
		System.out.println("O avião tem " + aviao.getPassageiros() + " passageiros,");
		System.out.print( aviao.getAeromocas() + " aeromoças e sua cor é " + aviao.getCor());
		
	

	}

}
