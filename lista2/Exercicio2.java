<<<<<<< HEAD
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, contarNumPar=0, contarNumImpar=0;
		
		System.out.println("Insira com 10 valores: ");
		
		for (x=0; x<10; x++) { //x é só pra condição
			y=ler.nextInt(); //y será o número inserido
			if (y%2==0) {
				contarNumPar = contarNumPar+1;
			}
			else {
				contarNumImpar = contarNumImpar+1;
			}
			
		}
		
		System.out.println("Total de números pares: " +contarNumPar);
		System.out.println("Total de números ímpares: " +contarNumImpar);
		
		ler.close();
	}
	
}
=======
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, contarNumPar=0, contarNumImpar=0;
		
		System.out.println("Insira com 10 valores: ");
		
		for (x=0; x<10; x++) { //x é só pra condição
			y=ler.nextInt(); //y será o número inserido
			if (y%2==0) {
				contarNumPar = contarNumPar+1;
			}
			else {
				contarNumImpar = contarNumImpar+1;
			}
			
		}
		
		System.out.println("Total de números pares: " +contarNumPar);
		System.out.println("Total de números ímpares: " +contarNumImpar);
		
		ler.close();
	}
	
}
>>>>>>> a8cdc17899c3ea94408d0a6c4250a8db80df47ca
