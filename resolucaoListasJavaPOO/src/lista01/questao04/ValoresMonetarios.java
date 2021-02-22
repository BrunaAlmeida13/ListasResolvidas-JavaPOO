package lista01.questao04;

import java.util.Scanner;

public class ValoresMonetarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valorUm;
		float valorDois;
		float porcentagem;
		
		System.out.println("Informe o primeiro valor:");
		valorUm = sc.nextFloat();
		
		System.out.println("Informe o segundo valor:");
		valorDois = sc.nextFloat();
		
		if(valorUm > valorDois)
			porcentagem = (valorDois * 100)/valorUm;
		else
			porcentagem = (valorUm * 100)/valorDois;
		
		System.out.println("O menor valor representa " + porcentagem + "% do maior valor");
		
		sc.close();
	}

}
