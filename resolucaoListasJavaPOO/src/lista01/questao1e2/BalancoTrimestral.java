package lista01.questao1e2;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		float mediaMensal = gastosTrimestre/3;
		
		System.out.println(gastosTrimestre);
		System.out.printf("Valor da média mensal: %.2f\n", mediaMensal);
	}

}
