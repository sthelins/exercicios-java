package exercicio1;

public class TesteCliente {

	public static void main(String[] args) {
		//declaração do objeto
		//class obj
		Cliente cliente = new Cliente();
		
		//atribuindo
		cliente.setNome("Ana");
		cliente.setSobrenome("Silva");
		cliente.setIdade(22);
		
		System.out.println("O nome é " + cliente.getNome() +" " + cliente.getSobrenome() + " e tem " + cliente.getIdade() + " anos.");
		
		cliente.comprar();
		
		
		
		
		
		
		
		
		
	}

}
