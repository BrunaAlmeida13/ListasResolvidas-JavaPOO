package lista03.questao03;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro();
		Pessoa pessoa = new Pessoa();
		Emprestimo emprestimo = new Emprestimo();
		int op;
		
		do {
			System.out.println("--- Menu ---");
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Mostrar lista de livros");
			System.out.println("3 - Cadastrar cliente");
			System.out.println("4 - Mostrar lista de clientes");
			System.out.println("5 - Realizar empréstimo de livro");
			System.out.println("6 - Empréstimos realizados");
			System.out.println("7 - Sair");
			System.out.println("-------------");
			op = sc.nextInt();
			switch (op) {
			case 1: {
				livro.cadastrarLivro();
				break;
			}
			case 2: {
				livro.mostrarLivros();
				break;
			}
			case 3: {
				pessoa.cadastrarCliente();
				break;
			}
			case 4: {
				pessoa.listaDeClientes();
				break;
			}
			case 5: {
				emprestimo.emprestimosDeLivros();
				break;
			}
			case 6: {
				emprestimo.emprestimosRealizados();
				break;
			}
			case 7: {	
				break;
			}
			default:
				System.out.println("Opção inválida!");
			}
		} while(op != 7);
		
		sc.close();
	}
}