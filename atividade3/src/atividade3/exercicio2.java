package atividade3;

import java.util.Random;

public class exercicio2 {
	//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	//quantas foram as ocorr�ncias da maior pontua��o.
	public static void main(String[] args) {
		
		int[] lancamento = new int[10];
		double soma = 0, media = 0;
		
		
		
		//lan�amento
		for(int i = 0; i < 10; i++) {
			double numero = Math.random() * 6;
			int randomnumero = (int)numero;
			lancamento[i] = randomnumero;
			soma += lancamento[i];
			
				//if(randomnumero == 0) {
				//}
		}
		
		//sa�da
		System.out.println("Os resultados foram: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(lancamento[i] + " | ");
		}
		media = soma / 10;
		System.out.println("\n\nA m�dia �: " + media );
	}

}
