package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite o 1� n�mero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		int numero3 = entrada.nextInt();
		
		if(numero1 > numero) {
			numero = numero1;
		} if (numero2 > numero) {
			numero = numero2;
		} if (numero3 > numero) {
			numero = numero3;
		}
		
		System.out.println("O maior n�mero digitado foi: " + numero);

	}

}