package Java_Bloco1.lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int anos, meses, dias;
		int ano=365;
		int mes=30;
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Insira seu aniversário em anos: ");
		anos=calc.nextInt();
		
		System.out.println("Insira seu aniversário em meses: ");
		meses=calc.nextInt();
		
		System.out.println("Insira seu aniversário em dias: ");
		dias=calc.nextInt();
		
		dias= dias + (anos*ano) + (meses*mes);
		System.out.println("Você tem " +dias+ " dias de idade.");
				
		
	}
}
