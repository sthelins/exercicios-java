package atividade2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int par = 0, impar = 0;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Digite um número:");
			int n = entrada.nextInt();
			if(n % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Você digitou " + par + " números pares e " + impar + " números ímpar");
		
		
	}

}
