<<<<<<< HEAD
/* Escrever um programa que receba v�rios n�meros inteiros no teclado.
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
 * Para sair digitar 0(zero).(DO...WHILE)
 */

package lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, soma=0, quant=0;
		double media;
		
		System.out.println("Insira um n�mero: ");
		num=ler.nextInt();
		
		do {
			if (num%3==0) {
				soma=soma+num;
				quant=quant+1;
			}
			System.out.println("Insira um n�mero: ");
			num=ler.nextInt();
		}
		
		while (num!=0);
			
			media= (double)soma/quant;
			
			System.out.printf("A m�dia dos m�ltiplos de 3 �: %.2f%n" ,media);
			
		ler.close();
	}

}
=======
/* Escrever um programa que receba v�rios n�meros inteiros no teclado.
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
 * Para sair digitar 0(zero).(DO...WHILE)
 */

package lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, soma=0, quant=0;
		double media;
		
		System.out.println("Insira um n�mero: ");
		num=ler.nextInt();
		
		do {
			if (num%3==0) {
				soma=soma+num;
				quant=quant+1;
			}
			System.out.println("Insira um n�mero: ");
			num=ler.nextInt();
		}
		
		while (num!=0);
			
			media= (double)soma/quant;
			
			System.out.printf("A m�dia dos m�ltiplos de 3 �: %.2f%n" ,media);
			
		ler.close();
	}

}
>>>>>>> a8cdc17899c3ea94408d0a6c4250a8db80df47ca
