<<<<<<< HEAD
/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, contarNumPar=0, contarNumImpar=0;
		
		System.out.println("Insira com 10 valores: ");
		
		for (x=0; x<10; x++) { //x � s� pra condi��o
			y=ler.nextInt(); //y ser� o n�mero inserido
			if (y%2==0) {
				contarNumPar = contarNumPar+1;
			}
			else {
				contarNumImpar = contarNumImpar+1;
			}
			
		}
		
		System.out.println("Total de n�meros pares: " +contarNumPar);
		System.out.println("Total de n�meros �mpares: " +contarNumImpar);
		
		ler.close();
	}
	
}
=======
/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, contarNumPar=0, contarNumImpar=0;
		
		System.out.println("Insira com 10 valores: ");
		
		for (x=0; x<10; x++) { //x � s� pra condi��o
			y=ler.nextInt(); //y ser� o n�mero inserido
			if (y%2==0) {
				contarNumPar = contarNumPar+1;
			}
			else {
				contarNumImpar = contarNumImpar+1;
			}
			
		}
		
		System.out.println("Total de n�meros pares: " +contarNumPar);
		System.out.println("Total de n�meros �mpares: " +contarNumImpar);
		
		ler.close();
	}
	
}
>>>>>>> a8cdc17899c3ea94408d0a6c4250a8db80df47ca
