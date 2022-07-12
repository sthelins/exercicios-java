package atividade3;

import java.util.Scanner;

public class exercicio4 {
	//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	//diagonal, ou seja, diagonal principal.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] valores = new int[3][3];
		int soma = 0, somaDiagonal = 0;
		
		
		//entrada
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.printf("Digite os valores [%d][%d]: ", l,c);
				valores[l][c] = entrada.nextInt();
				soma += valores[l][c];
			}
		}
		
		somaDiagonal = valores[0][0] + valores[1][1] + valores[2][2] ;
		System.out.println("A soma de seus valores é: " + soma);
		System.out.println("A soma de sua diagonal é: " + somaDiagonal);

	}

}
