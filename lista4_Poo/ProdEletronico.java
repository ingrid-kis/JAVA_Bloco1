package lista4Poo;

public class ProdEletronico {

	//atributos
	String marca;
	String sistemaOperacional;
	String modelo;
	double preco;
	
	//método construtivo
	public ProdEletronico (String marca, String sistemaOperacional, String modelo, double preco)
	{
		this.marca=marca;
		this.sistemaOperacional=sistemaOperacional;
		this.modelo=modelo;
		this.preco=preco;
	}
	
	//método ()
	public void catalogar()
	{
		System.out.println("Insira nome da marca do eletrônico " +this.marca);
		System.out.println("Insira o sistema operacional: " +this.sistemaOperacional);
		System.out.println("Insira o modelo: " +this.modelo);
		System.out.printf("Insira o preço: %.2f%n " ,this.preco);
	}
}
