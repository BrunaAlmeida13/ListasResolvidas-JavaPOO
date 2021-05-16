package lista08.questao01;

public class Conta {

	protected double saldo = 0;
	
	public Conta() {}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public void saque(double valor) {
		if(valor > this.saldo) {
				System.out.println("Saque impossível! Saldo em conta: " + this.getSaldo());
		} else {
			this.saldo -= valor;
			System.out.println("Valor do saque: " + valor + "\nSaldo atualizado: " + this.getSaldo());
		}	
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}