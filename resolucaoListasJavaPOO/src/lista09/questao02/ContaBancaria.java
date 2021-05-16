package lista09.questao02;

import java.util.Scanner;

public abstract class ContaBancaria {
	private int senha;
	private int numero;
	protected double saldo;
	int testaSenha;
	Scanner sc = new Scanner(System.in);
	
	public ContaBancaria() {
		this.senha = 1234;
	}
	
	public ContaBancaria(int senha, int numero, double saldo) {
		this();
		this.numero = numero;
		this.saldo = saldo;
	}

	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);
	
	public abstract void tirarExtrato();
	
	public void alterarSenha(int novaSenha) {
		System.out.println("- Alterar senha - \nDigite a senha anterior: ");
		testaSenha = sc.nextInt();
			if(testaSenha == this.senha) {
				this.senha = novaSenha;
				System.out.println("Senha alterada com sucesso!");
			} else {
				System.out.println("Senha incorreta! Alteração cancelada.");
			}
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}