package atividade2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;
		
		while(idade < 99) {
			System.out.println("Digite as idades: ");
			idade = entrada.nextInt();
			
			if(idade <= 21) {
				menor++;
			} else {
				maior++;
			}
			
			
		}
		
		System.out.println("O número de pessoas com menos de 21 anos é: " + menor);
		System.out.println("O número de pessoas com mais de 50 anos é: " + maior);

	}

}
