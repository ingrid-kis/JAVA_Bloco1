/*
 * 
 */

package lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		int media;
		int vetDado []= new int [10];
		int maior=0, soma=0, vezesMaior=0;
	
		
		for (int x=0; x<10; x++) {
			System.out.println("Insira o resultado do dado: ");
			vetDado[x]=ler.nextInt();
		}
		
		for (int x=0; x<10; x++) { //mostra os resultados
			System.out.print(vetDado[x] +"\t");
		}
		
		for (int x=0; x<10; x++) { // armazenar os valores para fazer media depois.
			soma=soma+vetDado[x];
		}
		
		media = soma/10;  //media 10 lançamentos
		
		for (int x=0; x<10; x++) { 
			if (vetDado[x] > maior) { //qual é o maior
				maior = vetDado[x]; 
			}
		}
		
		for (int x=0; x<10; x++) {
			
			if (vetDado[x] == maior) {
				vezesMaior++; // qtas vezes o maior aparece
			}

		}
		
		System.out.println("\nA média dos valores do dado é: " +media);
		System.out.println("O maior valor que apareceu é: " +maior);
		System.out.println("Ele apareceu: " +vezesMaior+ " vez(es).");
		
		ler.close();
	}
	}

