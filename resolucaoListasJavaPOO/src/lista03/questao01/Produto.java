package lista03.questao01;

import java.util.Scanner;

public class Produto {
	Scanner sc = new Scanner(System.in);
	Pedido ped = new Pedido();
	
	private int codigo;
	private float preco;
	private int qntdEstoque;
	
	Produto(){}

	public Produto(int codigo, float preco, int qntdEstoque) {
		this.codigo = codigo;
		this.preco = preco;
		this.qntdEstoque = qntdEstoque;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQntdEstoque() {
		return qntdEstoque;
	}

	public void setQntdEstoque(int qntdEstoque) {
		this.qntdEstoque = qntdEstoque;
	}
	
	public void cadastrarProduto() {
		System.out.println("CADASTRO DE PRODUTO");
		System.out.print("Código: ");
		this.codigo = sc.nextInt();
		System.out.print("Preço: R$ ");
		this.preco = sc.nextFloat();
		System.out.println("Quantidade em estoque: ");
		this.qntdEstoque = sc.nextInt();
		System.out.println();
	}
	
	public int atualizandoEstoque(int qntdCompra, int cod) {
		if(this.codigo == cod) {
			this.qntdEstoque -= qntdCompra;
			return this.qntdEstoque;
		} else
			return 0;
	}
	
	public void novoStatusProduto() {
		System.out.printf("\nNOVO STATUS DO PRODUTO\n Código: %d\n Preço: R$%.2f\n Quantidade em estoque: %d", this.codigo, this.preco, this.qntdEstoque);
	}
}
