package atividade3;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2= new int[4][6];
	    int soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada n1
		System.out.println("Para matriz N1");
			for(int l = 0; l < 4; l++ ) {
				for(int c = 0; c < 6; c++) {
					System.out.printf("Digite os valores [%d][%d]: ", l,c);
					N1[l][c] = leia.nextInt();
				
				}
			}
		
		//entrada n2
		System.out.println("\nPara matriz N2");
				for(int l = 0; l < 4; l++ ) {
					for(int c = 0; c < 6; c++) {
						System.out.printf("Digite os valores [%d][%d]: ", l,c);
						N2[l][c] = leia.nextInt();
						
					}
				}
		leia.close();
				

		//m1
			for(int l = 0; l < 4; l++ ) {
				for(int c = 0; c < 6; c++) {
					M1[l][c] = N1[l][c] + N2[l][c];
				}
			}
		
		System.out.println("\nA soma das matrizes N1 e N2: ");
			for(int l = 0; l < 4; l++ ) {
				for(int c = 0; c < 6; c++) {
					System.out.print(M1[l][c] + " | ");
				}
			}
			
			//m2
			for(int l = 0; l < 4; l++ ) {
				for(int c = 0; c < 6; c++) {
					M2[l][c] = N1[l][c] - N2[l][c];
				}
			}
			
		System.out.println("\n\nA diferença das matrizes N1 e N2: ");
				for(int l = 0; l < 4; l++ ) {
					for(int c = 0; c < 6; c++) {
						System.out.print(M2[l][c] + " | ");
					}
				}
			
			
			
		}
			

}
