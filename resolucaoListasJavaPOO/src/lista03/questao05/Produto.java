package lista03.questao05;

import java.util.Scanner;

public class Produto {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private float preco, desconto;
	private int quantidade;
	
	
	public void calcularDesconto() {
		System.out.println("--- Calculando desconto ---");
		System.out.println("- Dados do produto -");
		System.out.print("Nome: ");
		this.nome = sc.nextLine();
		System.out.print("Preço: R$ ");
		this.preco = sc.nextFloat();
		System.out.print("Quantidade comprada: ");
		this.quantidade = sc.nextInt();
		this.calculaDesconto(getPreco(), getQuantidade());
	}
	
	public float calculaDesconto(float preco, int quantidade) {
		
		if(quantidade == 10) {
			this.desconto = 0;
		} else if(quantidade >= 11 && quantidade <= 20) {
			this.desconto = preco * 0.1f;
			this.preco -= this.desconto;
		} else if(quantidade >= 21 && quantidade <= 50) {
			this.desconto = preco * 0.2f;
			this.preco -= this.desconto;
		} else if(quantidade > 50) {
			this.desconto = preco * 0.25f;
			this.preco -= this.desconto;
		}
		
		return this.preco;
	}
	
	public void apresentaDesconto() {
		System.out.printf(this.toString());
	}
	
	@Override
	public String toString() {
		return "\n- Resultado - \nNome do produto: " + this.getNome()
				+ "\nDesconto: R$" + this.getDesconto()
				+ "\nPreço final: R$" + this.getPreco();
	}

	public String getNome() {
		return nome;
	}
	public float getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public float getDesconto() {
		return desconto;
	}
}