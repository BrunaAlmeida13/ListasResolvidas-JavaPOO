package lista03.questao04;

import java.util.Scanner;

public class CalculadoraDeInvestimentoFinanceiro {
	Scanner sc = new Scanner(System.in);
	private float investimentoMensal;
	private float taxaJuros;
	private float retornoFinanceiro;
	
	public void entradaDadosEResultado() {
		System.out.println("--- Calculando investimento ---");
		System.out.print("Investimento mensal: R$ ");
		this.investimentoMensal = sc.nextFloat();
		System.out.print("Taxa de juros mensal: % ");
		this.taxaJuros = sc.nextFloat();
		this.calculadora();
	}
	
	public void calculadora() {
		int j = 1;
		char op;
		this.taxaJuros /= 100;
		
		do {
			this.retornoFinanceiro = (this.investimentoMensal + this.taxaJuros) * 12;
	
			System.out.printf("\nSaldo do investimento após %d ano(s): %f\n", j, this.getRetornoFinanceiro());
			
			System.out.print("Deseja processar mais um ano? (S/N) ");
			op = sc.next().charAt(0);
				if(op == 's' || op == 'S')
					j++;
		}while(op == 's' || op == 'S');
	}
	
	public float getInvestimentoMensal() {
		return investimentoMensal;
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}
	
	public float getRetornoFinanceiro() {
		return retornoFinanceiro;
	}
}