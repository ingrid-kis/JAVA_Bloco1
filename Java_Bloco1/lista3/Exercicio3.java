/*
 * 2 matrizes N1 (4,6) e N2(4,6)
   a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
   das matrizes N1 e N2;
   b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
   posi��o das matrizes N1 e N2.
 */
package lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
		
		int [][]n1 = new int [2][2];
		int [][]n2 = new int [2][2];
		int [][]m1 = new int [2][2];
		int [][]m2 = new int [2][2];
		
		for (int linha=0; linha<2; linha++) { //criando matriz n1, primeira matriz
			for (int coluna=0; coluna<2; coluna++) {
				System.out.print("Digite um valor na matriz n1: ");
				n1[linha][coluna] = ler.nextInt(); //ler o valor inserido
			}
		}
		
		for (int linha=0; linha<2; linha++) { //criando matriz n2, segunda matriz
			for (int coluna=0; coluna<2; coluna++) {
				System.out.print("Digite um valor na matriz n2: ");
				n2[linha][coluna] = ler.nextInt(); //ler o valor inserido
			}
		}
		
		for (int linha=0; linha<2; linha++) { //criando matriz m1, soma de n1 + n2
			for (int coluna=0; coluna<2; coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]; //adi��o
			}
		}
		
		for (int linha=0; linha<2; linha++) { //criando matriz m2, subtra��o de n1 + n2
			for (int coluna=0; coluna<2; coluna++) {
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]; //subtra��o
			}
		}
		
		ler.close();
	}

}
