package lista07.questao01;

import java.util.Scanner;

public class Professor extends Funcionario {
	Scanner sc = new Scanner(System.in);
	private String titulacao;
	int opTitulacao;
	Funcionario funcionario = new Funcionario();
	
	public Professor() {}

	public void registraProfessor() {
		System.out.printf("Titulação: \n1 - Doutor\n2 - Mestre\n3 - Especialista\n> ");
		do {
			opTitulacao = sc.nextInt();
			switch (opTitulacao) {
			case 1: {
				this.titulacao = "Doutor";
				break;
			}
			case 2: {
				this.titulacao = "Mestre";
				break;
			}
			case 3: {
				this.titulacao = "Especialista";
				break;
			}
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while(opTitulacao != 1 && opTitulacao != 2 && opTitulacao != 3);	
	}

	public String getImpostoRenda(double salario) {
		double impostoRenda = (salario * 23) / 100;
		return "\nCalculo do Imposto de renda: R$ " + impostoRenda;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}