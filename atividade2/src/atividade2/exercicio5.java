package atividade2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número, para sair digite 0");
			numero = entrada.nextInt();
			soma += numero;
			
		} while(numero != 0);
		
		System.out.println("A soma dos números deu: " + soma);
		

	}

}
