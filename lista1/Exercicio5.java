package lista1;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, nPeso2, nPeso3, nPeso5, media;
		
		System.out.println("Insira 1� nota com v�rgula: ");
		n1=ler.nextDouble();
		
		System.out.println("Insira 2� nota com v�rgula: ");
		n2=ler.nextDouble();

		System.out.println("Insira 3� nota com v�rgula: ");
		n3=ler.nextDouble();
		
		nPeso2 = n1*2;
		nPeso3 = n2*3;
		nPeso5 = n3*5;
		media = (nPeso2 + nPeso3 + nPeso5)/10.0;
		
		System.out.printf("A m�dia entre as tr�s notas �:  %2f%n" ,media);
		ler.close();
	}

}
