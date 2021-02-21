package lista01.questao9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMath mm = new MyMath();
		int calcFatorial;
		int fatorial;
		float valorUm;
		float valorDois;
		int valorPar;
		boolean verifica;
		int valorPrimo;
		
		System.out.println("Digite um número inteiro para calcular seu fatorial");
		calcFatorial = sc.nextInt();
		fatorial = mm.calculaFatorial(calcFatorial);
		System.out.println("O fatorial de " + calcFatorial + "! é: " + fatorial);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Descobrindo o maior número...");
		System.out.println("Digite o primeiro valor:");
		valorUm = sc.nextFloat();
		System.out.println("Digite o segundo valor:");
		valorDois = sc.nextFloat();
		mm.maiorValor(valorUm, valorDois);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Descobrindo se o número é par...");
		System.out.println("Digite um valor inteiro positivo:");
		valorPar = sc.nextInt();
		verifica= mm.verificaPar(valorPar);
		System.out.println("Par? " + verifica);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Descobrindo se o número é primo...");
		System.out.println("Digite um valor inteiro positivo:");
		valorPrimo = sc.nextInt();
		mm.verificaPrimo(valorPrimo);
		
		sc.close();
	}

}
