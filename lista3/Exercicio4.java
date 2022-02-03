/* Programa que receba valores do usuário para preencher uma matriz 3X3
 * Exiba a soma dos valores dela
 * Soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */

package lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		int [][]mat = new int [3][3];
		int sDiagonal, soma=0;
		
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				
				System.out.println("Insira os valores: ");
				mat[l][c]=ler.nextInt();
				
				soma=soma+mat[l][c];
			}
		}
		
		System.out.println("A soma dos valores da matriz é: " +soma);
		
		sDiagonal=((mat[0][0]) + (mat[1][1]) + (mat[2][2]));
		System.out.println("\nA soma da diagonal principal é: " +sDiagonal);
		
		ler.close();
	}

}
