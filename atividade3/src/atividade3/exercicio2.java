package atividade3;

import java.util.Random;

public class exercicio2 {
	//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	//imprima a média aritmética dos lançamentos, contabilize e apresente também
	//quantas foram as ocorrências da maior pontuação.
	public static void main(String[] args) {
		
		int[] lancamento = new int[10];
		double soma = 0, media = 0;
		
		
		
		//lançamento
		for(int i = 0; i < 10; i++) {
			double numero = Math.random() * 6;
			int randomnumero = (int)numero;
			lancamento[i] = randomnumero;
			soma += lancamento[i];
			
				//if(randomnumero == 0) {
				//}
		}
		
		//saída
		System.out.println("Os resultados foram: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(lancamento[i] + " | ");
		}
		media = soma / 10;
		System.out.println("\n\nA média é: " + media );
	}

}
