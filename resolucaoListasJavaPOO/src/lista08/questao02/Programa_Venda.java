package lista08.questao02;

public class Programa_Venda {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		Vendedor v = new Vendedor();
		
		double ganho = g.venda(100.00);
		double ganho2 = v.venda(100.00);
		
		System.out.println("Ganho do gerente: R$ " + ganho + "\nGanho do vendedor: R$ " + ganho2);

	}
}