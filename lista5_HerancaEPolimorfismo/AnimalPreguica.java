package lista5_HerancaEPolimorfismo;

public class AnimalPreguica extends Animal {
	
	//m�todo
	
	@Override
	public void emiteSom()
	{
		System.out.println("Emite som de pregui�a.");
	}
	
		public void subir() {
			System.out.println("O animal pode subir em �rvores.");
		}
}
