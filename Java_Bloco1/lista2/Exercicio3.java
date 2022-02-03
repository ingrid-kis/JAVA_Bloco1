<<<<<<< HEAD
/*
 * Solicitar a idade de várias pessoas e imprimir:
 * Total de pessoas com menos de 21 anos.
 * Total de pessoas com mais de 50 anos.
 * O programa termina quando idade for =-99. (WHILE)
 */

package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0;
		
		System.out.println("/nInsira a idade: ");
		idade=ler.nextInt();
		
		while (idade!=-99) {
			if (idade<21) {
				menor21= menor21+1;
			}
			
			else if (idade >50) {
				maior50=maior50+1;
			}
		
			System.out.println("/nInsira a idade: ");
			idade=ler.nextInt();
			
		}
			System.out.println("Total de pessoas menores de 21 é:" + menor21);
			System.out.println("Total de pessoas maiores de 50 é: " +maior50);
		
		ler.close();

	}

}
=======
/*
 * Solicitar a idade de várias pessoas e imprimir:
 * Total de pessoas com menos de 21 anos.
 * Total de pessoas com mais de 50 anos.
 * O programa termina quando idade for =-99. (WHILE)
 */

package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0;
		
		System.out.println("/nInsira a idade: ");
		idade=ler.nextInt();
		
		while (idade!=-99) {
			if (idade<21) {
				menor21= menor21+1;
			}
			
			else if (idade >50) {
				maior50=maior50+1;
			}
		
			System.out.println("/nInsira a idade: ");
			idade=ler.nextInt();
			
		}
			System.out.println("Total de pessoas menores de 21 é:" + menor21);
			System.out.println("Total de pessoas maiores de 50 é: " +maior50);
		
		ler.close();

	}

}
>>>>>>> a8cdc17899c3ea94408d0a6c4250a8db80df47ca
