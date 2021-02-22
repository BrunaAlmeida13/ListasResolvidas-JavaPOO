package lista01.questao07;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cel;
		double far;
		
		System.out.print("Escreva a temperatura em graus Celsius: ° ");
		cel = sc.nextFloat();
		
		far = fahrnheit(cel);
		
		System.out.printf("A temperatura em Fahrenheit, é: %.2f°F.", far);
		
		sc.close();
	}
	
	public static double fahrnheit(double cel) {
		double far = (9 * cel + 160) / 5;
		return far;
	}
}
