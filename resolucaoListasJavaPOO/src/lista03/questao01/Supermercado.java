package lista03.questao01;

import java.util.Scanner;

public class Supermercado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();
		Pedido ped = new Pedido();
		
		prod.cadastrarProduto();

		ped.venda();
		
		prod.atualizandoEstoque(ped.getQntdCompra(), ped.getCodProduto());
		
		ped.apresentaVenda();
		
		prod.novoStatusProduto();
			
		sc.close();
	}
}