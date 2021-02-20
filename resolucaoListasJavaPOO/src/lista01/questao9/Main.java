package lista01.questao9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMath mm = new MyMath();
		int calcFatorial;
		int fatorial;
		
		System.out.println("Digite um número inteiro para calcular seu fatorial");
		calcFatorial = sc.nextInt();
		
		fatorial = mm.calculaFatorial(calcFatorial);
		System.out.println("O fatorial de " + calcFatorial + "! é: " + fatorial);
		
		sc.close();
	}

}
