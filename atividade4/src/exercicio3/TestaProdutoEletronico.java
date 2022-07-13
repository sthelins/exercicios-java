package exercicio3;

import java.io.PrintStream;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		//declaração
		ProdutoEletronico TestaProdutoEletronico = new ProdutoEletronico();
		
		//atribuição
		TestaProdutoEletronico.setCor("Preto");
		TestaProdutoEletronico.setModelo(5);
		TestaProdutoEletronico.setTamanho("10cm");
		
		System.out.println(TestaProdutoEletronico.getCor() + ", modelo " + TestaProdutoEletronico.getModelo() + " e tamanho de " + TestaProdutoEletronico.getTamanho() );

		
		System.out.print	(TestaProdutoEletronico.faz());
		
	}

}
