package lista02.questao01;

public class Conta {
	private String titular;
	private String  numConta;
	private String  ag;
	private float saldo = 1500.00f;
	private String abertura;
	private float saque;
	
	Conta(){}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String  getAg() {
		return ag;
	}

	public void setAg(String  ag) {
		this.ag = ag;
	}

	public String getAbertura() {
		return abertura;
	}

	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}

	public float getSaldo() {
		return saldo;
	}

	public float getSaque() {
		return saque;
	}

	public void setSaque(float saque) {
		this.saque = saque;
	}
	
	public float sacar(float saque){
		if(saque > saldo)
			System.out.println("[Erro] Saque maior que o saldo da conta!");
		else
			saldo -= saque;
		return saldo;
	}
	
}
