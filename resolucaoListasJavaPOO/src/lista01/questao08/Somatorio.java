package lista01.questao08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int resultado;
		
		try {
			
			System.out.println("Digite um valor inteiro positivo");
			valor = sc.nextInt();
			
			resultado = somatorio(valor);
			
			System.out.printf("O resultado do somatório do número %d é: %d", valor, resultado);
			
		} catch (InputMismatchException e) {
			System.out.println("O valor não é um inteiro positivo.");
		}
		
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
