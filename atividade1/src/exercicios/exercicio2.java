package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		int n2 = entrada.nextInt();
		System.out.println("Digite o 3� n�mero: ");
		int n3 = entrada.nextInt();

		
			if(n1 < n2 && n2 < n3) {
				System.out.println(n1 + " " + n2 + " " + n3);
			} else if (n1 < n3 && n3 < n2) {
				System.out.println(n1 + " " + n3 + " " + n2);
			} else if (n2 < n1 && n1 < n3) {
				System.out.println(n2 + " " + n1 + " " + n3);
			} else if (n2 < n3 && n3 < n1) {
				System.out.println(n2 + " " + n3 + " " + n1);
			} else if (n3 < n1 && n1 < n2) {
				System.out.println(n3 + " " + n1 + " " + n2);
			} else {
				System.out.println(n3 + " " + n2 + " " + n1);
			}
		
	}

}
