package lista07.questao02;

public class Programa {

	public static void main(String[] args) {
		TrianguloRetangulo tr = new TrianguloRetangulo();
		Retangulo r = new Retangulo();
		
		double resultado = tr.calculo(3, 4);
		System.out.println("�rea do tri�ngulo ret�ngulo: " + resultado);
		
		double resultado2 = r.calculo(2, 3);
		System.out.println("�rea do ret�ngulo: " + resultado2);
		
	}
}