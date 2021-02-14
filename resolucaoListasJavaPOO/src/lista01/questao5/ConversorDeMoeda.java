package lista01.questao5;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		float valor;
		float cotacaoDolar;
		float cotacaoEuro;
		float convDolar;
		float convEuro;
		
		System.out.println("Informe o valor a ser convertido:");
		valor = sc.nextFloat();
		System.out.println("Digite a cotação do dólar americano:");
		cotacaoDolar = sc.nextFloat();
		System.out.println("Digite a cotação do euro:");
		cotacaoEuro = sc.nextFloat();
		
		convDolar = valor / cotacaoDolar;
		convEuro = valor / cotacaoEuro;
		
		System.out.printf("Valor convertido para dólar: $ %.2f\n", convDolar);
		System.out.printf("Valor convertido para euro: € %.2f", convEuro);

		
		sc.close();
	}

}
