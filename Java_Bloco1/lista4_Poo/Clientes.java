package lista4Poo;

public class Clientes {

	//atributos
	String nome;
	String user;
	String numCel;
	String email;
	
	//m�todo construtor
	
	public Clientes (String nome, String user, String numCel, String email)
	{
		this.nome=nome;
		this.user=user;
		this.numCel=numCel;
		this.email=email;
	}
	
	//m�todo com () - void
	public void cadastrar()
	{
		System.out.println("Insira o nome completo: " +this.nome);
		System.out.println("Insira o nome de usu�rio: " +this.user);
		
		if(this.numCel.length()==11) {
			System.out.println("numCel: "+this.numCel);
		}
		else
			System.out.println("Por favor, insira o n�mero de celular com 11 d�gitos: " +this.numCel);
	
		System.out.println("Insira o endere�o de endere�o: " +this.email);
	}
}
