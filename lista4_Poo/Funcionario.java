package lista4Poo;

public class Funcionario {
 
	//atributos
	String nome;
	String cargo;
	String setor;
	
	//m�todo construtivo
	public Funcionario (String nome, String cargo, String setor)
	{
		this.nome=nome;
		this.cargo=cargo;
		this.setor=setor;
	}
	
	//m�todo () void
	public void cadastrar()
	{
		System.out.println("Insira o nome do funcion�rie: "+this.nome);
		System.out.println("Insira o nome do cargo: " +this.cargo);
		System.out.println("Insira o setor de trabalho: " +this.setor);
	}
}
