package atividade5;

public class TestaAnimal {

	public static void main(String[] args) {
		//cachorro
		Cachorro A1 = new Cachorro();
		A1.setNome("lulu");
		A1.setIdade(1);
		System.out.println("Seu nome é " + A1.getNome() + " ele tem " + A1.getIdade() + " anos");
		A1.EmitirSom();
		A1.Correr();
		
		//cavalo
		Cavalo A2 = new Cavalo();
		A2.setNome("foguete");
		A2.setIdade(3);
		System.out.println("\nSeu nome é " + A2.getNome() + " ele tem " + A2.getIdade() + " anos");
		A2.EmitirSom();
		A2.Correr();
		
		//preguiça
		Preguica A3 = new Preguica();
		A3.setNome("bambu");
		A3.setIdade(12);
		System.out.println("\nSeu nome é " + A3.getNome() + " ele tem " + A3.getIdade() + " anos");
		A3.EmitirSom();
		A3.Subir();
		
	
		
		
		
		
		

	}

}
