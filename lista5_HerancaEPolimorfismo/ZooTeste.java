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
		cavalo.emiteSom(); //cavalo é objeto e o emite é o método.
		cavalo.correr();
		System.out.println(); //só pular
		
		
		System.out.println("Nome do cachorro: "); //atributos do cachorro
		ler.nextLine();
		cachorro.setNome(ler.nextLine());
		System.out.println("Idade do cachorro: ");
		cachorro.setIdade(ler.nextInt());
		cachorro.emiteSom(); //cachorro é objeto e o emite é o método.
		cachorro.correr();
		System.out.println(); //só pular
		
		
		System.out.println("Nome do preguiça: "); //atributos de preguiça
		ler.nextLine();
		preguica.setNome(ler.nextLine());
		System.out.println("Idade da preguiça: ");
		preguica.setIdade(ler.nextInt());
		preguica.emiteSom(); //preguiça é objeto e o emite é o método.
		preguica.subir();
		System.out.println(); //só pular
		
		
		
		
		
		
		
		ler.close();
		
	}
}
