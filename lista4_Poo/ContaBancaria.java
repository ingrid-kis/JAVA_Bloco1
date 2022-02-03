package lista4Poo;

public class ContaBancaria {
	
	//atributos
	String banco;
	String tipoConta;
	double saldo;
	
	//método construtivo
	public ContaBancaria (String banco, String tipoConta, double saldo)
	{
		this.banco=banco;
		this.tipoConta=tipoConta;
		this.saldo=saldo;
	}
	
	//método void ()
	public void sacar()
	{
		System.out.println("Para sacar, insira o nome do banco: " +this.banco);
		System.out.println("Insira o tipo de conta: " +this.tipoConta);
		System.out.printf("Saldo disponível para saque R$ %.2f%n: " ,this.saldo);
	}
}
