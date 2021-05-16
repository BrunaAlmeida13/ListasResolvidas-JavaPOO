package lista10.questao01e02;

public class TestaArrays {

	public static void main(String[] args) {
		Conta conta;
		Conta[] contas = new Conta[10];
		double mediaSaldos = 0;
		double acumuloSaldos = 0;
		
		for (int i = 0; i < contas.length; i++) {
			conta = new Conta();
			conta.depositar(i);
			// escreva o c�digo para guardar a conta na posi��o i do array
			contas[i] = conta;
		}
		
		for(int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].getSaldo());
			acumuloSaldos += contas[i].getSaldo();
		}
		
		mediaSaldos = acumuloSaldos / contas.length;
		System.out.println("M�dia dos saldos: " + mediaSaldos);
	}
}