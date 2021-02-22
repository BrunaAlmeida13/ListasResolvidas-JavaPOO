package lista01.questao03;

import java.util.Scanner;

public class PrecoDeVenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float precoCompra;
		float precoDeVenda;
		float lucro;
		
		System.out.println("Coloque o preço de compra da mercadoria: ");
		precoCompra = sc.nextFloat();
		
		precoDeVenda = precoCompra * 1.30f; 
		lucro = precoDeVenda - precoCompra;
		
		System.out.println("Preço de compra da mercadoria: " + precoCompra);
		System.out.println("Preço de venda da mercadoria: " + precoDeVenda);
		System.out.printf("Total do lucro obtido: %.2f", lucro);
		
		sc.close();
	}

}
