package lista03.questao01;

import java.util.Scanner;

public class Pedido {
	Scanner sc = new Scanner(System.in);
	
	private int codProduto;
	private int qntdCompra;
	private int formaPgto;
	private String formaPagamento;
	
	Pedido(){}

	public Pedido(int codProduto, int qntdCompra, int formaPgto, String formaPagamento) {
		this.codProduto = codProduto;
		this.qntdCompra = qntdCompra;
		this.formaPgto = formaPgto;
		this.formaPagamento = formaPagamento;
	}


	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getQntdCompra() {
		return qntdCompra;
	}

	public void setQntdCompra(int qntdCompra) {
		this.qntdCompra = qntdCompra;
	}
	
	public int getFormaPgto() {
		return formaPgto;
	}

	public void setFormaPgto(int formaPgto) {
		this.formaPgto = formaPgto;
	}
	
	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void venda() {
		System.out.println("VENDA:");
		System.out.print("Código do produto: ");
		this.codProduto = sc.nextInt();
		System.out.print("Quantidade: ");
		this.qntdCompra = sc.nextInt();
		System.out.println("Tipo de pagamento:");
		System.out.printf("1 - Dinheiro \n2 - Cheque \n3 - Cartão\n");
		do {
			this.formaPgto = sc.nextInt();
			
			switch (this.formaPgto) {
			case 1:
				if(this.formaPgto == 1)
					this.formaPagamento = "Dinheiro"; 
				break;
			
			case 2:
				if(this.formaPgto == 2)
					this.formaPagamento = "Cheque";
				break;
			case 3: 
				if(this.formaPgto == 3)
					this.formaPagamento = "Cartão"; 
				break;
			default:
				System.out.println("Número inválido! Digite novamente.");
			}
		}while(this.formaPgto != 1 && this.formaPgto != 2 && this.formaPgto != 3);		
	}
	
	public void apresentaVenda() {
		System.out.printf("\nSTATUS VENDA: \nCódigo do produto: %d \nQuantidade de itens: %d \nTipo de Pagamento: %s\n", this.codProduto, this.qntdCompra, this.formaPagamento);
	}
	
}
