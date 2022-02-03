package lista3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		int vet [] = new int [5];
		int maior=0;
	
		for (int i=0; i<5; i++) { //criar vetor |  o i vale as vezes pra rodar, nesse caso, 5.
			System.out.print("Escreva um valor de pontuação: ");
			vet[i]=ler.nextInt();
		}
		
		for (int i=0; i<5; i++) { //imprimir o vetor (valor) no console.
			System.out.print(vet[i] +"\t");
		}
		
		for (int i=0; i<5; i++) { //descobrir o maior vetor
			if (vet[i] > maior) {
				maior = vet [i];
			}
		}
		
		System.out.println();
		System.out.println("A maior pontuação é " +maior);
		ler.close();
	}

}
