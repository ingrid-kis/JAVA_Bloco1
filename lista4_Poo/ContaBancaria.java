package lista4Poo;

public class ContaBancaria {
	
	//atributos
	String banco;
	String tipoConta;
	double saldo;
	
	//m�todo construtivo
	public ContaBancaria (String banco, String tipoConta, double saldo)
	{
		this.banco=banco;
		this.tipoConta=tipoConta;
		this.saldo=saldo;
	}
	
	//m�todo void ()
	public void sacar()
	{
		System.out.println("Para sacar, insira o nome do banco: " +this.banco);
		System.out.println("Insira o tipo de conta: " +this.tipoConta);
		System.out.printf("Saldo dispon�vel para saque R$ %.2f%n: " ,this.saldo);
	}
}
