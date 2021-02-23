/*
 * Enunciado
1. Identifique quais informa��es s�o importantes para uma conta banc�ria. Ela deve ter o nome do
titular, o n�mero, a ag�ncia, o saldo e uma data de abertura. Desenvolva uma classe Conta que
deve conter pelo menos os seguintes m�todos:
-  saca que recebe um valor como par�metro e retira esse valor do saldo da conta.
- deposita que recebe um valor como par�metro e adiciona esse valor ao saldo da conta.
- calculaRendimento que n�o recebe par�metro algum e devolve o valor do saldo somados
10%.
 */
package lista02.questao01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("Digite os dados da conta: ");
		System.out.println("Nome do titular: ");
		conta.setTitular(sc.next());
		sc.nextLine();
		System.out.println("N�mero da conta:");
		conta.setNumConta(sc.next());
		sc.nextLine();
		System.out.println("Ag�ncia:");
		conta.setAg(sc.next());
		System.out.println("Data de abertura");
		System.out.println("Formato dd/MM/aaaa");
		conta.setAbertura(sc.nextLine());
		sc.nextLine();
		
		System.out.println();
		
		System.out.print("Saldo atual: " + conta.getSaldo());
		System.out.printf("\nValor para saque: ");
		conta.setSaque(sc.nextFloat());
		conta.sacar(conta.getSaque());
		System.out.println("Novo saldo: " + conta.getSaldo());
		
		System.out.println();
		
		System.out.println("Saldo atual: " + conta.getSaldo());
		System.out.println("Valor do dep�sito: ");
		conta.setDeposito(sc.nextFloat());
		conta.depositar(conta.getDeposito());
		System.out.println("Novo saldo: " + conta.getSaldo());
		
		System.out.println();
		
		conta.rendimento();
		
		sc.close();
	}

}
