package lista5_HerancaEPolimorfismo;

import java.util.Scanner;

public class ZooTeste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		AnimalCavalo cavalo = new AnimalCavalo();
		AnimalCachorro cachorro = new AnimalCachorro();
		AnimalPreguica preguica = new AnimalPreguica();
		
		System.out.println("Nome do cavalo: "); //atributos do cavalo
		cavalo.setNome(ler.nextLine());
		System.out.println("Idade do cavalo: ");
		cavalo.setIdade(ler.nextInt());
		cavalo.emiteSom(); //cavalo � objeto e o emite � o m�todo.
		cavalo.correr();
		System.out.println(); //s� pular
		
		
		System.out.println("Nome do cachorro: "); //atributos do cachorro
		ler.nextLine();
		cachorro.setNome(ler.nextLine());
		System.out.println("Idade do cachorro: ");
		cachorro.setIdade(ler.nextInt());
		cachorro.emiteSom(); //cachorro � objeto e o emite � o m�todo.
		cachorro.correr();
		System.out.println(); //s� pular
		
		
		System.out.println("Nome do pregui�a: "); //atributos de pregui�a
		ler.nextLine();
		preguica.setNome(ler.nextLine());
		System.out.println("Idade da pregui�a: ");
		preguica.setIdade(ler.nextInt());
		preguica.emiteSom(); //pregui�a � objeto e o emite � o m�todo.
		preguica.subir();
		System.out.println(); //s� pular
		
		
		
		
		
		
		
		ler.close();
		
	}
}
