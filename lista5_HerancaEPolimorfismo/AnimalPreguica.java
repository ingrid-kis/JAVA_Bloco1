package lista5_HerancaEPolimorfismo;

public class AnimalPreguica extends Animal {
	
	//método
	
	@Override
	public void emiteSom()
	{
		System.out.println("Emite som de preguiça.");
	}
	
		public void subir() {
			System.out.println("O animal pode subir em árvores.");
		}
}
