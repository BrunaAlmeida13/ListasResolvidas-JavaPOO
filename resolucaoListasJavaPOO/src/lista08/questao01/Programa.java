package lista08.questao01;

public class Programa {

	public static void main(String[] args) {
		Conta c = new Conta();
		ContaEspecial ce = new ContaEspecial();
		
		c.depositar(500.00);
		ce.depositar(1000.00);
		System.out.println();
		c.saque(400.00);
		System.out.println();
		ce.saque(1000.00);
		System.out.println();
		ce.saque(200.00);
	}
}