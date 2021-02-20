package lista01.questao9;

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
}
