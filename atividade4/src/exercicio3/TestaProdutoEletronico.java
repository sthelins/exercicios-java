package exercicio3;

import java.io.PrintStream;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		//declara��o
		ProdutoEletronico TestaProdutoEletronico = new ProdutoEletronico();
		
		//atribui��o
		TestaProdutoEletronico.setCor("Preto");
		TestaProdutoEletronico.setModelo(5);
		TestaProdutoEletronico.setTamanho("10cm");
		
		System.out.println(TestaProdutoEletronico.getCor() + ", modelo " + TestaProdutoEletronico.getModelo() + " e tamanho de " + TestaProdutoEletronico.getTamanho() );

		
		System.out.print	(TestaProdutoEletronico.faz());
		
	}

}
