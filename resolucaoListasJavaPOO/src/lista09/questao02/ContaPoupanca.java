package lista09.questao02;

public class ContaPoupanca extends ContaBancaria {
	private double taxaRendimento;
	
	public void sacar(double valor) {
		if(valor >  super.saldo)
			System.out.println("Saque impossível!");
		else
			 super.saldo -= valor;
	}
	
	public void depositar(double valor) {
		 super.saldo += valor;
	}
	
	public void tirarExtrato() {
		System.out.println("Saldo: " +  super.getSaldo());
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}	
}