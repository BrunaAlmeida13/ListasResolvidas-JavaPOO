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
			// escreva o código para guardar a conta na posição i do array
			contas[i] = conta;
		}
		
		for(int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].getSaldo());
			acumuloSaldos += contas[i].getSaldo();
		}
		
		mediaSaldos = acumuloSaldos / contas.length;
		System.out.println("Média dos saldos: " + mediaSaldos);
	}
}