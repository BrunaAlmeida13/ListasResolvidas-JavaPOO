package lista10.questao01e02;

public class Conta {
	private double saldo;
	
	public void depositar(double valor) {
		this.saldo += valor * 100;
	}
	
	public double getSaldo() {
		return saldo;
	}
}