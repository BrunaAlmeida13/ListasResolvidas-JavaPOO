package lista01.questao6;

import java.util.Scanner;

public class CalularDivida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valorInicialDivida;
		float parcelas;
		float taxaJurosMensal;
		float jurosDeci;
		float juros = 0;
		
		System.out.println("Valor da sua dívida: R$");
		valorInicialDivida = sc.nextFloat();
		System.out.println("Quantidade de parcelas:");
		parcelas = sc.nextFloat();
		System.out.println("Valor da taxa de juros mensal: % ");
		taxaJurosMensal = sc.nextFloat();
		
		jurosDeci = convertePorcentagem(taxaJurosMensal);
		juros = calculaDivida(valorInicialDivida, parcelas, jurosDeci);
		
		System.out.println("O valor do juros é: R$ " + juros);
		
		sc.close();
	}
	
	public static float convertePorcentagem(float taxaJurosMensal) {
		float jurosDecimal = taxaJurosMensal / 100;
		return jurosDecimal;
	}
	
	public static float calculaDivida(float valorInicialDivida, float parcelas, float jurosDeci){
		float juros = (valorInicialDivida * jurosDeci * parcelas) / parcelas;
		return juros;
	}
}
