package lista03.questao01;

import java.util.Scanner;

public class Supermercado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();
		Pedido ped = new Pedido();
		int escolha = 0;
		
		System.out.println("MENU");
		System.out.printf("1- Cadastrar produto \n2- Venda\n");
		escolha = sc.nextInt();
			switch (escolha) {
				case 1: {
					prod.cadastrarProduto();
					break;
				}
				case 2:{
					ped.venda();
				}
				default:{
					System.out.println("Número inválido!");
				}
			}
			
			ped.apresentaVenda();
			
		sc.close();
	}
}