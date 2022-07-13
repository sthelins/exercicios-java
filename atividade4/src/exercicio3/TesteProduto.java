package exercicio3;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setCor("Preto");
		produto.setDuracao("7 anos");
		
		System.out.println("Este produto é " + produto.getCor() + " e dura " + produto.getDuracao());
        produto.faz();
	}

}
