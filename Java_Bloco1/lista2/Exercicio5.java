<<<<<<< HEAD
/* Crie um programa que leia um número do teclado até que encontre um
 *  número igual a zero.
 *  No final, mostre a soma dos números digitados.
 *  (DO...WHILE) 
 */

package lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, somaNumeros=0;
		
		System.out.println("Insira um número: ");
		x=ler.nextInt();
		
		do { //
			somaNumeros=somaNumeros+x;
			System.out.println("Insira um número: "); 
			x=ler.nextInt();
		}
		
		while (x!=0); //para quebrar o loop do DO
		
		System.out.println("A soma é: " +somaNumeros);
		
		ler.close();

	}

}
=======
/* Crie um programa que leia um número do teclado até que encontre um
 *  número igual a zero.
 *  No final, mostre a soma dos números digitados.
 *  (DO...WHILE) 
 */

package lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, somaNumeros=0;
		
		System.out.println("Insira um número: ");
		x=ler.nextInt();
		
		do { //
			somaNumeros=somaNumeros+x;
			System.out.println("Insira um número: "); 
			x=ler.nextInt();
		}
		
		while (x!=0); //para quebrar o loop do DO
		
		System.out.println("A soma é: " +somaNumeros);
		
		ler.close();

	}

}
>>>>>>> a8cdc17899c3ea94408d0a6c4250a8db80df47ca
