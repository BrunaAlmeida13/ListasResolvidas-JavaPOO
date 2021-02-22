package lista01.questao09;

public class MyMath {
	
	public int calculaFatorial(int calcFatorial) {
		int fat = 1;
		
		if(calcFatorial == 0) {
			fat = 1;
			return fat;
		} else {
			for(int x = calcFatorial; x >= 1; x--) {
				fat *= x;
			}
			return fat;
		}
	}
	
	public void maiorValor(float valorUm, float valorDois) {
		if(valorUm > valorDois)
			System.out.println("Esse é o maior valor: " + valorUm);
		else
			System.out.println("Esse é o maior valor: " + valorDois);
	}
	
	public boolean verificaPar(int valorPar){
		if(valorPar % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public void verificaPrimo(int valorPrimo) {
		int contDivisores = 0;
		
		for(int i = 1; i <= valorPrimo; i++) {
			if(valorPrimo % i == 0)
				contDivisores++;
		}
		if (contDivisores == 2)
			System.out.println("O número digitado é primo!");
		else
			System.out.println("O número digitado não é primo!");
	}
}
