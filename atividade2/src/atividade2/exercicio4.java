package atividade2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 1, pessCalmas= 0, femNervosa = 0, 
		mascAgressivo = 0, outrosCalmos = 0, adultoAgressivo = 0,
		jovemCalmo = 0;
		
		int sexo, idade, temperamento;
	
		while( i <= 150) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Digite o seu sexo: 1 - feminino | 2 - masculino | 3 - outros ");
			sexo = entrada.nextInt();
			
			System.out.println("Digite seu temperamento: 1 - calma(o) | 2 - nervosa(o) | 3 - agressiva(o)");
			temperamento = entrada.nextInt();
			
	
			if(temperamento == 1) {
				pessCalmas++;
			} else if (sexo == 1 && temperamento == 2) {
				femNervosa++;
			} else if (sexo == 2 && temperamento ==3) {
				mascAgressivo++;
			} else if(sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			} else if (idade >= 40 && temperamento == 2) {
				adultoAgressivo++;
			} else if (idade <= 18 && temperamento == 1) {
				jovemCalmo++;
			}
			
			i++;	
		}
		System.out.println("O n�mero de pessoas calmas �: " + pessCalmas);
		System.out.println("O n�mero de mulheres nervosas �: " + femNervosa);
		System.out.println("O n�mero de homens agressivos �: " + mascAgressivo);
		System.out.println("O n�mero de outros calmos �: " + outrosCalmos);
		System.out.println("O n�mero de pessoas com mais de 40 anos agressivas �: " + adultoAgressivo);
		System.out.println("O n�mero de pessoas com menos de 18 anos calmas �: " + jovemCalmo);
		

	}

}
