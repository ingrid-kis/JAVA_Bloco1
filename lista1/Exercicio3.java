package lista1;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		int seg, min, hora, tempo;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Insira a duração do tempo do evento em segundos: "); //escreva
		tempo=calc.nextInt(); //leia
		
		hora= tempo/3600;
		min= (tempo%3600)/60;
		seg= (tempo%3600)%60;
		
		System.out.println(hora + "hora(s) " + min + "min " + seg + "seg ");
		calc.close();
	}

}
