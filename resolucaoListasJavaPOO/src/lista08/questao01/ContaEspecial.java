package lista08.questao01;

public class ContaEspecial extends Conta {
	private double limite = 1000.00;
	char op;

	public ContaEspecial() {}

	public ContaEspecial(double saldo) {
		super(saldo);
	}

	@Override
	public void saque(double valor) {
		if(valor > super.getSaldo()) {
			System.out.println("N�o h� saldo dispon�vel!\nLimite dispon�vel: " + this.limite + "\nSacando do limite...");
					if(valor < this.limite) {
						this.limite -= valor;
						System.out.println("Limite atualizado: " + this.getLimite());
					} else {
						System.out.println("Saque imposs�vel!\n Seu limite �: " + this.getLimite());
					}
		} else {
			super.saque(valor);
		}
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
	
	public double getLimite() {
		return limite;
	}
}