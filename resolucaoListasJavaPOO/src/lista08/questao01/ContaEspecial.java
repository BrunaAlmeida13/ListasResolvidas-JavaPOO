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
			System.out.println("Não há saldo disponível!\nLimite disponível: " + this.limite + "\nSacando do limite...");
					if(valor < this.limite) {
						this.limite -= valor;
						System.out.println("Limite atualizado: " + this.getLimite());
					} else {
						System.out.println("Saque impossível!\n Seu limite é: " + this.getLimite());
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