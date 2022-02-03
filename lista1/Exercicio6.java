package lista1;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double d, x1, x2, y1, y2, pot1, pot2;
		
		System.out.println("Insira os 4 valores");
		
		System.out.println("Insira x1: ");
		x1=ler.nextDouble();
		
		System.out.println("Insira x2: ");
		x2=ler.nextDouble();
		
		System.out.println("Insira y1: ");
		y1=ler.nextDouble();
		
		System.out.println("Insira y2: ");
		y2=ler.nextDouble();
		
		pot1=(Math.pow((x2-x1),2));
		pot2=(Math.pow((y2-y1),2));
		d=Math.sqrt(pot1 + pot2);
		
		System.out.println("O valor de D é:" +d);
		ler.close();
	}

}
