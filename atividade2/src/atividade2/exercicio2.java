package atividade2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int par = 0, impar = 0;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Digite um n�mero:");
			int n = entrada.nextInt();
			if(n % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Voc� digitou " + par + " n�meros pares e " + impar + " n�meros �mpar");
		
		
	}

}
