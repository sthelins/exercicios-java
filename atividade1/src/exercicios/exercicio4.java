package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		double raiz, potencia;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("Este n�mero � par e sua raiz quadrada �: " + raiz);
			
		} else {
			potencia = numero * numero;
			System.out.println("Este n�mero � �mpar e sua raiz quadrada �: " + potencia);
		}

	}

}
