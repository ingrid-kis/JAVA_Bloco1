package lista1;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cFab, cNovo;
		
		System.out.println("Insira o custo de f�brica do carro: ");
		cFab=ler.nextDouble();
		
		cNovo=(cFab + (cFab*0.28) + (cFab*0.45));
		
		System.out.println("O pre�o do carro novo para o consumidor � R$ " +cNovo);
		ler.close();

	}

}
