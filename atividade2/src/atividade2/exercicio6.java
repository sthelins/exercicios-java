package atividade2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int numero, media, qtd= 0, soma = 0;
		
		do {
			System.out.println("Digite um número, para sair digite 0");
			numero = entrada.nextInt();
				if(numero % 3 == 0) {
					soma += numero;
					qtd++;
					
				}
			
		} while(numero != 0);
		
		qtd -= 1;
		System.out.println("A média dos números múltiplos de 3 digitados é: " + soma / qtd );

	}

}
