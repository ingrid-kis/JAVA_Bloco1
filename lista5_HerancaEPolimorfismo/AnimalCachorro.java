package lista5_HerancaEPolimorfismo;

public class AnimalCachorro extends Animal {

	//método
	@Override
	public void emiteSom()
	{
		System.out.println("Emite som de cachorro.");
	}
	
	
	public void correr() {
		System.out.println("O animal pode correr.");
	}
}
