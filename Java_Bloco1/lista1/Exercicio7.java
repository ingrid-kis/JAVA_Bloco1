package lista1;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b,c,d,E,f,x,y;
		
		System.out.println("Insira os coeficientes");
		
		System.out.println("Insira a: ");
		a=ler.nextDouble();
		
		System.out.println("Insira b: ");
		b=ler.nextDouble();
		
		System.out.println("Insira c: ");
		c=ler.nextDouble();
		
		System.out.println("Insira d: ");
		d=ler.nextDouble();
		
		System.out.println("Insira E: ");
		E=ler.nextDouble();
		
		System.out.println("Insira f: ");
		f=ler.nextDouble();
		
		System.out.println("Insira x: ");
		x=ler.nextDouble();
		
		System.out.println("Insira y: ");
		y=ler.nextDouble();
		
		x= ((c*E)-(b*f))/((a*E)-(b*d));
		y= ((a*f)-(c*d))/((a*E)/(b*d));
		
		System.out.println("Os valores de x: "+x+ " e y: "+ y);
		ler.close();
	}

}
