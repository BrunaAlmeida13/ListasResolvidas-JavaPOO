package lista01.questao8;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int resultado;
		
		System.out.println("Digite um valor inteiro");
		valor = sc.nextInt();
		
		resultado = somatorio(valor);
		
		System.out.println("O resultado da soma é: " + resultado);
		
		sc.close();
	}
	
	public static int somatorio(int valor) {
		int soma = 0;
		for(int x = valor; x >= 0; x--) {
			soma += x; 
		}
		return soma;
	}
}
