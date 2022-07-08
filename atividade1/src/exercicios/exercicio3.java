package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		if(idade >= 10 && idade <=14) {
			System.out.println("Você se encontra na categoria infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você se encontra na categora juvenil");
		}else if (idade >= 18 && idade <= 25) {
			System.out.println("Você se encontra na categoria adulto");
		} else {
			System.out.println("Categoria não definida");
		}
		
		
		
	} 


}