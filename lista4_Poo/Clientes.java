package lista4Poo;

public class Clientes {

	//atributos
	String nome;
	String user;
	String numCel;
	String email;
	
	//método construtor
	
	public Clientes (String nome, String user, String numCel, String email)
	{
		this.nome=nome;
		this.user=user;
		this.numCel=numCel;
		this.email=email;
	}
	
	//método com () - void
	public void cadastrar()
	{
		System.out.println("Insira o nome completo: " +this.nome);
		System.out.println("Insira o nome de usuário: " +this.user);
		
		if(this.numCel.length()==11) {
			System.out.println("numCel: "+this.numCel);
		}
		else
			System.out.println("Por favor, insira o número de celular com 11 dígitos: " +this.numCel);
	
		System.out.println("Insira o endereço de endereço: " +this.email);
	}
}
