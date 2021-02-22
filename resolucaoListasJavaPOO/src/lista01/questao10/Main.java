package lista01.questao10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		float soma;
		
		try {
			System.out.println("Digite um valor inteiro positivo:");
			n = sc.nextInt();
			
			soma = somarS(n);
			
			System.out.printf("Resultado da soma S = 1 + 1/2 ... + 1/n: %.2f", soma);
			
		} catch (InputMismatchException e) {
			System.out.println("O valor não é um inteiro positivo.");
		}
		
		sc.close();
	}

	public static float somarS(int n) {
		int i;
		float s = 0;
		
		for(i = 1; i <= n; i++) {
			s += 1/(float)i;
		}
		
		return s;
	}
}
