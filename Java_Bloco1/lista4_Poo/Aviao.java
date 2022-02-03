package lista4Poo;

public class Aviao {
	
	//atributos
	String fabricante; //embraer
	String tipo; //jatinho
	String porte; //pequeno
	
	//método construtivo
	
	public Aviao (String fabricante, String tipo, String porte)
	{
		this.fabricante=fabricante;
		this.tipo=tipo;
		this.porte=porte;
	}

	//método ()
	public void identificar()
	{
		System.out.println("Insira o nome do fabricante: " +this.fabricante);
		System.out.println("Insira o tipo de aeronave: " +this.tipo);
		System.out.println("Insira o porte da aeronave: " +this.porte);
	}
	
}
