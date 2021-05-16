package lista09.questao02;

public class ContaCorrente extends ContaBancaria {
	private int qntdeTransacoes;
	
	public void sacar(double valor) {
		if(valor > super.saldo)
			System.out.println("Saque impossível!");
		else
			super.saldo -= valor;
	}
	
	public void depositar(double valor) {
		super.saldo += valor;
	}
	
	public void tirarExtrato() {
		System.out.println("Saldo: " + super.getSaldo());
	}
	
	public int getQntdeTransacoes() {
		return qntdeTransacoes;
	}
	public void setQntdeTransacoes(int qntdeTransacoes) {
		this.qntdeTransacoes = qntdeTransacoes;
	}	
}