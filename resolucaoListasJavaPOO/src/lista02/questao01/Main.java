/*
 * Enunciado
1. Identifique quais informações são importantes para uma conta bancária. Ela deve ter o nome do
titular, o número, a agência, o saldo e uma data de abertura. Desenvolva uma classe Conta que
deve conter pelo menos os seguintes métodos:
-  saca que recebe um valor como parâmetro e retira esse valor do saldo da conta.
- deposita que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta.
- calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo somados
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
		System.out.println("Número da conta:");
		conta.setNumConta(sc.next());
		sc.nextLine();
		System.out.println("Agência:");
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
		System.out.println("Valor do depósito: ");
		conta.setDeposito(sc.nextFloat());
		conta.depositar(conta.getDeposito());
		System.out.println("Novo saldo: " + conta.getSaldo());
		
		System.out.println();
		
		conta.rendimento();
		
		sc.close();
	}

}
