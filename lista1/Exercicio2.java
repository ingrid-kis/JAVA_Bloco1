package lista1;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		int anos, meses, dias;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Escreva sua idade em dias: ");
		dias=calc.nextInt();
		
		System.out.println("Você tem em ano(s): " +(dias/365));
		
		System.out.println("Você tem em mes(es): " + (dias%365)/30);
		
		System.out.println("Você tem em dia(s): " +(dias%365)%30);
		calc.close();
	}

}
