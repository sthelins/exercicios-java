package atividade3;

import java.util.Scanner;

public class exercicio1 {
	//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
	//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] pontuacao = new double[5];
		
		//entrada
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "� pontua��o: " );
			pontuacao[i] = entrada.nextDouble();
		}
		
		//sa�da
		for(int i = 0; i < 5; i++) {
			System.out.print(pontuacao[i] + " | ");
			
		}
	}

}
