package lista5_HerancaEPolimorfismo;

public class Animal {

	//atributos
	private String nome;
	private int idade;
	
	//m�todo ()
	public void emiteSom()
	{
		System.out.println("Emite som de animal");
	}

	//m�todo acessor (get) e tem retorno, e modificador (set).
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
