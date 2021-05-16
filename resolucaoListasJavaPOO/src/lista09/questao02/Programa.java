package lista09.questao02;

public class Programa {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200.00);
		cc.sacar(50.00);
		System.out.println(cc.getSaldo());
		cc.alterarSenha(12233);
	}
}