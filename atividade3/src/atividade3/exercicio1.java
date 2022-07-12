package atividade3;

import java.util.Scanner;

public class exercicio1 {
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] pontuacao = new double[5];
		
		//entrada
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "º pontuação: " );
			pontuacao[i] = entrada.nextDouble();
		}
		
		//saída
		for(int i = 0; i < 5; i++) {
			System.out.print(pontuacao[i] + " | ");
			
		}
	}

}
