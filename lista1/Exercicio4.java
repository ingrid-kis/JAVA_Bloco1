package lista1;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, s, r;
		
		System.out.println("Insira valor de A: ");
		a=ler.nextInt();
		
		System.out.println("Insira valor de B: ");
		b=ler.nextInt();
		
		System.out.println("Insira valor de C: ");
		c=ler.nextInt();
		
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d=(r+s)/2;
		
		System.out.println("O resultado de D é " +d);
		ler.close();
	}

}
