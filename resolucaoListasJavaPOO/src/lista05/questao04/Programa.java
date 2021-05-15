package lista05.questao04;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setTitular("Anna");
		conta.setNumero(22);
		conta.setAgencia(2345);
		conta.depositar(200.00);
		System.out.printf("Titular: %s \nSaldo em conta: %.2f", conta.getTitular(), conta.getSaldo());
		conta.sacar(10.00);
		System.out.printf("\nTitular: %s \nSaldo em conta: %.2f", conta.getTitular(), conta.getSaldo());

	}
}