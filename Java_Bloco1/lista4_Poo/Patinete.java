package lista4Poo;

public class Patinete {

	//atributos
	String marca;
	String modelo;
	double preco;
	
	//m�todo construtivo
	public Patinete (String marca, String modelo, double preco)
	{
	this.marca=marca;
	this.modelo=modelo;
	this.preco=preco;
	}
	
	//m�todo void ()
	public void pesquisar()
	{
		System.out.println("Marca do patinete: " +this.marca);
		System.out.println("Modelo do patinete: " +this.modelo);
		System.out.printf("Pre�o do patinete: R$ %.2f%n" ,this.preco);
	}
	
}
