package lista4Poo;

public class Paciente {

	//atributos
	String nome;
	String alaHospitalar;
	String status;
	
	//método construtivo
	public Paciente (String nome, String alaHospitalar, String status)
	{
		this.nome=nome;
		this.alaHospitalar=alaHospitalar;
		this.status=status;
	}
	
	//método void
	public void atualizar()
	{
		System.out.println("Insira o nome do paciente: " +this.nome);
		System.out.println("Ala hospilar: " +this.alaHospitalar);
		System.out.println("Status do paciente: " +this.status);
	}
	
}
