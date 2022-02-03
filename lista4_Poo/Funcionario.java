package lista4Poo;

public class Funcionario {
 
	//atributos
	String nome;
	String cargo;
	String setor;
	
	//método construtivo
	public Funcionario (String nome, String cargo, String setor)
	{
		this.nome=nome;
		this.cargo=cargo;
		this.setor=setor;
	}
	
	//método () void
	public void cadastrar()
	{
		System.out.println("Insira o nome do funcionárie: "+this.nome);
		System.out.println("Insira o nome do cargo: " +this.cargo);
		System.out.println("Insira o setor de trabalho: " +this.setor);
	}
}
